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
            int n=in.nextInt();
            long ans=1;
            for(int i=2;i<=n;i++)
            {
                long val=0;
                int flag=0;
                for(int j=1;j*j<=i;j++)
                {   
                    if(i%j==0)
                    {
                        val++;
                    }
                    if(j*j==i)
                        flag=1;
                    
                }
                val*=2;
                if(flag==1)
                    val-=1;
              
                ans+=(val*i);
            }
            System.out.println(ans);

        }

    }
}