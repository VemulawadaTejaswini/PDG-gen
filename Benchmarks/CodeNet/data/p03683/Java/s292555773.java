import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.*;

class Main
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
    static Random rnd=new Random();
    static long mod=(long)(1e9+7);

    public static void main(String args[]) throws Exception
    {
        int n=sc.nextInt(),m=sc.nextInt();

        if(Math.abs(n-m)>1)
        {
            out.println(0);
        }

        else
        {
            long val1=1,val2=1;

            for(int i=1;i<=n;i++)
            {
                val1=(val1*i)%mod;
            }

            for(int i=1;i<=m;i++)
            {
                val2=(val2*i)%mod;
            }

            long curr=(n==m?2:1),res=(val1*val2*curr)%mod;

            out.println(res);
        }

        out.close();
    }

    private static class FastScanner
    {
        BufferedReader in;
        StringTokenizer st;

        public FastScanner(BufferedReader in) {
            this.in = in;
        }

        public String nextToken() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(in.readLine());
            }
            return st.nextToken();
        }

        public String next() throws Exception {
            return nextToken().toString();
        }

        public int nextInt() throws Exception {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() throws Exception {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() throws Exception {
            return Double.parseDouble(nextToken());
        }
    }
}