
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.math.*;
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
 
 
 
public class Main {
	
	
 
	static int k;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
 
        	int n=in.nextInt();
        	int k=in.nextInt();
        	int[] h=new int[n];
        	for(int i=0;i<n;i++) {
        		h[i]=in.nextInt();
        	}
        	int[][] dp=new int[n][k];
           	int i=1;
           
           	while(i<n) {
           		int j=1;
           		while(j<=k ) {
           			int z=0;
           			int m=Integer.MAX_VALUE;
           			while(z<k && i-j>=0) {
           				//System.out.println(m+"m");
           				m=Math.min(m, dp[i-j][z]);
           				
           				z++;
           				
           			}
           			if(i-j<0) {
           				dp[i][j-1]=Math.abs(h[i]-h[0]);
           			}
           			else {
           				dp[i][j-1]=m+Math.abs(h[i]-h[i-j]);
           			}
           			
           			
           		//	System.out.println(dp[i][j-1]+" "+i+" "+(j-1));
           			j++;
           			
           		}
           		i++;
           	}
           	
           	int m=Integer.MAX_VALUE;
           	for(i=0;i<k;i++) {
           		m=Math.min(dp[n-1][i], m);
           		
           	}
        	System.out.println(m);
        }
        
        
    }
   
    		
    	
    	
    
    static long sumAP(long a, long d, long n) 
    { 
    	int mod = 1000000007;
    	long sum = (n*modInverse(2,mod)%mod) ; 
    	long temp = (n-1)%mod;
    	temp+= 2*a;
    	temp%=mod;
    	temp = (temp * d)%mod;
    	sum = (sum*temp)%mod;	
        return (long) sum; 
    }
    public static long digSum(long number) {
        long digitSum = 0;
 
        while (number > 0) {
            digitSum = digitSum + (number % 10);
            number = number / 10;
        }
 
        return digitSum;
    }
    
    static int comb(int n , int r)
	{
		if( r== 0 || n == r)
			return 1;
		else
			return comb(n-1,r)+comb(n-1,r-1);
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
    static int mod(String num, int a) 
    { 
          
        int res = 0; 
  
 
        for (int i = 0; i < num.length(); i++) 
            res = (res * 10 + (int)num.charAt(i) 
                                     - '0') % a; 
  
        return res; 
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
    public static void sort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(a, low, mid); 
        sort(a, mid, high); 
        // merge two sorted subarrays
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
    static long modInverse(int a, int m) 
    { 
        int g = gcd(a, m); 
        if (g != 1) {
        	
        }          
        else 
        { 
        	return  fexp(a, m - 2, m); 
        }
		return g; 
    } 
   
    
}
 