
//package cf;
import java.awt.event.MouseAdapter;
import java.io.*;
import java.util.*;
public class Main {
    static int p=1000000007;
    public static void main(String[] args) throws Exception{
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        FastReader sc=new FastReader();
        // long k = sc.nextLong();
            int n = sc.nextInt();
            int a=sc.nextInt();
            int ar[]=new int[n];

            String inp[]=sc.nextLine().split(" ");
        for(int i=0;i<n;i++)
            {
                ar[i]=Integer.parseInt(inp[i]);
            }
       int max_sum=n*a+1;
        long dp[][][]=new long[n+1][n+1][max_sum];
        for(int i=0;i<=n;i++) {
                dp[i][0][0]=1;
        }
            
            List<Integer> l1=new ArrayList<>();
            for(int i=1;i<=n;i++)
            {
                for(int k=1;k<=n;k++)
                {
                for(int j=1;j<=max_sum-1;j++)
                {
                    if(j-ar[i-1]>=0&&dp[i-1][k-1][j-ar[i-1]]>0)
                   {
                       if(j==ar[i-1])
                       {
                   
                           dp[i][k][j]=dp[i-1][k][j]+dp[i-1][k-1][j-ar[i-1]];
                       }
                        else
                       {
                   
                           dp[i][k][j]=dp[i-1][k][j]+dp[i-1][k-1][j-ar[i-1]];
                       }

                    }
                    dp[i][k][j]=Math.max(dp[i][k][j],dp[i-1][k][j]);
                }
                }
            }
        for(int i=1;i<=n;i++)
        {
                c+=dp[n][i][i*a];
        }
            System.out.println(c);
        //  out.write(sb.toString());
        out.flush();
    }
    static  long c=0;
 





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
