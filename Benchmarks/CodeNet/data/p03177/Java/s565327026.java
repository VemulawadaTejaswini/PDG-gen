
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long a[][] = new long[n][n];
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++)
				a[i][j] = sc.nextLong();
		
		long r[][] = Pow(n,a,k,1000000007);
		System.out.println(Sum(n,r,1000000007));
	}

	private static long Sum(int n, long[][] a, int mod) {
		long sum = 0;
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++)
				sum = (sum + a[i][j]) % mod;
		return sum;
	}

	private static long[][] Pow(int n, long[][] a, long k, int mod) {
		if (k == 0) return I(n);
		else {
			long r[][] = Pow(n,a,k/2,mod);
			r = Mul(n,r,r,mod);
			if (k%2==1) r = Mul(n,r,a,mod);
			return r;
		}
		
	}

	private static long[][] Mul(int n, long[][] a, long[][] b,int mod) {
		long r[][] = new long[n][n];
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++) {
				r[i][j] = 0;
				for (int k=0;k<n;k++)
					r[i][j]=(r[i][j]+(a[i][k]*b[k][j])%mod)%mod;
			}
					
		return r;
	}

	private static long[][] I(int n) {
		long r[][] = new long[n][n];
		for (int i=0;i<n;i++)
			r[i][i] = 1;
		return r;
	}

}
