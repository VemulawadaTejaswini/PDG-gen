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
		//long n = Long.parseLong(sc.next());
		int n = Integer.parseInt(sc.next());
		char[] c0 = sc.next().toCharArray();
		char[] c1 = sc.next().toCharArray();
		int p = 0;
		long ans = 1;
		int pre = 0;
		if(c0[p] == c1[p])
		{
			ans *= 3;
			pre = 1;
			p++;
		}
		else {
			ans *= 6;
			pre = 2;
			p+=2;
		}
		while(p < n)
		{
			if(c0[p] == c1[p])
			{
				if(pre == 1)
				{
					ans *= 2;
				} else {
					ans *= 1;
				}
				pre = 1;
				p++;
			}
			else {
				if(pre == 1)
				{
					ans *= 2;
				} else {
					ans *= 3;
				}
				pre = 2;
				p+=2;
			}
			ans %= 1000000007;
		}
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