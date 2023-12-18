
//package cf;
import java.io.*;
import java.util.*;
public class Main {
    static int p=1000000007;
    public static void main(String[] args) throws Exception{
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        FastReader sc=new FastReader();
        int n = sc.nextInt();
        int W = sc.nextInt();
        int w[]=new int[n];
        int v[]=new int[n];
        for(int i=0;i<n;i++)
        {
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }

        StringBuilder sb=new StringBuilder();
        long dp[][]=new long[n+1][W+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=W;j++)
            {
                if(j-w[i-1]>=0)
                {
                    dp[i][j]=Math.max(dp[i-1][j],v[i-1]+dp[i-1][j-w[i-1]]);
                 //   System.out.println(i+"  "+j+" "+dp[i][j]);
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j]);
                }
            }
        }
        sb.append(dp[n][W]);
        out.write(sb.toString());
        out.flush();
    }


static class pair
{
    long a,d;
    StringBuilder sb;

    public pair(long a, long d, StringBuilder sb) {
        this.a = a;
        this.d = d;
        this.sb = sb;
    }
}



    ///////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
