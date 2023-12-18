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
		//long n = Long.parseLong(sc.next());
		int n = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i =0; i < n; i++)
		{
			a[i] = Integer.parseInt(sc.next());
		}
		for(int i =0; i < n; i++)
		{
			b[i] = Integer.parseInt(sc.next());
		}
		for(int i =0; i < n; i++)
		{
			c[i] = Integer.parseInt(sc.next());
		}
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		Arrays.parallelSort(c);
		int pa = 0;
		int pb = 0;
		int pc = 0;
		int[] pb_d = new int[n];
		for(int i =0; i < n; i++)
		{
			while(pa < n && b[i]>a[pa] )
			{
				pa++;
			}
			pb_d[i]=pa;
		}
		long tmp = 0;
		long ans = 0;
		for(int i =0; i < n; i++)
		{
			while(pb < n && c[i]>b[pb])
			{
				tmp += pb_d[pb];
				pb++;
			}
			ans += tmp;
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
