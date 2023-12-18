import java.io.*;
import java.util.*;
import java.math.*;

 
 public class Main	{
   static class Pair implements Comparable<Pair>{
   int a;
   int b;
   public Pair(int x,int y){a=x;b=y;}
   public Pair(){}
   public int compareTo(Pair p){
	 return p.a - a;
   }



 }
static class TrieNode{
  TrieNode[]child;
  int w;
  boolean term;
  TrieNode(){
    child = new TrieNode[26];  
  }
}
  public static long gcd(long a,long b)
  {
    if(a<b)

      return gcd(b,a);
    if(b==0)
      return a;
    return gcd(b,a%b);
    
  }
  static long lcm(long a,long b) {
	  return a*b / gcd(a,b);
  }
  //static long ans = 0;
  static long mod = (long)(1e9+7);///998244353;
   
    public static void main(String[] args) throws Exception {
       new Thread(null, null, "Anshum Gupta", 99999999) {
            public void run() {
                try {
                    solve();
                } catch(Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }.start();
    }

static long pow(long x,long y){
    if(y == 0)return 1;
    if(y==1)return x;
    long a = pow(x,y/2);
    a = (a*a)%mod;
    if(y%2==0){
        return a;
    }
    return (a*x)%mod;
}

static long mxx;
static int mxN = (int)(3e5+5);
static long[]fact,inv_fact;
static long my_inv(long a) {
	return pow(a,mod-2);
}
static long bin(int a,int b) {
	if(a < b || a<0 || b<0)return 0;
    return ((fact[a]*inv_fact[a-b])%mod * inv_fact[b])%mod;
}
static long[]dp;
static long[]ans;
static int[]size;
static ArrayList<ArrayList<Integer>>adj;
static boolean[]vis;
static void dfs(int sv) {
	vis[sv] = true;
	size[sv] = 1;
	ArrayList<Integer>temp = new ArrayList<Integer>();
	for(int x : adj.get(sv)) {
		if(!vis[x]) {
			temp.add(x);
			dfs(x);
			size[sv]+=size[x];
		}
	}
	dp[sv] = fact[size[sv]-1];
	for(int x : temp) {
		dp[sv] *= dp[x];
		dp[sv] %= mod;
		dp[sv] *= inv_fact[size[x]];
		dp[sv] %= mod;
	}
}
static void dfs2(int sv) {
	vis[sv] = true;
	for(int x : adj.get(sv)) {
		if(vis[x])continue;
		dp[x] = size[x];
		dp[x] *= dp[sv];
		dp[x] %= mod;
		dp[x] *= my_inv(n-size[x]);
		dp[x] %= mod;
		dfs2(x);
	}
}
static int n;
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int tc = 1;//s.nextInt();
        mxx = (long)(1e18+5);
       fact=new long[mxN];
       inv_fact = new long[mxN];
       fact[0]=inv_fact[0]=1L;
       for(int i=1;i<mxN;i++) {
    	   fact[i] = (i*fact[i-1])%mod;
    	   inv_fact[i] = my_inv(fact[i]);
       }
        while(tc-->0){
        	n = s.nextInt();
        	adj = new ArrayList<ArrayList<Integer>>();
        	for(int i=0;i<=n;i++)adj.add(new ArrayList<Integer>());
        	for(int i=0;i<n-1;i++) {
        		int a = s.nextInt();
        		int b = s.nextInt();
        		adj.get(a).add(b);
        		adj.get(b).add(a);
        	}
        	vis = new boolean[n+1];
        	size = new int[n+1];
        	dp = new long[n+1];
        //	ans = new long[n+1];
        	dfs(1);
      //  	for(int i=1;i<=n;i++)out.print(size[i]+" ");
        	Arrays.fill(vis, false);
        	dfs2(1);
        	for(int i=1;i<=n;i++)
        	out.println(dp[i]);
        }
        
           
        out.flush();
}
 
     
 
 
 
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
 
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
         
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}
