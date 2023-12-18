import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Arrays;
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

		int m = (int)Math.pow(2,n);
		int[] a = new int[m];
		int va = 0;
		for (int i = 0; i < m; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.parallelSort(a);
		int p = -1;
		int cr = 0;
		int[] b = new int[m];
		for (int i = m-1; i >= 0; i--) {
			if(cr != a[i])
			{
				cr = a[i];
				p++;
				b[p] = 1;
			}
			else {
				b[p]++;
			}
		}
		String ans = "Yes";
		int maxp = p;
		int[] prep = new int[n];
		int totalp = n;
		prep[0] = 1;
		for (int i = 1; i < n; i++) {
			prep[i] = 1;
			totalp++;
		}
		for (int i = 1; i <= maxp; i++) {
			if(b[i] > totalp)
			{
				ans = "No";
			}
			else {
				int cp = 0;
				int[] prep_next = new int[n];
				while(b[i] > 0)
				{
					if(cp >= prep.length)
					{
						ans = "No";
						break;
					} 
					else if(prep[cp] > 0)
					{
						if(prep[cp]< b[i])
						{
							for (int j = cp+1; j < n; j++) {
								prep_next[j] += prep[cp];
							}
							b[i] -= prep[cp];
							prep[cp] = 0;
						}
						else {
							for (int j = cp+1; j < n; j++) {
								prep_next[j] += b[i];
							}
							prep[cp] -= b[i];
							b[i] = 0;
						}
					}
					cp++;
				}
				for (int j = 0; j < n; j++) {
					prep[j] += prep_next[j];
				}
			}
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