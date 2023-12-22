import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static final double eps = 1E-8;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		while(sc.hasNext()) {
			double[][] a = new double[2][2];
			double[] b = new double[2];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					a[i][j] = sc.nextInt();
				}
				b[i] = sc.nextInt();
			}
			double[] x = solveEquation(a, b);
			System.out.println(df.format(x[0]) + " " + df.format(x[1]));
		}
	}
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
			if (Math.abs(B[i][i]) < eps) {
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