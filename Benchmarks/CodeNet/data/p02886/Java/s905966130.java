

import java.io.OutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.math.*;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
 
public class Main {
	
	static int MD= 998244353;
    public static void main(String[] args) throws IOException {
    	OutputStream outputStream = System.out;
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class TaskC {
    
        public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {   
        	int t=1;
        	while(t-->0) {
        		
        		int n=in.nextInt();
        		int[] a=new int[n];
        		long res=0;
        		for(int i=0;i<n;i++) {
        			a[i]=in.nextInt();
        		}
        		for(int i=0;i<n;i++) {
        			for(int j=i+1;j<n;j++) {
        				res+=a[i]*a[j];
        			}
        		}
        			
        		out.println(res);
        		
        	}
        	
        }

    }
   
    
    static class InputReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public InputReader()
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
    static void sort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        sort(a, low, mid); 
        sort(a, mid, high); 
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
    public static long fexp(long x, long y, long p) {
        long res = 1;      
        
       
        x = x % p;  
      
        while (y > 0) 
        { 
         
            if((y & 1)==1) 
                res = (res * x) % p; 
      
          
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return res; 
        
    }
    static int gcd(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        return gcd(b, a % b);  
          
    }
    
    
    
}
