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

    public void run() {
    	try {
	    	FastScannerCaracalVsMonster sc = new FastScannerCaracalVsMonster(System.in);

	        long H = sc.nextLong();

	        String bin = Long.toBinaryString(H);

	        //System.out.println(bin);
	        String conv = bin.substring(0,1) + bin.substring(1).replace("1", "0");
	        //System.out.println(conv);

	        long convi = Long.parseLong(conv, 2);

	        System.out.println(convi*2-1);

    	}catch(Exception e) {
    		e.printStackTrace();
    	}

    }
}


//高速なScanner
class FastScannerCaracalVsMonster {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerCaracalVsMonster(InputStream in) {
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
