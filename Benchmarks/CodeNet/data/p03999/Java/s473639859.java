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
		String str = sc.next();
		char[] c = str.toCharArray();
		long ans = 0;
		int n = (int)Math.pow(2,(double)c.length-1);
		for (int i = 0; i < n; i++) {
			long tmp = (c[0] - '0');
			for (int j = 1; j < c.length; j++) {
				if((i>>(j-1)&1)==0)
				{
					tmp=tmp*(long)10;
					tmp += (c[j]-'0');
				}
				else {
					ans += tmp;
					tmp = (c[j]-'0');
				}
			}
			ans += tmp;
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