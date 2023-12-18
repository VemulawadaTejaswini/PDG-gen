import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main  implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
    }
    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		//int b = Integer.parseInt(sc.next());

		int[] a = new int [n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		

		int[] l = new int [n];
		int[] r = new int [n];
		l[0] = a[0];
		r[n-1] = a[n-1];
		for (int i = 1; i < n; i++) {
			l[i] = gcd(l[i-1], a[i]);
		}		
		for (int i = n-2; i >= 0; i--) {
			r[i] = gcd(r[i+1], a[i]);
		}
		int ans = Math.max(l[n-2], r[1]);
		for (int i = 1; i < n-1; i++) {
			ans = Math.max(ans, gcd(l[i-1], r[i+1]));
		}
		out.printf("%d\n", ans);
		out.println();
		out.flush();
	}
    int gcd(int m, int n) {
        if(m < n)
        {
        	return gcd(n, m);
        }
        if(n==0)
        {
        	return m;
        }
        return gcd(n, m % n);
    }
    
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        public FastScanner(String in) {
        	StringReader sr = new StringReader(in);
            reader = new BufferedReader(new BufferedReader(sr));
            tokenizer = null;
        }
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
    }
}