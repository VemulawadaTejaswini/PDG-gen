import java.io.*;
import java.util.*;
import java.math.*;
     
public class Main{
	public static void main(String[] args) throws Exception {
	IO io = new IO();
	PrintWriter out = new PrintWriter(System.out);
	Solver sr = new Solver();
	sr.solve(io,out);
	out.flush();
	out.close();
    	}

	static class Solver
	{
      	int M=1000000007;
      	long[] f;
      	void fact(int n)
        {
          f[0]=1;
          for(int i=1 ; i<=n ; i++)
            f[i] = (i*f[i-1])%M;
        }
      	long power(long x, long n)
        {
          long res=1;
          while(n>0)
          {
            if((n&1)!=0)
              	res=(res*x)%M;
            x=(x*x)%M;
            n>>=1;
          }
          return res%M;
        }
      	long ncr(int n, int r)
        {
          return (f[n] * (power((f[r]*f[n-r])%M,M-2)%M) )%M;
        }
	    void solve(IO io, PrintWriter out)
	    {
           	int n = io.nextInt();
          	int k = io.nextInt();
          	f = new long[200011];
          	fact(n+1);
          	int ans=0;
          	while(k<=n+1)
            {
              ans+=ncr(n+1,k);
              //out.println(ans);
              ans%=M;
              k++;
            }
            out.println(ans-(n-2));
	    }
    	
	}
	//Special thanks to Petr (on codeforces) who inspired me to implement IO class!
	static class IO
	{
    	BufferedReader reader;
        StringTokenizer tokenizer;
    	public IO() {
                reader = new BufferedReader(new InputStreamReader(System.in));
                tokenizer = null;
            }
     
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public String nextLine() {
            String s="";
            try {
                    s=reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            return s;
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
    
        public long nextLong() {
            return Long.parseLong(next());
        }
    	double nextDouble()
    	{
    		return Double.parseDouble(next());
    	}
	}
}