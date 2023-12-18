
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int dp[];
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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



    public static void main(String[] args)throws IOException {
        FastReader fr = new FastReader();
        int n=fr.nextInt();
        int m=fr.nextInt();
        int arr[][]=new int[n][m];
        int mod=1000000007;
        for(int i=0;i<n;i++)
        {
            char s[]=fr.nextLine().toCharArray();
            for(int j=0;j<s.length;j++)
            {
                if(s[j]=='#')arr[i][j]=-1;

            }

        }
        arr[0][0]=1;
        for(int i=1;i<m;i++)
        {
            if(arr[0][i]==-1)
                arr[0][i]=0;
            else
                arr[0][i]=arr[0][i-1];
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i][0]==-1)
                arr[i][0]=0;
            else
                arr[i][0]=arr[i-1][0];
        }


        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(arr[i][j]==-1)arr[i][j]=0;
                else
                arr[i][j]=(arr[i][j-1]+arr[i-1][j])%mod;
            }
        }
        
        System.out.println(arr[n-1][m-1]);

    }
    public static int dfs(HashMap<Integer,ArrayList<Integer>> hm,int v)
    {
        int max=0;
        if(dp[v]!=-1)
            return dp[v];
        if(hm.containsKey(v)){
            for(int i=0;i<hm.get(v).size();i++)
            {
                max=Math.max(max,1+dfs(hm,hm.get(v).get(i)));
            }
        }

        return dp[v]= max;
    }




}
