import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main  implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		int n = Integer.parseInt(sc.next());
		PrintWriter out = new PrintWriter(System.out);
		int[][] a = new int[n][3];
		for (int i = 0; i < n; i++) {
			a[i][0] = Integer.parseInt(sc.next());
			a[i][1] = Integer.parseInt(sc.next());
			a[i][2] = Integer.parseInt(sc.next());
		}
		int htmp = a[0][2];
		int cx=0;
		int cy =0;
		int ch = 0;
		for (int i = 0; i <= 200; i++) {
			for (int j = 0; j <= 100; j++) {
				for (int k = 0; k <= 100; k++) {
					int eq = 1;
					int cxt = j;
					int cyt = k;
					int cht = htmp + i;
					if(cht<1)
					{
						eq =0;
					}
					for (int k2 = 0; k2 < n; k2++) {
						int x = a[k2][0];
						int y = a[k2][1];
						int h = a[k2][2];
						if(Math.max(cht-Math.abs(x-cxt)-Math.abs(y-cyt),0)!=h)
						{
							eq =0;
						}
					}
					if(eq == 1)
					{
						cx=cxt;
						cy =cyt;
						ch = cht;
					}
				}
			}
		}

		out.printf("%d %d %d", cx, cy, ch);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long nextInt() {
            return Integer.parseInt(next());
        }

    }

}
