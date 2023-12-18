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

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		//long n = Long.parseLong(sc.next());
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//long b = Long.parseLong(sc.next());
		//int l = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//int k = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
		//int x2000 = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//int atmp[] = new int[h];
		//int max= 0;
		//int blackar[][] = new int[h*w][2];
		//int p=0;
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		//int[] ra = new int[r];
		ArrayList<Integer> rl = new ArrayList<>();
		for (int i = 0; i < r; i++){
			rl.add(Integer.parseInt(sc.next())-1);
		}
		int[][] d = new int [n][n];
		for (int i = 0; i < n; i++) { //s
			for (int j = 0; j < n; j++) { // e
				if(i==j)
				{
					d[i][j]=0;
				}
				else
				{
					d[i][j]=1000000000;
				}
			}
		}
		for (int i = 0; i < m; i++)
		{
			int p0 = Integer.parseInt(sc.next())-1;
			int p1 = Integer.parseInt(sc.next())-1;
			int c = Integer.parseInt(sc.next());
			d[p0][p1] = c;
			d[p1][p0] = c;

		}
		for (int k = 0; k < n; k++){ //m
			for (int i = 0; i < n; i++) { //s
				for (int j = 0; j < n; j++) { // e
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}

		out.println(sp(d, rl, new ArrayList<Integer>()));
		out.flush();
	}
    int sp (int[][] d, ArrayList<Integer> rlt, ArrayList<Integer> clt)
    {
    	if(rlt.size() <= 0)
    	{
    		int ans = 0;
    		for(int i = 1; i < clt.size(); i++)
    		{
    			ans += d[clt.get(i-1)][clt.get(i)];
    		}
    		return ans;
    	}
    	else
    	{
	    	int ans = 1000000000;
	    	for(int i = 0; i < rlt.size(); i++)
	    	{
	    		ArrayList<Integer> rl = (ArrayList<Integer>) rlt.clone();
	    		ArrayList<Integer> cl = (ArrayList<Integer>) clt.clone();
	    		cl.add(rl.get(i));
	    		rl.remove(i);
	    		int ans_tmp = sp(d, rl, cl);
	    		if(ans_tmp < ans)
	    		{
	    			ans = ans_tmp;
	    		}
	    	}
	    	return ans;
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