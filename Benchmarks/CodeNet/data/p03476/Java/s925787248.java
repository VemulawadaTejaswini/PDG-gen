import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main  implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
    	PrintWriter out = new PrintWriter(System.out);
		//long n = Long.parseLong(sc.next());
		int q = Integer.parseInt(sc.next());
		int[] a = new int[100001];
		Arrays.fill(a, 1);
		a[0] = 0;
		a[1] = 0;
		for (int i = 2; i < 100001; i++) {
			if(a[i]==1)
			{
				int p = 2;
				while(p*i <= 100000)
				{
					a[p*i] = 0;
					p++;
				}
			}
		}
		int[] b = new int[100001];
		int cr = 0;
		for (int i = 0; i < 100001; i++) {
			if(a[i]==1 && a[(i+1)/2]==1)
			{
				cr++;
			}
			b[i] = cr;
		}
		for (int i = 0; i < q; i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			out.println(b[r]-b[l-1]);
		}
		//out.println();
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