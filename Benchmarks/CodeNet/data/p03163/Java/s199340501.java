import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


////System.out.println();
public class Main implements Runnable { //クラス名はMain

    public static void main(String[] args) {
    	Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    //1≤N≤100
    //1≤W≤10^5
    //1≤wi≤W
    //1≤vi≤10^9
    //N W
    //w1 v1
    //w2 v2
    //wN  vN
    public void run() {
    	FastScanner3 sc = new FastScanner3(System.in);

    	//Refer to https://qiita.com/drken/items/dc53c683d6de8aeacf5a
        int N = sc.nextInt();
        int W = sc.nextInt();
        int w[] = new int[N];
        int v[] = new int[N];
        long dp[][] = new long[N+1][W+1];

        for(int i=0; i<N; i++) {
        	w[i] = sc.nextInt();
        	v[i] = sc.nextInt();
        }

        long ans = rec(0,W,dp,N,W,w,v);
        //System.out.println("ans");
        System.out.println(ans);

    }

    private static long rec(int i, int j,long dp[][],int N, int W,int w[],int v[]) {

    	try {
	    	//System.out.println("N : "+N + " " + i + " , " + j + " : " + Arrays.deepToString(dp));

	    	if(i == N) {
	    		//System.out.println("i-1");
	    		return dp[i][j];
	    	}else if(j < w[i] ) {
	    		//System.out.println("j : "+j + " w[i]" + w[i]);
	    		return dp[i][j] = rec(i+1,j,dp,N,W,w,v);
	    	}else {
	    		long left = rec(i+1,j,dp,N,W,w,v); // 入れない
	    		long right = rec(i+1, j - w[i],dp,N,W,w,v) + v[i]; //入れる
	    		//System.out.println("left : "+left);
	    		//System.out.println("right : "+right);
	    		if(left > right) {
	    			return dp[i][j] = left;
	    		}else {
	    			return dp[i][j] = right;
	    		}
	    	}
    	}catch(Exception e) {
    		e.printStackTrace();
    		return 0;
    	}
    }
}

//高速なScanner
class FastScanner3 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner3(InputStream in) {
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

