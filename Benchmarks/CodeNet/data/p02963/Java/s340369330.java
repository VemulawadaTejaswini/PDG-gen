import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	int[][] ta = new int[16][4096];
	int ptr = 0;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		Long s = Long.parseLong(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		//int[] ra = new int[r];
		//ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		out.print("0 0 ");
		long ans1 = 1;
		long ans2 = 1;
		long ans3 = 1;
		long ans4 = 1;
		if(s%1000000000l!=0)
		{
			ans1 = s/1000000000l +1;
		}
		else
		{
			ans1 = s/1000000000l;
		}
		ans4 = 1000000000l;
		long s2 = s%1000000000l;

		if(s2 == 0l)
		{
			ans2 = 0l;
			ans3 = 0l;
		}
		else
		{
			s2 = 1000000000l - s2;
			ans2 = 1l;
			ans3 = s2;
		}
				
		out.print(ans1 + " " + ans2 + " ");
		out.print(ans3 + " " + ans4 + " ");
		//out.println(ans1*ans4-ans2*ans3);
		out.println();
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