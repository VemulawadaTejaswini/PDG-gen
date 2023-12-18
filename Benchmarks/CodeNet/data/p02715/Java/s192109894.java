import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 
import java.util.StringTokenizer; 
import java.io.PrintWriter;
import java.io.*;
import java.util.stream.Collectors.*;
import java.lang.*;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;
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
  
    static long modpower(long a, long b,long c)
    {
      if(b==0)
        return 1L;
      long res=modpower(a,b/2,c);
      res*=res;
      res%=c;

      if(b%2==1)
        res=(res*a)%c;

      return res;
    }
 
    
    public static void main(String args[] ) throws Exception 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        FastReader sc=new FastReader();
       // String s=sc.next();
        PrintWriter out=new PrintWriter(System.out);
        long n=sc.nextInt();
        long k=sc.nextInt();
        long[] dp=new long[(int)(k+1)];
        long mod=1000000007;

        for(long x=k;x>=1;x--)
        {
          dp[(int)x]=modpower(k/x, n, mod);
          for(long j=2;x*j<=k;j++)
          {
            dp[(int)x]-=dp[(int)(j*x)];
            dp[(int)x]=(dp[(int)x]+mod)%mod;
          }         
        }

        long ans=0;
        for(int i=1;i<=k;i++)
        {
          //System.out.println(dp[i]);
          ans+=(i*dp[i]);
          ans+=mod;
          ans%=mod;
        }

        System.out.println(ans);
    }
 }
