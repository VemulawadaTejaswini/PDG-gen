import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


//System.out.println();
public class Main implements Runnable { //クラス名はMain

    public static void main(String[] args) {
    	Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    public void run() {
    	try {
	    	FastScannerFennecVsMonster sc = new FastScannerFennecVsMonster(System.in);

	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        int h[] = new int[N];
	        long count =0;

	        for(int i=0; i < N; i++) {
	        	h[i] = sc.nextInt();
	        }

	        Arrays.sort(h); // 昇順になる

	        //System.out.println(Arrays.toString(h));

	        for(int i=0; i < N; i++) {
	        	if(i+K > N-1) {
	        		break;
	        	}else {
	        		count += h[i];
	        	}
	        }

	        System.out.println(count);

    	}catch(Exception e) {
    		e.printStackTrace();
    	}

    }
}


//高速なScanner
class FastScannerFennecVsMonster {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerFennecVsMonster(InputStream in) {
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
