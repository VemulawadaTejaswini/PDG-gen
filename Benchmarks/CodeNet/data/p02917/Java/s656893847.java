import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	int [] ans_ar; 
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 32 * 1024 * 1024).start(); //
	}
	public void run() {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int ans = 0;
		int[] b = new int[n];
		for (int i = 0; i < n-1; i++) {
			b[i+1] = Integer.parseInt(sc.next());
		}
		b[0] = 100000;
		for (int i = 0; i < n-1; i++) {
			ans += Math.min(b[i],b[i+1]);
		}
		ans += b[n-1];

		out.println(ans);
		out.flush();
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
    }
}