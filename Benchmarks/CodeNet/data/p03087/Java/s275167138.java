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
		int q = Integer.parseInt(sc.next());
		String str = sc.next();
		char[] c = str.toCharArray();
		int[] ar = new int[n];
		int tmp = 0;
		ar[0] = 0;
		for (int i = 1; i < n; i++) {
			if(c[i-1] == 'A' && c[i]=='C')
			{
				tmp++;
			}
			ar[i] = tmp;
		}
		for (int i = 0; i < q; i++) {
			
			int l = Integer.parseInt(sc.next())-1;
			int r = Integer.parseInt(sc.next())-1;
			out.println(ar[r]-ar[l]);
		}

		//out.println(ans);
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