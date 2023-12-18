import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
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
     
    public static void println(Object ...x){
        for(Object o:x){
            System.out.println(o);
        }
    }
    public static void print(Object ...x){
        for(Object o:x){
            System.out.print(o);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void fprint(Object x){
        System.out.println(x);
    }
    
    public static void main(String[] args) 
    { 
        FastReader fs=new FastReader();
        long mod =1000000007;
        int a=fs.nextInt();
        int b=fs.nextInt();
        int ans1=(a*(a-1)/2);
        int ans2=(b*(b-1)/2);
        int fans=ans1+ans2;
        System.out.println(fans);
    } 
} 

