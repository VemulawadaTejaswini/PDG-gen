vimport org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static class FastReader
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

    public static FastReader r=new FastReader();
    public static void main(String[] args){
        final int mod=1000000007;
        int n=r.nextInt();
        int [][]in=new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                in[i][j]=r.nextInt();
            }
        }
        int []dp=new int[1<<n];
        dp[0]=1;
        for(int mask=0;mask<(1<<n)-1;++mask){
            int man_th=Integer.bitCount(mask);
            for(int woman=0;woman<n;++woman){
                if(in[man_th][woman]==1&&(mask&(1<<woman))==0){
                    dp[mask|(1<<woman)]=(dp[mask|(1<<woman)]+dp[mask])%mod;
                }
            }
        }
        System.out.println(dp[(1<<n)-1]);
    }
}
