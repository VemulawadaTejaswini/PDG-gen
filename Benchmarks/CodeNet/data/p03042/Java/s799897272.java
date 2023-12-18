import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		/*
		for(int y = 0; y <= 50; y++) {
			for(int m = 0; m <=99; m++) {
				out.println((String.valueOf(y).length() == 1 ? 0 + "" + y : y)+""+(String.valueOf(m).length() == 1 ? 0 + "" +  m: m));
				solve(sc,out,y,m);
				out.println();
			}
		}
		*/
		solve(sc,out);
		out.flush();
	}

	public static void solve(FastScanner sc, PrintWriter out) {
		String s = sc.next();

		int m = Integer.parseInt(s.charAt(2) + "" + "" + s.charAt(3));
		int y = Integer.parseInt(s.charAt(0) + "" + "" + s.charAt(1));

		if(m > 0 && y > 0){
			if(y <= 12 && m <= 12){
				out.println("AMBIGUOUS");
				return;
			}
			if(y >= 13 && m <= 12 && y <= 19){
				out.println("YYMM");
				return;
			}
			if(y <= 12 && m >= 13 && m <= 19){
				out.println("MMYY");
				return;
			}
		}
		out.println("NA");

	}

	public static int gcd(int a, int b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    public Pair(final K key, final V value) {
        super(key, value);
    }
 }

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