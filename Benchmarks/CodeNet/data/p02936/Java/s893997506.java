import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  implements Runnable {

    public static void main(String[] args) {
        Thread tt = new Thread(null, new Main(), "", 256 * 1024 * 1024);
        tt.start();
    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;

		PrintWriter out = new PrintWriter(System.out);
		T_node[] tn = new T_node[n];
		for (int i = 0; i < n; i++) {
			tn[i] = new T_node();
		}
		for (int i = 0; i < n-1; i++) {
			int a = Integer.parseInt(sc.next()) -1;
			int b = Integer.parseInt(sc.next()) -1;
			tn[a].ar.add(b);
			tn[b].ar.add(a);
		}
		for (int i = 0; i < q; i++) {
			int p = Integer.parseInt(sc.next()) -1;
			int x = Integer.parseInt(sc.next());
			tn[p].cv += x;
		}
			
		clc(tn, 0, 0);
		for (int i = 0; i < n; i++) {
			out.print(tn[i].sum);
			out.print(" ");
		}
		out.println();
		out.flush();
    }
    void clc(T_node[] tn, int cp, long sum)
    {
    	sum += tn[cp].cv;
    	tn[cp].sum=sum;
    	for(int i: tn[cp].ar)
    	{
    		for (int j = 0; j < tn[i].ar.size(); j++) {
				if(tn[i].ar.get(j) == cp)
				{
					tn[i].ar.remove(j);
				}
			}
    		clc(tn, i, sum);
    	}
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
class T_node {
	long sum;
	long cv;
	ArrayList<Integer> ar;
	T_node()
	{
		sum = 0;
		cv = 0;
		ar = new ArrayList<Integer>();
	}
}