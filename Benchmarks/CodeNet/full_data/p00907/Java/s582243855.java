import java.util.Scanner;

public class Main {
	public static double EPS = 1E-6;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int d = sc.nextInt();
			if (d == 0) {
				break;
			}
			double[] v = new double[d+3];
			for(int i=0;i<d+3;i++) {
				v[i] = sc.nextDouble();
			}
			for(int i=0;i<(1<<d+3);i++) {
				if (Integer.bitCount(i) != d+1) {
					continue;
				}
				double[][] a = new double[d+1][d+1];
				double[] b = new double[d+1];
				int i_ = 0;
				for(int x=0;x<d+3;x++) {
					if ((i&(1<<x)) == 0) {
						continue;
					}
					for(int j=0;j<=d;j++) {
						a[i_][j] = Math.pow(x, j);
					}
					b[i_] = v[x];
					i_++;
				}
				double[] c = Matrix.solveEquation(a, b);

				int countS = 0;
				int countL = 0;
				int errorI = -1;
				for(int x=0;x<d+3;x++) {
					if ((i&(1<<x)) != 0) {
						continue;
					}
					double y = 0;
					for(int j=0;j<=d;j++) {
						y += c[j] * Math.pow(x, j);
					}
					double error = Math.abs(y - v[x]);
					if (error < 1E-6 + EPS) {
						countS++;
					}else if (error >= 1 - EPS) {
						countL++;
						errorI = x;
					}
				}
				if (countS == 1 && countL == 1) {
					System.out.println(errorI);
					break;
				}
			}
		}
	}

}

class Matrix {
	public static final double EPS = 1E-8;
	public static double[][] add(double[][] a,double[][] b) {
		int n = a.length;
		int m = a[0].length;
		double[][] c = new double[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	public static double[][] muliply(double[][] a,double k) {
		int n = a.length;
		int m = a[0].length;
		double[][] c = new double[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i][j] = a[i][j] * k;
			}
		}
		return c;
	}
	public static double[][] muliply(double[][] a,double[][] b) {
		int n = a.length;
		int m = b[0].length;
		double[][] c = new double[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				for(int k=0;k<n;k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
	//disruptive
	public static double[] solveEquation(double[][] A,double[] b) {
		int n = A.length;
		double[][] B = new double[n][n+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				B[i][j] = A[i][j];
			}
			B[i][n] = b[i];
		}
		for(int i=0;i<n;i++) {
			int pivot = i;
			for(int j=i;j<n;j++) {
				if (Math.abs(B[j][i]) > Math.abs(B[pivot][i])) {
					pivot = j;
				}

			}
			swapRow(B, i, pivot);
			if (Math.abs(B[i][i]) < EPS) {
				return null;
			}
			for(int j=i+1;j<=n;j++) {
				B[i][j] /= B[i][i];
			}
			for(int j=0;j<n;j++) {
				if (i==j) {
					continue;
				}
				for(int k=i+1;k<=n;k++) {
					B[j][k] -= B[j][i] * B[i][k];
				}
			}
		}
		double[] x = new double[n];
		for(int i=0;i<n;i++) {
			x[i] = B[i][n];
		}
		return x;
	}
	public static void swapRow(double[][] A,int i,int j) {
		double[] temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}