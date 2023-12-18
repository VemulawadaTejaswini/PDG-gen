import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//System.out.println();
public class Main implements Runnable { //クラス名はMain

    public static void main(String[] args) {
    	Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    //2 ≤ N ≤10^5
    //1 ≤ hi ≤ 10^4
    public void run() {
    	FastScanner sc = new FastScanner(System.in);
        int N = sc.nextInt();
        int h[] = new int[N];
        int dp[] = new int[N];

        dp[0]=0;
        for(int i=0; i<N; i++) {
        	h[i] = sc.nextInt();
        }

        int left = -1_000_000;
        int right = 1_000_000;

        for(int i=1; i<N; i++) {
        	if(i == 1) {
        		dp[i] = Math.abs(h[i]-h[i-1]);
        	}else {
        		//h[i-1] - h[i]
        		right = Math.abs(h[i]-h[i-1]) + dp[i-1];
        		//h[i-2] - h[i]
        		left = Math.abs(h[i]-h[i-2]) + dp[i-2];
        		if (left > right) {
        			dp[i] = right;
        		}else {
        			dp[i] = left;
        		}
        	}
        }

        System.out.println(dp[N-1]);

    }
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}
