import java.io.BufferedReader; 
import java.io.*;
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;
import java.math.*;
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
   public static void main(String args[])
    {
        FastReader sc=new FastReader();
        PrintWriter pw=new PrintWriter(System.out);
        int t=1;//sc.nextInt();
        long mod=1000000007;
        while(t-->0)
        {
          int n=sc.nextInt(),k=sc.nextInt(),ans=0;
          long a[]=new long[n];
          for(int i=0;i<n;i++) 
          {
              if(i>0)
              a[i]=(sc.nextLong()*a[i-1])%mod;
              else a[i]=sc.nextLong();
          }
          long prev=a[k-1];
          for(int i=k;i<n;i++)
          {
              long m=a[i]/a[i-k];
              if(m>prev) pw.println("Yes");
              else pw.println("No");
              prev=m;
          }
        }
           pw.close();
    }
    static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
  