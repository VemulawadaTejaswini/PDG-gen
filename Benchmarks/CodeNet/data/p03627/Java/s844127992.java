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
         Map<Integer,Integer> m=new TreeMap<>(Collections.reverseOrder());
         int n=sc.nextInt();
         for(int i=0;i<n;i++) m.merge(sc.nextInt(),1,Integer::sum);
         int ans=0,temp=0;
         for(Integer w:m.keySet())
           {
               if(m.get(w)>=2) 
               {
                   temp++;
                   if(m.get(w)>=4) {ans=w*w;break;}
                   if(temp==2) {ans=ans*w;break;}
                   ans=w;
               }
           }
           pw.println(ans);
        }
           pw.close();
    }
}
  