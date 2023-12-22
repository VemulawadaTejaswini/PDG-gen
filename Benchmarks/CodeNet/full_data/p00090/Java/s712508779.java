import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n;
		while( (n = stdIn.nextInt()) != 0 ){
			String[][] s = new String[n][2];
			for(int i = 0; i < n; i++){
				s[i] = stdIn.next().split(",");
			}
			double[][] center = new double[n][2];
			for(int i = 0; i < n; i++){
				center[i][0] = Double.parseDouble(s[i][0]);
				center[i][1] = Double.parseDouble(s[i][1]);
			}
			boolean[][] check = new boolean[n][n];
			double[][] t = new double[n][n];
			for(int i = 0; i < n; i++){
				for(int j = i+1; j < n; j++){
					double x = (center[i][0]-center[j][0])*(center[i][0]-center[j][0])+(center[i][1]-center[j][1])*(center[i][1]-center[j][1]);
					if( x <= 4 ){
						check[i][j] = true;
						t[i][j] = Math.sqrt(4-x)/(2*Math.sqrt(x));
					}
				}
			}
			int max = 1;
			for(int i = 0; i < n; i++){
				for(int j = i+1; j < n; j++){
					if( check[i][j] ){
						double px1 = (center[j][0]-center[i][0])/2 + (center[j][1]-center[i][1])*t[i][j]+center[i][0];
						double py1 = (center[j][1]-center[i][1])/2 + (center[i][0]-center[j][0])*t[i][j]+center[i][1];
						double px2 = (center[j][0]-center[i][0])/2 - (center[j][1]-center[i][1])*t[i][j]+center[i][0];
						double py2 = (center[j][1]-center[i][1])/2 - (center[i][0]-center[j][0])*t[i][j]+center[i][1];
						int max1 = 1;
						int max2 = 1;
						for(int k = 0; k < n; k++){
							if( check[i][k] ){
								if( ((px1-center[k][0])*(px1-center[k][0])+(py1-center[k][1])*(py1-center[k][1])) <= 1 ){
									max1++;
								}
								if( ((px2-center[k][0])*(px2-center[k][0])+(py2-center[k][1])*(py2-center[k][1])) <= 1 ){
									max2++;
								}
							}
						}
						if( max1 > max ){
							max = max1;
						}
						if( max2 > max ){
							max = max2;
						}
					}
				}
			}
			System.out.println(max);
		}
	}
}