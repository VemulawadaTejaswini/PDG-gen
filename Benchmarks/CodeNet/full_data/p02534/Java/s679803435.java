import java.util.*;
import java.io.*;
import java.math.*;

public class Main 

{ 
static int mod=1000000007;
	 static FastReader sc=new FastReader(); 
	 
		  public static void main(String[] args) 
    {
			  //PrintWriter out=new PrintWriter(System.out);
			 // StringBuffer sb=new StringBuffer("");
			    int t = 1; 
		        while (t-- > 0) 
				{ 
		        	
		        		
		        	int n=i();
		        for(int i=0;i<n;i++)
                  System.out.print("ACL");
		        			
		        	
		        	
		        	
		        	
		        	
		       
		        	
		        	
				}
		        
		        
		        
		       // System.out.println(sb.toString());
		        //out.close();
			  
			  
			  
    }
		  
		  static int c(int A[],int i,int n,int k,int dp[]){
			  if(dp[i]!=-1) {
				  return dp[i];
			  }
			    if(i>=n)
			    return 0;
			    int y=A[i];
			    int ind=-1;
			    for(int j=i+1;j<n;j++){
			        if(Math.abs(y-A[j])<=k){
			            ind=j;
			            break;
			        }
			    }
			    int op1;
			    if(ind==-1&&i==n-1)
			    	op1=1;
			    else if(ind==-1)
			    	op1=0;
			    else
			     op1=1+c(A,ind,n,k,dp);
			    int op2=c(A,i+1,n,k,dp);
			    dp[i]= Math.max(op1,op2);
			    return dp[i];
			    
			}
		  
		  
		  
		  
		  static boolean Prime(int n) 
		    { 
		        if (n <= 1) 
		            return false; 
		        if (n <= 3) 
		            return true; 
		        if (n % 2 == 0 || n % 3 == 0) 
		            return false; 
		  
		        for (int i = 5; i * i <= n; i = i + 6) 
		            if (n % i == 0 || n % (i + 2) == 0) 
		                return false; 
		  
		        return true; 
		    } 
static int[] input(int n) {
	int A[]=new int[n];
	   for(int i=0;i<n;i++) {
		   A[i]=sc.nextInt();
	   }
	   return A;
   }
static long[] inputL(int n) {
	long A[]=new long[n];
	   for(int i=0;i<n;i++) {
		   A[i]=sc.nextLong();
	   }
	   return A;
   }
static String[] inputS(int n) {
	String A[]=new String[n];
	   for(int i=0;i<n;i++) {
		   A[i]=sc.next();
	   }
	   return A;
   }


static void input(int A[],int B[]) {
	   for(int i=0;i<A.length;i++) {
		   A[i]=sc.nextInt();
		   B[i]=sc.nextInt();
	   }
}
static long mod(long x) {
	  return ((x%mod + mod)%mod);
}

     static int i() {
    	 return sc.nextInt();
     }
     static String s() {
    	 return sc.next();
     }
     static long l() {
    	 return sc.nextLong();
     }  
     static void sort(int[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }
        Arrays.sort(arr);
     }
     static int gcd(int a, int b) 
     { 
         if (a == 0) 
             return b; 
         return gcd(b % a, a); 
     } 
  
        
        
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
} 



