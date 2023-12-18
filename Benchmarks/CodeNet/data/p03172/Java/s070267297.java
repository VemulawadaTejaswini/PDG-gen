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
        int k=r.nextInt();
        int []a=new int[n+5];
        for(int i=0;i<n;++i){
            a[i]=r.nextInt();
        }
        final int mod=1000000007;
        int []dp=new int[100005];
        dp[0]=1;
        for(int i=0;i<n;++i){
            int x=a[i];
            int []fake_add=new int[k+1];
            for(int sum=k;sum>=0;--sum){
                int add=dp[sum];
                int l=sum+1;
                int r=sum+Math.min(x,k-sum);
                if(l<=r){
                    fake_add[l]=(fake_add[l]+add)%mod;
                    if(r+1<=k) fake_add[r+1]=(fake_add[r+1]-add+mod)%mod;
                }
            }
            int tot=0;
            for(int j=0;j<=k;++j){
                tot=(tot+fake_add[j])%mod;
                dp[j]=(dp[j]+tot)%mod;
            }
        }
        System.out.println(dp[k]);
    }
}
