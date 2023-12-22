import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static final int INF=1000000005;
    static int N=200000+5;
    static int []a=new int[N];
    static int []cntA=new int[N];
    static int []cntB=new int[N];
    static int []ans=new int[N];
    static int n;
    static boolean check(){
        for(int i=1;i<=n;++i){
            if(cntA[i]+cntB[i]>n) return false;
        }
        for(int i=1,j=0;i<=n;++i){
            for(;i<n&&a[i+1]==a[i];++i){
                // run when a[i]==a[i+1]
            }
            for(j=Math.max(i+1,j);cntB[a[i]]>0;++j){
                if(ans[(j-1)%n+1]>0){
                    ++cntB[ans[(j-1)%n+1]];
                }
                ans[(j-1)%n+1]=a[i];
                --cntB[a[i]];
            }
        }
        for(int i=1,j=1;i<=n;++i){
            if(ans[i]==0){
                for(;cntB[i]==0;++j){

                }
                ans[i]=j;
                --cntB[j];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        n=r.nextInt();
        for(int i=1;i<=n;++i){
            a[i]=r.nextInt();
            ++cntA[a[i]];
        }
        for(int i=1;i<=n;++i){
            int x=r.nextInt();
            ++cntB[x];
        }
        if(check()){
            System.out.println("Yes");
            for(int i=1;i<=n;++i) System.out.print(ans[i]+" ");
        }
        else{
            System.out.println("No");
        }
    }
}
