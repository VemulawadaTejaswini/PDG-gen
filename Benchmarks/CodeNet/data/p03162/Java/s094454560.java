import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	//Fast IO class
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
        	boolean env=System.getProperty("ONLINE_JUDGE") != null;
        	if(env) {
        		try {
					br=new BufferedReader(new FileReader("src\\input.txt"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
        	}
        	else {
        		br = new BufferedReader(new
                        InputStreamReader(System.in)); 
        	}
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
    
    static long MOD=1000000000+7;
    
    //Brian Kernighan’s Algorithm
    static long countSetBits(long n){
        if(n==0) return 0;
        return 1+countSetBits(n&(n-1));
    }
    //Euclidean Algorithm
    static long gcd(long A,long B){
        if(B==0) return A;
        return gcd(B,A%B);
    }
    //Modular Exponentiation
    static long fastExpo(long x,long n){
        if(n==0) return 1;
        if((n&1)==0) return fastExpo((x*x)%MOD,n/2)%MOD;
        return ((x%MOD)*fastExpo((x*x)%MOD,(n-1)/2))%MOD;
    }
    //Prime Number Algorithm
    static boolean isPrime(long n){
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6)
            if(n%i==0 || n%(i+2)==0) return false;
        return true;
    }
    //Sieve of eratosthenes
    static int[] findPrimes(int n){
        boolean isPrime[]=new boolean[n+1];
        ArrayList<Integer> a=new ArrayList<>();
        int result[];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=n;++i){
            if(isPrime[i]==true){
                for(int j=i*i;j<=n;j+=i) isPrime[j]=false;
            }
        }
        for(int i=0;i<=n;i++) if(isPrime[i]==true) a.add(i);
        result=new int[a.size()];
        for(int i=0;i<a.size();i++) result[i]=a.get(i);
        return result;
        
    } 
    // Pair
    static class pair{
    	int x,y;
    	pair(int a,int b){
    		this.x=a;
    		this.y=b;
    	}
    	public boolean equals(Object obj) {
    		if(obj == null || obj.getClass()!= this.getClass()) 
                return false;
            pair p = (pair) obj;
            return (this.x==p.x && this.y==p.y);
        }
    	public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    //Main function
    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader sc=new FastReader();
    	int test=1;
        while(test-->0) {
        	int n=sc.nextInt();
        	int a[][]=new int[n][3];
        	for(int i=0;i<n;i++) {
        		for(int j=0;j<3;j++) a[i][j]=sc.nextInt();
        	}
        	long dp[][]=new long[n+1][3];
        	for(int i=0;i<3;i++) dp[1][i]=a[0][i];
        	for(int i=2;i<=n;i++) {
        		dp[i][0]=a[i-1][0]+Math.max(dp[i-1][1], dp[i-1][2]);
        		dp[i][1]=a[i-1][1]+Math.max(dp[i-1][0], dp[i-1][2]);
        		dp[i][2]=a[i-1][2]+Math.max(dp[i-1][0], dp[i-1][1]);
        	}
        	System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
        }
    }
}