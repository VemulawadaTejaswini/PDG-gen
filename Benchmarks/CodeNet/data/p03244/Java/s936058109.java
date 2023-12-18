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
		int[] a = new int[n/2+1];
		int[] b = new int[n/2+1];
		for (int i = 0; i < n/2; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}
		a[n/2] = 1000000000;
		b[n/2] = 1000000000;
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		int maxa = 0;
		int maxa2 = 0;
		int maxa_tmp = 1;
		int maxb2 = 0;
		int maxb = 0;
		int maxb_tmp = 1;
		int maxva = 0;
		int maxvb = 0;
		for (int i = 1; i <= n/2; i++) {
			if(a[i]==a[i-1])
			{
				maxa_tmp++;
			}
			else {
				if(maxa < maxa_tmp)
				{
					maxa2 = maxa;
					maxa = maxa_tmp;
					maxva = a[i-1];
				}
				else if(maxa2 < maxa_tmp)
				{
					maxa2 = maxa_tmp;
				}
				maxa_tmp = 1;
			}
			if(b[i]==b[i-1])
			{
				maxb_tmp++;
			}
			else {
				if(maxb < maxb_tmp)
				{
					maxb2 = maxb;
					maxb = maxb_tmp;
					maxvb = b[i-1];
				}
				else if(maxb2 < maxb_tmp)
				{
					maxb2 = maxb_tmp;
				}
				maxb_tmp = 1;
			}
		}
		if(maxva == maxvb)
		{
			out.println(Math.min(n-maxa-maxb2,n-maxa2-maxb));
		}
		else {
			out.println(n-maxa-maxb);
		}
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