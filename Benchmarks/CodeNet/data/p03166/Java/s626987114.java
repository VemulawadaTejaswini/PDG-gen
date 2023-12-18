import java.io.*;
import java.util.*;
import java.math.*;

 
 public class Main{
   static class Pair implements Comparable<Pair>{
   int a;
   int b;
   public Pair(int x,int y){a=x;b=y;}
   public Pair(){}
   public int compareTo(Pair p1){
       if(a == p1.a)
       return b - p1.b;
       return a - p1.a;
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
  public static int gcd(int a,int b)
  {
    if(a<b)
      return gcd(b,a);
    if(b==0)
      return a;
    return gcd(b,a%b);
    
  }
  //static long ans = 0;
  static long mod = (long)(1e9+7);
   
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
static ArrayList<ArrayList<Integer>>adj;
static boolean[]vis;
static int[]dp;
static int dfs(int sv){
    vis[sv]=true;
    int ans = 0;
    if(dp[sv]!=-1)return dp[sv];
    for(int i=0;i<adj.get(sv).size();i++){
        int x = adj.get(sv).get(i);
        if(true){
            int len = 1+dfs(x);
            ans = Math.max(ans,len);
        }
    }
    return dp[sv]=ans;
}

 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;
        int tc = 0;
        while(tc++<t){
            int n = s.nextInt();
            int m = s.nextInt();
            adj=new ArrayList<>();
            for(int i=0;i<=n;i++)adj.add(new ArrayList<>());
            for(int i=0;i<m;i++){
                int u = s.nextInt();
                int v = s.nextInt();
                adj.get(u).add(v);
              //  adj.get(v).add(u);
            }
            dp = new int[n+1];
            Arrays.fill(dp,-1);
            vis = new boolean[n+1];
            int ans = 0;
            for(int i=1;i<=n;i++){
                if(!vis[i]){
                    ans = Math.max(ans,dfs(i));
                }
            }
            out.println(ans);
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
