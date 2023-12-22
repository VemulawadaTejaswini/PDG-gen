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
    static long[] ans=new long[100001];
     public static void main (String[] args) throws java.lang.Exception {
        FastReader sc=new FastReader();
        PrintWriter pw=new PrintWriter(System.out);
    	int t=1;//sc.nextInt();
        while (t-- > 0){
            int x = sc.nextInt(),n=sc.nextInt();
            int a[]=new int[101];
            for(int i=0;i<n;i++) a[sc.nextInt()]=1;
            if(n==0) pw.println(x);
            else{
               int i=x,j=x;
               while(true)
               {
                   if(a[i]==0)
                   {
                       pw.println(i);
                       break;
                   }
                   if(a[j]==0)
                   {
                       pw.println(j);
                       break;
                   }
                   i--;j++;
               } 
            }
        }
    pw.close();
     }
}

  