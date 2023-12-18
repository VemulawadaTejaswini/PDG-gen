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
//	int[] size;
//	int[] root;
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
/*	    fac[0] = 1;
	    ifac[0] = 1;
	    for(int i = 0; i<300000; i++){
	        fac[i+1] = fac[i]*(i+1) % M;
	        ifac[i+1] = ifac[i]*mpow((long)(i+1), M-2l) % M; 
	    }*/
		PrintWriter out = new PrintWriter(System.out);
		int[] a = new int [n];
		int [] type = new int[4];
		int [] type_cnt = new int[4];
		a[0] = Integer.parseInt(sc.next());
		type[0] = a[0];
		type_cnt[0] = 1;
		int tp =0;
		for(int i = 1; i < n; i++)
		{
			a[i] = Integer.parseInt(sc.next());
			for(int j = 0; j <= tp; j++)
			{
				if(type[j]==a[i])
				{
					type_cnt[j]++;
					break;
				}
				else if(j==tp)
				{
					if(tp < 3)
					{
						tp++;
						type_cnt[tp]=1;
						type[tp]=a[i];
						break;
					}
				}
			}
		}
		if(tp == 0 && type[0] == 0)
		{
			out.println("Yes");
		}
		else if ((n%3==0) && (tp == 2) && (type[0] == (type[1]^type[2])) && type_cnt[0] == type_cnt[1] && type_cnt[0] == type_cnt[2])
		{
			out.println("Yes");
		}
		else if((n%3==0) && (tp == 1) && type[0]==0 && type_cnt[0]*2 == type_cnt[1])
		{
			out.println("Yes");
		}
		else if((n%3==0) && (tp == 1) && type[1]==0 && type_cnt[1]*2 == type_cnt[0])
		{
			out.println("Yes");
		}
		else
		{
			out.println("No");
		}
		
		
		out.flush();
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