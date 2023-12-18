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
    public static int n;
    public static final int N=305;
    public static double [][][]dp=new double[N][N][N];
    public static boolean [][][] used=new boolean[N][N][N];
    public static double solve(int a,int b,int c){
        if(a<0||b<0||c<0) return 0;
        if(a+b+c==0) return 0;
        double res=dp[a][b][c];
        if(used[a][b][c]) return res;
        used[a][b][c]=true;
        res=0;
        int rem=n-a-b-c;
        res=(double)rem/n+(double)a/n*(solve(a-1,b,c)+1)+(double)b/n*(solve(a+1,b-1,c)+1)+(double)c/n*(solve(a,b+1,c-1)+1);
        res/=1-(double)rem/n;
        return dp[a][b][c]=res;
    }

    public static FastReader r=new FastReader();
    public static void main(String[] args){
        n=r.nextInt();
        int []cnt=new int[4];
        for(int i=0;i<n;++i) {
            int x=r.nextInt();
            ++cnt[x];
        }
        System.out.println(solve(cnt[1],cnt[2],cnt[3]));
    }
}
