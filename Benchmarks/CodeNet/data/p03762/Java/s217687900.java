import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long x[] = new long[n];
		long y[] = new long[m];
		for(int i=0; i<n; i++) x[i]=sc.nextLong();
		for(int i=0; i<m; i++) y[i]=sc.nextLong();
		long mod = 1000000007;
		long sumx = 0;
		for(int i=0; i<n; i++) {
			sumx += ((2*i-n+1) * x[i]) % mod;
			sumx %= mod;
		}
		long sumy = 0;
		for(int i=0; i<m; i++) {
			sumy += ((2*i-m+1) * y[i]) % mod;
			sumy %= mod;
		}
		long ans = (sumx * sumy) % mod;
		ans %= mod;
		System.out.println(ans);
		sc.close();
	}

}
