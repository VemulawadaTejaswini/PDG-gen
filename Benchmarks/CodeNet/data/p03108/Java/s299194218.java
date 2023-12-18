import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main  implements Runnable {
//	long M = 1000000007;
//	long[] fac = new long[300001];
//	long[] ifac = new long[300001];
	int[] size;
	int[] root;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		//long n = Long.parseLong(sc.next());
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
/*	    fac[0] = 1;
	    ifac[0] = 1;
	    for(int i = 0; i<300000; i++){
	        fac[i+1] = fac[i]*(i+1) % M;
	        ifac[i+1] = ifac[i]*mpow((long)(i+1), M-2l) % M; 
	    }*/
		PrintWriter out = new PrintWriter(System.out);
		int[][] a = new int[2][m];
	    for(int i = 0; i<m; i++){
	        a[0][i] = Integer.parseInt(sc.next())-1;
	        a[1][i] = Integer.parseInt(sc.next())-1;
	    }
		long [] ans = new long[m];
		size = new int[n];
		root = new int[n];
		for(int i = 0; i<n; i++)
		{
			size[i] = 1;
			root[i] = i;
		}
		ans[m-1] =  (long)n*((long)n-1l)/2l;
		for(int i = m-2; i>=0; i--)
		{
			if(get_root(a[0][i+1])!=get_root(a[1][i+1]))
			{
				ans[i] = ans[i+1]-(long)size[get_root(a[0][i+1])]*(long)size[get_root(a[1][i+1])];
				join(a[0][i+1], a[1][i+1]);
			}
		}
		for(int i = 0; i<m; i++)
		{
			out.println(ans[i]);
		}
		out.println();
		out.flush();
    }
    void join(int a, int b)
    {
    	int root_a = get_root(a);
    	int root_b = get_root(b);
    	int size_a = size[root_a];
    	int size_b = size[root_b];
    	if(size_a < size_b)
    	{
    		root[root_b] = root_a;
    		size[root_a] += size_b;
    	}
    	else
    	{
    		root[root_a] = root_b;
    		size[root_b] += size_a;
    	}
    }
    int get_root(int i)
    {
    	if(root[i]==i)
    	{
    		return i;
    	}
    	else
    	{
    		return get_root(root[i]);
    	}
    }
/*    long mpow(long x, long n){
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
    }*/
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