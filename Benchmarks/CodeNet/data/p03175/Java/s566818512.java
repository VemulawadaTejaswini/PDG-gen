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
 static int n;
 static boolean[]vis;
 static long[]dpw;
 static long[]dpb;
static void dfs(int sv){
    vis[sv] = true;
    ArrayList<Integer> cur_adj=new ArrayList<>();
    for(int i=0;i<adj.get(sv).size();i++){
        int x = adj.get(sv).get(i);
        if(vis[x])continue;
        dfs(x);
        cur_adj.add(x);
    }
     dpb[sv] = 1;
      dpw[sv] = 1;
  ///  if(cur_adj.size()==0)return;
   
    for(int i=0;i<cur_adj.size();i++){
        int x = cur_adj.get(i);
        dpb[sv] = (dpb[sv]*dpw[x])%mod;
    }
   
    for(int i=0;i<cur_adj.size();i++){
        int x = cur_adj.get(i);
        dpw[sv] = (dpw[sv]*((dpw[x]+dpb[x])%mod))%mod;
    }
    if(dpb[sv] < 0)dpb[sv]+=mod;
    if(dpw[sv] < 0)dpw[sv]+=mod;
    
    
    
}
static TrieNode root;
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;
        int tc = 0;
        long mxx = (long)(1e18+5);
        while(tc++<t){
            n = s.nextInt();
            adj = new ArrayList<>();
            dpw=new long[n];
            dpb=new long[n];
            for(int i=0;i<=n;i++)adj.add(new ArrayList<>());
            for(int i=0;i<n-1;i++){
                int x = s.nextInt()-1;
                int y = s.nextInt()-1;
                adj.get(x).add(y);
                adj.get(y).add(x);
            }
            vis = new boolean[n];
            dfs(0);
            long ans = ((dpw[0]+dpb[0])%mod+mod)%mod;
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
