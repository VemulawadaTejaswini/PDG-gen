
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long c=sc.nextLong();
		long x[] = new long[n];
		long v[] = new long[n];
		for(int i=0; i<n; i++) {
			x[i]=sc.nextLong();
			v[i]=sc.nextLong();
		}

		//反時計->時計
		long sum[] = new long[n+1];
		long cal[] = new long[n+1];
		long g[] = new long[n+1];
		for(int i=0; i<n; i++) {
			sum[i+1]=sum[i]+v[i];
			cal[i+1]=sum[i+1]-x[i];
			g[i+1]=Math.max(g[i], cal[i+1]);
		}

		long sum2[] = new long[n+1];
		long cal2[] = new long[n+1];
		for(int i=0; i<n; i++) {
			sum2[i+1]=sum2[i]+v[n-1-i];
			cal2[i+1]=sum2[i+1]-(2*(c-x[n-i-1]));
		}

		//時計->反時計
		long sum3[] = new long[n+1];
		long cal3[] = new long[n+1];
		long g2[] = new long[n+1];
		for(int i=0; i<n; i++) {
			sum3[i+1]=sum3[i]+v[i];
			cal3[i+1]=sum3[i+1]-(2*x[i]);
			g2[i+1]=Math.max(g2[i], cal3[i+1]);
		}

		long sum4[] = new long[n+1];
		long cal4[] = new long[n+1];
		for(int i=0; i<n; i++) {
			sum4[i+1]=sum4[i]+v[n-1-i];
			cal4[i+1]=sum4[i+1]-(c-x[n-i-1]);
		}

		long ans = -1001001001;
		for(int i=0; i<n; i++) {
			ans = Math.max(ans, cal2[i] + g[n-i]);
		}
		for(int i=0; i<n; i++) {
			ans = Math.max(ans, cal4[i] + g2[n-i]);
		}
		System.out.println(ans);
		sc.close();
	}
}
