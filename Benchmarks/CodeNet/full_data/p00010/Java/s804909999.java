import java.util.Scanner;

public class Main{
	static double power(double x, double y){
		return x*x + y*y;
	}

	static double cast(double x){
		double y = 1000*x;
		int z = (int) y;
		if( 10*(y-z) >= 5 ){
			x = (double) (z+1)/1000;
		}
		else 
			x = (double) z/1000;
		return x;
	}

	static void output(double[] x){
		System.out.printf("%.3f %.3f %.3f%n",cast(x[0]),cast(x[1]),cast(x[2]));
	}

	static double[] circle(double[] a, double[] b, double[] c){
		double x1 = a[0] - b[0];  // a-c
		double x2 = b[0] - c[0];  // c-e
		double x3 = a[0] + b[0];  // a+c
		double x4 = b[0] + c[0];  // c+e
		double y1 = a[1] - b[1];  // b-d
		double y2 = b[1] - c[1];  // d-f
		double y3 = a[1] + b[1];  // b+d
		double y4 = b[1] + c[1];  // d+f
		
		double[] result = new double[3];
		if( y1 == 0 ){
			result[0] = x3/2;
			result[1] = (-x2*(x1+x2)+y2*y4)/(2*y2);
		} else if ( y2 == 0 ){
			result[0] = x4/2;
			result[1] = (x1*(x1+x2)+y1*y3)/(2*y1);
		} else {
			result[0] = (y1*y2*(-(y1+y2))+x2*y1*x4-x3*y2*x1)/(2*(x2*y1-x1*y2));
			result[1] = (x1*x2*(-(x1+x2))+y2*x1*y4-y3*x2*y1)/(2*(y2*x1-y1*x2));
		}
		result[2] = Math.sqrt(power(a[0]-result[0], a[1]-result[1]));
		return result;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String[] str = new String[n+1];
		String[][] p = new String[n][6];
		double[][] a = new double[n][2];
		double[][] b = new double[n][2];
		double[][] c = new double[n][2];
		
		for(int i = 0; i < n+1; i++){
			str[i] = stdIn.nextLine();
		}
		for(int i = 0; i < n; i++){
			p[i] = str[i+1].split(" ");
			for(int j = 0; j < 2; j++){
				a[i][j] = Double.parseDouble(p[i][j]);
				b[i][j] = Double.parseDouble(p[i][j+2]);
				c[i][j] = Double.parseDouble(p[i][j+4]);
			}
		}
		
		for(int i = 0; i < n-1; i++){
			output(circle(a[i], b[i], c[i]));
		}
		output(circle(a[n-1], b[n-1], c[n-1]));
	}
}