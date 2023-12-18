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
		long x = Long.parseLong(sc.next());
		long ans = 0;
		ans += x/11l*2l;
		x = x%11;
		if(x > 0)
		{
			x = x-6;
			ans++;
		}
		if(x > 0)
		{
			x = x-5;
			ans++;
		}

		out.printf("%d", ans);
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