import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	List<Integer>[] paths;
	double[] dp = new double[650];
	int N,M;
	double res = 1<<60;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt();
		M = nextInt();
		paths = new List[N+1];
        for (int i=0;i<=N;i++) {
            paths[i] = new ArrayList<>();
        }

		for(int i=1;i<=M;i++) {
			int s,t;
			s = nextInt();
			t = nextInt();
			paths[s].add(t);
		}
	    for(int i=0;i<N;i++) {
	        f(i);
	    }
	    out.println(res);
	}

	void f(int block) {
	    dp[N] = 0;
	    for(int i=N-1;i>=1;i--) {
	        double sum = 0.0;
	        double maxi = 0.0;
	        int num = paths[i].size();
	        for(Integer to : paths[i]) {
	        	out.println(to);
	            sum += dp[to];
	            maxi = Math.max(maxi, dp[to]);
	        }
	        if(i == block && num >= 2) {
	            num--;
	            sum -= maxi;
	        }
	        dp[i] = sum / num + 1;
	    }
	    res = Math.min(res, dp[1]);
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}
}