import org.w3c.dom.ls.LSOutput;

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
        int n=r.nextInt();
        double []p=new double[n+1];
        for(int i=1;i<=n;++i){
            p[i]=r.nextDouble();
        }
        double [][]dp=new double[n+5][n+5];
        dp[0][0]=1;
        for(int i=1;i<=n;++i){
            for(int num=0;num<=n;++num){
                dp[i][num+1]+=dp[i-1][num]*p[i];
//                if(i==1&&num==0) System.out.println("debug : "+dp[1][1]);
                dp[i][num]+=dp[i-1][num]*(1-p[i]);
//                if(i==1&&num==0) System.out.println("debug : "+dp[1][0]);
            }
        }
//        System.out.println("dp 1 1 : "+dp[1][1]);
        double ans=0;
        for(int head=(n+1)/2;head<=n;++head){
            ans+=dp[n][head];
        }
        System.out.println(ans);

    }
}
