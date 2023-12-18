import java.io.*;
import java.util.*;
import java.math.*;
public class Main{

    static long M=(long)1e9+7;
    
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int w=fs.nextInt();
        long[] wei=new long[n+1];
        long[] val=new long[n+1];
        wei[0]=0;
        val[0]=0;
        for(int i=1;i<n+1;i++){
        	wei[i]=fs.nextLong();
        	val[i]=fs.nextLong();
        }
        long[][]dp=new long[n+1][w+1];

        for(int i=1;i<n+1;i++){
        	for(int j=1;j<w+1;j++){
        		if(wei[i]>j){
        			dp[i][j]=dp[i-1][j];
        		}
        		else{
        			dp[i][j]=Math.max(dp[i-1][j-(int)wei[i]]+val[i],dp[i-1][j]);
        		}
        	}
        }
        System.out.println(dp[n][w]);
    }
    public static void p(long[][]dp){
    	for(long[]i:dp){
    		for(long j:i){
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    }
    
    public static long inv(long a, long mod){
        return pow(a, mod-2,mod);
    }
    public static long mul(long a,long b,long mod){
        long res=0;
        while(b!=0){
            if ((b & 1) == 1){ res = (res + a) % mod;}
            a = (a + a) % mod;
            b >>= 1;
        }
        return res;
    }
    
    public static long pow(long a, long n, long mod){
        long res=1;
        while(n != 0){
            if ((n & 1) == 1) res = mul(res, a, mod)%mod;
            a = mul(a , a, mod)%mod;
            n >>= 1;
        }
        return res;
    }
    
    public static long gcd(long a, long b){
        if(a == 0) return b;
        return b == 0 ? a: gcd(b, a % b);
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
