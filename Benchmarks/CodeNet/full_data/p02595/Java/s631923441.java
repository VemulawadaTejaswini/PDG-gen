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
        int t=sc.nextInt();double d=sc.nextDouble();
        long ans=0,mod=1000000007;
        while(t-->0)
        {
         long x=sc.nextLong(),y=sc.nextLong();
         double p=Math.sqrt(x*x+y*y);
         if(p<=d) ans++;
        }
        pw.println(ans);
           pw.close();
    }
}
  