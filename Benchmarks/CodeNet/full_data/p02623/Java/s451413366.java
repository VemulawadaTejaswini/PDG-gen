import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
 
public class at172c
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
    public static void main (String[] args) 
	{
        //code by sushant kumar
        FastReader in=new FastReader();
        int n=in.nextInt();
        int m=in.nextInt();
        long k=in.nextLong();
        long arr1[]=new long[n+1];
        long arr2[]=new long[m+1];
        long a[]=new long[n+1];
        long b[]=new long[m+1];

        for(int i=1;i<n+1;i++)
        {
            arr1[i]=in.nextLong();
            a[i]=arr1[i]+a[i-1];
        }
        for(int i=1;i<m+1;i++)
        {
            arr2[i]=in.nextLong();
            b[i]=arr2[i]+b[i-1];
        }
        long ans=0; int j=m;
        for(int i=1;i<n+1;i++)
        {
            if(a[i]>k)
                break;
            while(a[i]+b[j]>k)
                j--;
            ans=Math.max(ans,i+j);
        }
        System.out.println(ans);

    

       
    }
}