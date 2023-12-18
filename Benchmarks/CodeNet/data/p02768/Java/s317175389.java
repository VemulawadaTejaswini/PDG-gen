import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//System.out.println();
public class Main implements Runnable { //クラス名はMain

	static final long MOD = 1000000007;

    public static void main(String[] args) {
    	Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    public void run() {
    	try {
	    	FastScannerMain4 sc = new FastScannerMain4(System.in);

	    	int n = sc.nextInt();
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        //Σ nCk = 2^n ( refer to https://mathtrain.jp/nikoubekijo )
	        long sum =0;
	        sum = modpow(2 , n, MOD);

	        sum -= 1;

	        //nCa=n*(n-1)*…*(n-a+1)/a!
	        long comba = 1L;
	        for(long ac = n-a+1; ac<=n; ac++) {
	        	comba *= ac;
	        	comba %= MOD;
	        }
	        for(long ac = 1; ac <= a; ac++) {
	        	comba *= inv(ac,MOD);
	        	comba %= MOD;
	        }

	        long combb = 1L;
	        for(long bc = n-b+1; bc<=n; bc++) {
	        	combb *= bc;
	        	combb %= MOD;
	        }
	        for(long bc = 1; bc<=b; bc++) {
	        	combb *= inv(bc,MOD);
	        	combb %= MOD;
	        }

	        sum -= (comba + combb)%MOD;
	        //sum %= MOD;
	        System.out.println(sum);


    	}catch(Exception e) {
    		e.printStackTrace();
    	}

    }

    /**
     * 繰り返し２乗法を使ったべき乗計算(mod)
     */
    public static long modpow(long x, long n, long mod) { //x^n 計算量O(logn)
    	long ans = 1;
    	while (n > 0) {
    		if ((n & 1) == 1) {
    			ans = ans * x % mod;
    		}
    		x = x * x % mod ; //一周する度にx, x^2, x^4, x^8となる.
    		n >>= 1; //桁をずらす n = n >> 1
    	}
    	return ans;
    }

    /* 逆元を求める(a^{-1} mod を計算する)
     * (refer to https://qiita.com/drken/items/3b4fdf0a78e7a138cd9a)
     *  ex : 2^−1≡72−1≡7 (2×7=14≡1(mod13)2×7=14≡1(mod13)のため)
     *  2/3 (mod 13) = 2 * 3^-1 (mod 13) ※ 3^-1は3の逆元
     */
    public static long inv(long a, long mod){
		return modpow(a, mod-2 ,mod);
	}








}


//高速なScanner
class FastScannerMain4 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain4(InputStream in) {
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
