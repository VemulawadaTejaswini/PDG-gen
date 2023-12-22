import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main
{
    static class FastReader
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
                catch (IOException  e)
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
 
    public static void main(String[] args)
    {
        FastReader s=new FastReader();
        int n = s.nextInt();
        int k = s.nextInt();
        HashSet<Integer> set = new HashSet<>();  
        for(int i=0; i<k; i++){
            int st = s.nextInt();
            int en = s.nextInt();
            for(int j=st; j<=en; j++){
                set.add(j);
            }
        } 

        List<Integer> list = new ArrayList<Integer>(set); 
        Collections.sort(list);

        long[] dp = new long[n+1];
        dp[n] = 1;
        for(int i=n-1; i>=1; i--){
            long ways = 0;
            for(int jump: list){
                if(jump+i<=n){
                    ways += (dp[jump+i] % 998244353);
                }else{
                    break;
                }
            }
            dp[i] = ways % 998244353;
        }

        // for(int i: dp) System.out.print(i+" ");
        System.out.println(dp[1]);
    }
}