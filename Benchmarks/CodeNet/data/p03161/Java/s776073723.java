import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 class Main {
    public static void main(String[] args) {

        FastReader f = new FastReader();
        int n =f.nextInt();
        int k = f.nextInt();
        int heights [] = new int[n];
        for(int i=0;i<n;i++)
            heights[i] =f.nextInt();
        System.out.println(solve(heights,n,k));



    }
    static  int solve(int[] heights,int n,int k)
    {
       int dp[] = new int[n];
       Arrays.fill(dp,Integer.MAX_VALUE);
       dp[0]=0;
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<Math.min(i+k+1,n);j++)
           {
               dp[j] =Math.min(dp[j],dp[i]+Math.abs(heights[i]-heights[j]));
           }


       }

       return dp[n-1];

    }



    static  class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
