import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class octlunch
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
        int n=fs.nextInt();
        long k=fs.nextLong();
        int[] arr =new int[n];
        int t1=0,t2=0;
        for(int i=0;i<n;i++){
            arr[i]=fs.nextInt();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    t1+=1;
                }
            }
        }
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    t2+=1;
                }
            }
        }
        long ans1=(t1*k)%mod;
        long base=(k*(k-1)/2)%mod;
        long ans2=(t2*base)%mod;
        long fans=(ans1+ans2)%mod;
        print(fans);
    } 
} 
