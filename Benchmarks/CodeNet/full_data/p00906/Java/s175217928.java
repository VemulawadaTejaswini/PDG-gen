import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[][] A = new int[50][50];
	int[][] B = new int[50][50];
	int[][] T = new int[50][50];
	int n, mod;
	
	void mult(int[][] C, int[][] D) {
		for (int i = 0; i < n; i++)
			Arrays.fill(T[i], 0);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					T[i][j] = (T[i][j] + C[i][k]*D[k][j]) % mod;
				}
			}
		}
	}
	
	void subst(int[][] C, int[][] D) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				C[i][j] = D[i][j];
			}
		}
	}
	
	void pow(int t) {
		for (int i = 0; i < n; i++) {
			Arrays.fill(B[i], 0);
			B[i][i] = 1;
		}
		while (t > 0) {
			if ((t & 1) == 1) {
				mult(A, B);
				subst(B, T);
			}
			mult(A, A);
			subst(A, T);
			t >>= 1;
		}
	}
	
	void run() {
		int[] stat = new int[50];
		while (true) {
			n = sc.nextInt();
			mod = sc.nextInt();
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			int t = sc.nextInt();
			if (n == 0) break;

			for (int i = 0; i < n; i++)
				stat[i] = sc.nextInt();
			
			Arrays.fill(A[0], 0);
			A[0][0] = b; A[0][1] = c;
			for (int i = 1; i < n-1; i++) {
				Arrays.fill(A[i], 0);
				A[i][i-1] = a;
				A[i][i] = b;
				A[i][i+1] = c;
			}
			Arrays.fill(A[n-1], 0);
			A[n-1][n-2] = a;
			A[n-1][n-1] = b;
			
			pow(t);
			
			int res = 0;
			for (int i = 0; i < n; i++) {
				res = (res + B[0][i]*stat[i]) % mod;
			}
			out.print(res);
			for (int i = 1; i < n; i++) {
				res = 0;
				for (int j = 0; j < n; j++) {
					res = (res + B[i][j]*stat[j]) % mod;
				}
				out.printf(" %d", res);
			}
			out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}