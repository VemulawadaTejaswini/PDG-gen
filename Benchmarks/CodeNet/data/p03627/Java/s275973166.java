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
        while(t-->0)
        {
         Map<Long,Long> m=new TreeMap<>(Collections.reverseOrder());
         int n=sc.nextInt();
         for(int i=0;i<n;i++) m.merge(sc.nextLong(),1l,Long::sum);
         long ans=0,temp=0,f=0;
         for(Long w:m.keySet())
           {
               if(m.get(w)>=2) 
               {
                   temp++;
                   if(m.get(w)>=4 && temp==0) 
                   {pw.println(w*w);ans=1;break;}
                   if(temp==2) {pw.println(ans*w);ans=1;break;}
                   ans=w;
               }
           }
           if(ans!=1)
           pw.println(0);
        }
           pw.close();
    }
}
  