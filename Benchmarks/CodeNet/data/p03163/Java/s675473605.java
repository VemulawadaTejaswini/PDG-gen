import java.io.*; 
import java.util.*; 
//import javafx.util.*; 
import java.math.*;
//import java.lang.*;
public class Main 
{ 
    
    // static int n;
    // static int n;
    // static int parent[];
    // static int size[];
    // static long ans[];
    // static int arr[];
    static HashSet<Integer> adj[];
    static boolean vis[];
    static long mod=1000000007;
    static final long oo=(long)1e18;
    static int w[];
    static long v[];
    static Long dp[][];
    static int n;
    public static void main(String[] args) throws IOException { 
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        br = new BufferedReader(new InputStreamReader(System.in));
        //int test=nextInt();
        int test=1;
        outer:while(test-->0){
            n=nextInt();
            int W=nextInt();
            w=new int[n];
            v=new long[n];
            dp=new Long[n][W+1];

            for(int i=0;i<n;i++){
                w[i]=nextInt();
                v[i]=nextLong();
            }
            long ans=find(0,W);
            
            pw.println(ans);

        }
        pw.close();
    }
    static long find(int idx,int W){
        if(idx==n||W==0){
            return 0;
        }
        if(dp[idx][W]!=null)
            return dp[idx][W];
        long a=0;long b=0;
        if(w[idx]<=W){
            a=v[idx]+find(idx+1,W-w[idx]);
        }
        
        b=find(idx+1,W);
        
        return dp[idx][W]=Math.max(a,b);
    }
    static void dfs(int v,int par){
        vis[v]=true;
        if(v!=par){
            for(int elem:adj[v]){
                if(!vis[elem]){
                    dfs(elem,par);
                }
            }
        }
    }
    static class Pair implements Comparable<Pair>{
        int x;int y;
        Pair(int x,int y){
            this.x=x;
    
            this.y=y;
        }   
        public int compareTo(Pair p){
            return x-p.x;

        }
    }
    static long ncr(long n,long r){
        if(r==0)
            return 1;
        long val=ncr(n-1,r-1);
        val=(n*val)%mod;
        val=(val*modInverse(r,mod))%mod;
        return val;
    }
    public static BufferedReader br;
    public static StringTokenizer st;
    public static String next() {
        while (st == null || !st.hasMoreTokens()) {
           try{
                st = new StringTokenizer(br.readLine());
            }
            catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }
    public static Integer nextInt() {
        return Integer.parseInt(next());
    }
    public static Long nextLong() {
        return Long.parseLong(next());
    }
 
    public static Double nextDouble() {
        return Double.parseDouble(next());
    }
    public static int[] na(int n)throws IOException{
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = nextInt();
        return a;
    }
    static class query implements Comparable<query>{
        int l,r,idx,block;
        static int len;
        query(int l,int r,int i){
            this.l=l;
            this.r=r;
            this.idx=i;
            this.block=l/len;
        }   
        public int compareTo(query a){
            return block==a.block?r-a.r:block-a.block;
        }
    }
    static boolean isPrime(int n) { 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 ||  
            n % 3 == 0) 
            return false; 
      
        for (int i = 5; 
                 i * i <= n; i = i + 6) 
            if (n % i == 0 || 
                n % (i + 2) == 0) 
                return false; 
      
        return true; 
    } 
    static long gcd(long a, long b) { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }  
    static long power(long x, long y, long m){ 
        if (y == 0) 
            return 1;      
        long p = power(x, y / 2, m) % m; 
        p = (p * p) % m; 
      
        if (y % 2 == 0) 
            return p; 
        else
            return (x * p) % m; 
    }
    static long fast_pow(long base,long n,long M){
        if(n==0)
           return 1;
        if(n==1)
        return base;
        long halfn=fast_pow(base,n/2,M);
        if(n%2==0)
            return ( halfn * halfn ) % M;
        else
            return ( ( ( halfn * halfn ) % M ) * base ) % M;
    }
    static long modInverse(long n,long M){
        return fast_pow(n,M-2,M);
    }
} 