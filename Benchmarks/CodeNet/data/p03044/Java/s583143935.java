import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	long M = 1000000007;
	long[] fac = new long[300001];
	long[] ifac = new long[300001];
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
		ArrayList<ArrayList<Td>> lists = new ArrayList<>();
		for (int i = 0; i < n; i++){
			lists.add(new ArrayList<Td>());
		}
		for (int i = 0; i < n-1; i++)
		{
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			int c = Integer.parseInt(sc.next())%2;
			lists.get(a).add(new Td(b,c));
			lists.get(b).add(new Td(a,c));
		}

		int[] cn = new int[n];
		sl(0,   0,   0, lists, cn);
		for (int i = 0; i < n; i++)
		{
			out.println(cn[i]);
		}
		out.flush();
    }
    void sl(int cv, int ci, int pci, ArrayList<ArrayList<Td>> lists, int[] cn)
    {
    	cn[ci]=cv;
		for(int i=0; i<lists.get(ci).size(); i++)
		{
			if(lists.get(ci).get(i).t==pci)
			{
				lists.get(ci).remove(i);
			}
		}
		for(int i=0; i<lists.get(ci).size(); i++)
		{
			sl((cv+lists.get(ci).get(i).d)%2, lists.get(ci).get(i).t, ci, lists, cn);
		}
    }
    long mpow(long x, long n){
        long ans = 1;
        while(n != 0){
            if(n%2==1) ans = ans*x % M;
            x = x*x % M;
            n = n >> 1;
        }
        return ans;
    }
    long comb(long a, long b){ //aCbをmod計算
        if(a == 0 && b == 0)return 1;
        if(a < b || a < 0)return 0;
        long tmp = ifac[(int)(a-b)]* ifac[(int)b] % M;
        return tmp * fac[(int)a] % M;
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

class Td {
	int t;
	int d;
	Td(int tt, int td)
	{
		t = tt;
		d = td;
	}
}