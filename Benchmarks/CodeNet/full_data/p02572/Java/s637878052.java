import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;

import javax.lang.model.util.ElementScanner6; 

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
        FastReader in=new FastReader();
        int t=1;
        //t=in.nextInt();
        while(t-->0)
        {
           long mod=1000000007;
           int n=in.nextInt();
           long arr[]=new long[n];
           long ans=0;
           for(int i=0;i<n;i++)
           {
               arr[i]=in.nextLong();
           }
           long suffarr[]=new long[n];
           suffarr[n-1]=0;
           for(int i=n-2;i>=0;i--)
           {
               suffarr[i]=suffarr[i+1]+arr[i+1];
               
           }
           for(int i=0;i<n-1;i++)
           {
               ans=(ans+arr[i]*suffarr[i])%mod;
               
           }
          
           
            System.out.println(ans);
           
        }
    }
}