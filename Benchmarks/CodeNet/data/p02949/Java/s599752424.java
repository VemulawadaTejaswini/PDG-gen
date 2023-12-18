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
	int[][] ta = new int[16][4096];
	int ptr = 0;
	int end = 0;
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
		int m = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		//int[] ra = new int[r];
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		T_node[] ts = new T_node[n];
		for(int i = 0; i < n; i++)
		{
			ts[i] = new T_node(i);
		}
		for(int i = 0; i < m; i++)
		{
			a[i] = Integer.parseInt(sc.next())-1;
			b[i] = Integer.parseInt(sc.next())-1;
			c[i] = Integer.parseInt(sc.next());
			ts[a[i]].ar0.add(new T_b(b[i], c[i]));
			ts[b[i]].ar1.add(new T_b(a[i], c[i]));
		}
		int[] tmp0 = new int[n];
		int[] tmp1 = new int[n];
    	Arrays.fill(tmp0, 1000000000);
    	Arrays.fill(tmp1, 1000000000);
    	chk0(ts, n, 0, tmp0, 0);
    	chk1(ts, n, 0, tmp1, n-1);
		for(int i = 1; i < n-1; i++)
		{
			if(tmp0[i] == 1000000000 || tmp1[i] == 1000000000)
			{
				ts[i].flg0 = -1;
			}
		}
		int[] tmp2 = new int[n];
		Arrays.fill(tmp2, -1000000000);
		chk2(ts, n, 0, tmp2, 0, p, 0);
		int err = 0;
		for(int i = 0; i < n; i++)
		{
			if(n <= ts[i].lp)
			{
				err = -1;
			}
		}
		if(end == 1)
		{
			out.println(-1);
		}
		else
		{
			out.println(tmp2[n-1]);
		}
			
		out.println();
		out.flush();
    }
    void chk0 (T_node[] ts, int n, int cl, int[] tmp, int p)
    {
    	ArrayList<Integer> ta = new ArrayList<Integer>();
    	for(T_b i: ts[p].ar0)
    	{
    		if(cl+1 < tmp[i.a])
    		{
    			ta.add(i.a);
    			tmp[i.a] = cl+1;
    		}
    	}
    	for(int i: ta)
    	{
    		chk0(ts, n, cl+1, tmp, i);
    	}
    }
    void chk1 (T_node[] ts, int n, int cl, int[] tmp, int p)
    {
    	ArrayList<Integer> ta = new ArrayList<Integer>();
    	for(T_b i: ts[p].ar1)
    	{
    		if(cl+1 < tmp[i.a])
    		{
    			ta.add(i.a);
    			tmp[i.a] = cl+1;
    		}
    	}
    	for(int i: ta)
    	{
    		chk1(ts, n, cl+1, tmp, i);
    	}
    }
    void chk2 (T_node[] ts, int n, int cl, int[] tmp, int p, int pe, int step)
    {
    	ArrayList<Integer> ta = new ArrayList<Integer>();
    	for(T_b i: ts[p].ar0)
    	{
    		//if(cl+(long)i.c-(long)pe > tmp[i.a] && ts[i.a].flg0 != -1 && ts[i.a].lp < 10000)
			//ts[i.a].lp = step;
			if(step >= 2*n)
			{
				end = 1;
			}
    		if(cl+i.c-pe > tmp[i.a] && ts[i.a].flg0 != -1 && end == 0)
    		{
    			ta.add(i.a);

    			if(cl+i.c-pe > 0)
    			{
    				tmp[i.a] = cl+i.c-pe;
    				chk2(ts, n, (cl+(long)i.c-(long)pe), tmp, i.a, pe, step+1);
    			}
    			else
    			{
    				tmp[i.a] = 0;
    				chk2(ts, n, 0, tmp, i.a, pe, step+1);
    			}
    		}
    	}
    	//for(int i: ta)
    	//{
    	//	chk2(ts, n, tmp[i], tmp, i, pe, step+1);
    	//}
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
	int lp;
	int flg0;
	int n;
	ArrayList<T_b> ar0;
	ArrayList<T_b> ar1;
	T_node(int tn, ArrayList<T_b> tar0, ArrayList<T_b> tar1)
	{
		lp = 0;
		flg0 = 0;
		n = tn;
		ar0 = tar0;
		ar1 = tar1;
	}
	T_node(int tn)
	{
		lp = 0;
		flg0 = 0;
		n = tn;
		ar0 = new ArrayList<T_b>();
		ar1 = new ArrayList<T_b>();
	}
}

class T_b {
	int a;
	int c;
	T_b(int ta, int tc)
	{
		a = ta;
		c = tc;
	}

}