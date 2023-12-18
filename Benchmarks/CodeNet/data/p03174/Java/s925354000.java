import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int mod = (int)1e9+7;
    static int mask;
    static int mat[][];
    static int dp[][];
    static HashMap<Integer, List<Integer>> map;
    public static void main(String[] args) {

        FastReader f = new FastReader();
        int n =f.nextInt();
        mat= new int[n][n];
        map = new HashMap<>();

        for(int i=0;i<n;i++)
         for(int j=0;j<n;j++)
         {
             mat[i][j] = f.nextInt();
             if(mat[i][j] ==1)
             {
                 List<Integer> temp =map.getOrDefault(i,new ArrayList<>());
                 temp.add(j);
                 map.put(i,temp);
             }
         }
        mask = (int)Math.pow(2,n)-1;
        dp= new int[mask+1][n];
        System.out.println(solve(0,0));



    }

    static int solve(int m,int i)
    {
         if (m==mask)
             return 1;
         if (i>=mat.length)
             return 0;

         if(dp[m][i]!=0)
             return dp[m][i];
         int ans=0;
         for(int j: map.get(i))
         {
             if ( (m & (1<<j)) == 0)
             {
                 ans+= solve(m|(1<<j),i+1);
                 if(ans>mod)
                     ans-=mod;
             }
             else
             {
                 continue;
             }

         }
         dp[m][i] = ans;
         return ans;
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
