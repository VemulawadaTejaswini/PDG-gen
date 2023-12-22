import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn= null;
		stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int[][] x = new int[10000][6];
		int i = 0;
		while( stdIn.hasNext() ){
			if( stdIn.hasNextInt() ){
				for(int j = 0; j < 6; j++){
					x[i][j] = stdIn.nextInt();
				}
			}else{
				stdIn.next();
			}
			i++;
		}
		for(int j = 0; j < i; j++){
			int denom = x[j][0]*x[j][4] - x[j][1]*x[j][3];
			int numX = x[j][2]*x[j][4] - x[j][1]*x[j][5];
			int numY = x[j][0]*x[j][5] - x[j][2]*x[j][3];
			
			double ansX = numX == 0 ? Math.abs((double)numX/denom) : (double) numX/denom;
			double ansY = numY == 0 ? Math.abs((double)numY/denom) : (double) numY/denom;
			System.out.printf("%.4f %.4f%n",ansX, ansY);
		}
	}
}