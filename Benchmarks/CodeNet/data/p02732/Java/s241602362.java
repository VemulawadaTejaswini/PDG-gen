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
        long ans=0,mod=1000000007;
        while(t-->0)
        {
         int n=sc.nextInt();long a[]=new long[n];
         Map<Long,Long> mp=new HashMap<>();
         for(int i=0;i<n;i++)
         mp.merge(a[i]=sc.nextLong(),1l,Long::sum);
         long to=0;
         for(long key:mp.keySet())
         {
           long v=mp.get(key);
           to+=(v*(v-1))/2;
         }
         for(long w:a)
         {
             long v=mp.get(w);
             pw.println(to- v*(v-1)/2 + (v-1)*(v-2)/2);
         }
        }
           pw.close();
    }
}
  