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
        void solve(IO io, PrintWriter out)
        {
            int t = 1;
            while(t-->0)
            {
                int n = io.nextInt();
              	int[] ar = new int[n];
              	for(int i=0 ; i<n ; i++)
                  ar[i] = io.nextInt();
              	int cost=0, end=n-1, i=n-2;
              	while(end-1>0)
                {
                  if(Math.abs(ar[end-2]-ar[end])>Math.abs(ar[end-1]-ar[end]))
                  {
                    cost+=Math.abs(ar[end-1]-ar[end]);
                    end=end-1;
                  }
                  else
                  {
                    cost+=Math.abs(ar[end-2]-ar[end]);
                    end=end-2;
                  }
                }
              	if(end>0)
                  cost+=Math.abs(ar[end]-ar[end-1]);
              	out.println(cost);
            }
	    }
	}
	//Special thanks to Petr (on codeforces) who inspired me to implement IO class!
	static class IO
	{
    	private static final int BUF_SIZE = 2048;
        BufferedReader br;
        private IO() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        private boolean isSpace(char c) {
            return c == '\n' || c == '\r' || c == ' ';
        }
        String next() {
            try {
                StringBuilder sb = new StringBuilder();
                int r;
                while ((r = br.read()) != -1 && isSpace((char) r));
                if (r == -1) {
                    return null;
                }
                sb.append((char) r);
                while ((r = br.read()) != -1 && !isSpace((char) r)) {
                    sb.append((char) r);
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
	}
}