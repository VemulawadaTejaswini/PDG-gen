import java.util.Scanner;
import java.io.*;

public class Main{
	public static int judge(double[] x, double[] y, double[] p){
		double a = 0;
		if( x[0] != y[0] ){
			a = ((y[1]-x[1])/(y[0]-x[0]))*(p[0]-x[0])+x[1];
		}
		if( x[0] == y[0] ){
			if( p[0] < x[0] ){
				return -1;
			} else if( p[0] > x[0] ){
				return 1;
			} else {
				return 0;
			}
		}
		if( a < p[0] ){
			return 1;
		} else if( a > p[0] ){
			return -1;
		} else {
			return 0;
		}
	}
		
	public static String solve(double[][] x, double[] p){
		for(int i = 0; i < 3; i++){
			int max = i;
			for(int j = i+1; j < 3; j++){
				if( x[j][0] > x[max][0] || ( x[j][0] == x[max][0] && x[j][1] < x[max][1] ) ){
					max = j;
				}
			}
			double tempX = x[max][0];
			double tempY = x[max][1];
			x[max][0] = x[i][0];
			x[max][1] = x[i][1];
			x[i][0] = tempX;
			x[i][1] = tempY;
		}
		int key = judge(x[0], x[2], p);
		if( key*judge(x[0], x[1], p) <= 0 && key*judge(x[1], x[2], p) <= 0 ){
			return "YES";
		} else {
			return "NO";
		}
	}
	
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			double[][] x = new double[3][2];
			double[] p = new double[2];
			String[] result = new String[100];
			
			while( stdIn.hasNext() ){
				if( stdIn.hasNextDouble() ){
					for(int i = 0; i < 3; i++){
						for(int j = 0; j < 2; j++){
							x[i][j] = stdIn.nextDouble();
						}
					}
					p[0] = stdIn.nextDouble();
					p[1] = stdIn.nextDouble();
					result[index] = solve(x,p);
					index++;
				} else {
					stdIn.next();
				}
			}
			
			for(int i = 0; i < index; i++){
				System.out.println(result[i]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}