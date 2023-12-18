import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main  implements Runnable {

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		//long n = Long.parseLong(sc.next());
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//ar[1]=Integer.parseInt(sc.next());
    	//ar[2]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		int n = Integer.parseInt(sc.next());
		//int l = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//int k = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
		//int x2000 = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//int atmp[] = new int[h];
		//int max= 0;
		//int blackar[][] = new int[h*w][2];
		//int p=0;
		//ArrayList<Integer> lists = new ArrayList<Integer>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		int[][] a = new int[n][2];
		for (int i=0; i < n; i++)
		{
			a[i][0] = Integer.parseInt(sc.next());
			a[i][1] = Integer.parseInt(sc.next());
		}
		Arrays.parallelSort(a, (aa, ab) -> Integer.compare(aa[1], ab[1]));
		int ans = 0;
		int ct = 0;
		for(int i=0; i < n; i++)
		{
			if(a[i][1]< ct+a[i][0])
			{
				ans++;
			}
			ct += a[i][0];
		}
		if(ans==0)
		{
			out.println("Yes");
		}
		else
		{
			out.println("No");
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