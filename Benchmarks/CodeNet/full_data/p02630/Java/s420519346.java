import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
 
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
    public static void main (String[] args) 
	{
        //code by sushant kumar
        FastReader in=new FastReader();
        int n=in.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[100001];
        long sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            arr2[arr[i]]++;
            sum+=arr[i];

        }
        int q=in.nextInt();
        for(int i=1;i<=q;i++)
        {
            int b=in.nextInt();
            int c=in.nextInt();
            int val=arr2[b];
            if(b>c)
                sum-=(b-c)*val;
            else
                sum+=(c-b)*val;
            arr2[b]=0;
            arr2[c]+=val;
            System.out.println(sum);


        }
    }
}