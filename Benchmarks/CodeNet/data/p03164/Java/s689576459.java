
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
            sum+=v[i];
        }

        StringBuilder sb=new StringBuilder();
        long dp[][]=new long[n+1][sum+1];
        HashMap<Integer,Integer> h1=new HashMap<>();
        h1.put(0,0);
        long max=0;
        int in=0;

        for(int i=0;i<=n;i++) {
        dp[i][0]=0;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {

             if(j-v[i-1]>=0&&dp[i-1][j-v[i-1]]!=0||j-v[i-1]==0)
             {
                 dp[i][j]=Math.min(dp[i-1][j]==0?Long.MAX_VALUE:dp[i-1][j],dp[i-1][j-v[i-1]]+w[i-1]);
             }
             else
             {
                 dp[i][j]=dp[i-1][j];

             }
             }
        }

        for(int i=1;i<=sum;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(dp[j][i]<=W&&dp[j][i]!=0)
                {
                    max=dp[j][i];
                    in=i;
                }
            }
        }
        sb.append(in);
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
