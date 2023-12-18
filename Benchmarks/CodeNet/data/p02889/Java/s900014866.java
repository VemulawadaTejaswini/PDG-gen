import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	static final long INF = (long) 1e+17;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		sc.close();
		System.exit(0);
	}

	void solve() {
		int N = nextInt(); // N個の町
		int M = nextInt(); // M本の道
		long L = nextLong(); // 燃料タンクの容量

		long[][] fuel = new long[305][305];
		long[][] dist = new long[305][305];
		int[] A = new int [100000];
		int[] B = new int [100000];
		int[] C = new int [100000];
		int[] s = new int[105000];
		int[] t = new int[105000];
		for(int i=1;i<=M;i++) {
			A[i]=nextInt();
			B[i]=nextInt();
			C[i]=nextInt();
		}
		int Q = nextInt();

		for(int i=1;i<=Q;i++) {
			s[i] = nextInt();
			t[i] = nextInt();
		}

	    for(int i = 1; i <= N; i++) {
	        for(int j = 1; j <= N; j++) {
	            fuel[i][j] = INF;
	            dist[i][j] = INF;
	        }
	        fuel[i][i] = 0;
	        dist[i][i] = 0;
	    }

	    for(int i = 1; i <= M; i++) {
	    	fuel[A[i]][B[i]] = Math.min(fuel[A[i]][B[i]], C[i]);
	    	fuel[B[i]][A[i]] = Math.min(fuel[B[i]][A[i]], C[i]);
	    }
	    for(int i = 1; i <= N; i++) {
	        for(int j = 1; j <= N; j++) {
	            for(int k = 1; k <= N; k++) {
	            	fuel[j][k] = Math.min(fuel[j][k], fuel[j][i] + fuel[i][k]);
	            }
	        }
	    }
	    for(int i = 1; i <= N; i++) {
	        for(int j = 1; j <= N; j++) {
	            if(i == j) continue;
	            if(fuel[i][j] <= L) dist[i][j] = Math.min(dist[i][j], 1L);
	        }
	    }
	    for(int i = 1; i <= N; i++) {
	        for(int j = 1; j <= N; j++) {
	            for(int k = 1; k <= N; k++) {
	            	dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
	            }
	        }
	    }
	    for(int i = 1; i <= Q; i++) {
	        if(dist[t[i]][s[i]] < INF) out.println(dist[t[i]][s[i]] - 1);
	        else out.println(-1);
	    }
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

}