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
 
            long x=in.nextLong();
            long k=in.nextLong();
            long d=in.nextLong();

            long zeroth=x/d;
      

            if(zeroth>=k)
                System.out.println(x-(k*d));

            else
            {
                k-=zeroth;
                long val=x-(zeroth*d);
                if(k%2==1)
                {
                    System.out.println(Math.abs(val-d));
                }
                else
                    System.out.println(val);

            }
            
           
        }
    }
}