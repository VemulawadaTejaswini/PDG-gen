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
static class tuple{
    long a,b;
    public tuple(long x,long y){a=x;b=y;}
}
static tuple merge(tuple a,tuple b){
    tuple ans = new tuple(0,0);
        ans.a = ((a.a*b.a)%m+m)%m;
        ans.b = ((((a.a*b.b)%m) + ((a.b*((b.a+b.b)%m))%m))%m+m)%m;
        return ans;
}
static long mxx,m;
static int n;
static ArrayList<ArrayList<Integer>>adj;
static ArrayList<ArrayList<Integer>> children;
static ArrayList<ArrayList<tuple>> downs,pre,suf;
static tuple[]up,down;
static long[]all_white,white_with_some_black,black;
static boolean[]vis;
static long[]ans;
static void dfs(int sv){
    vis[sv] = true;
    tuple cur = new tuple(1,0);
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0;i<adj.get(sv).size();i++){
        int x = adj.get(sv).get(i);
        if(vis[x])continue;
        children.get(sv).add(x);
        dfs(x);
        cur = merge(cur,down[x]);
        downs.get(sv).add(down[x]);
    }
    
    down[sv] = new tuple(cur.a,(((cur.a+cur.b)%m)+m)%m);
}
static void dfs2(int sv){
    
    for(int i=0;i<children.get(sv).size();i++){
        tuple cur = new tuple(1,0);
        if(i!=0){
            cur = merge(cur,pre.get(sv).get(i-1));
        }
        if(i!=children.get(sv).size()-1){
            cur = merge(cur,suf.get(sv).get(i+1));
        }
        if(sv!=0){
            cur = merge(cur,up[sv]);
        }
        int x = children.get(sv).get(i);
        up[x] = new tuple(cur.a , (cur.a+cur.b)%m);
        dfs2(x);
    }
}
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;
        int tc = 0;
        mxx = (long)(1e18+5);
        while(tc++<t){
            n = s.nextInt();
            m = s.nextLong();
            adj = new ArrayList<>();
            children=new ArrayList<>();
            downs = new ArrayList<>();
            pre = new ArrayList<>();
            suf = new ArrayList<>();
            up = new tuple[n];
            down = new tuple[n];
            for(int i=0;i<=n;i++){
                adj.add(new ArrayList<>());
                children.add(new ArrayList<>());
                downs.add(new ArrayList<>());
                pre.add(new ArrayList<>());
                suf.add(new ArrayList<>());
             //   up.add(new ArrayList<>());
            }
            all_white=new long[n];
            white_with_some_black=new long[n];
            black=new long[n];
            vis=new boolean[n];
            for(int i=0;i<n-1;i++){
                int x = s.nextInt()-1;
                int y = s.nextInt()-1;
                adj.get(x).add(y);
                adj.get(y).add(x);
            }
            dfs(0);
            
            
            for(int i=0;i<n;i++){
                int k = children.get(i).size();
                tuple cur = new tuple(1,0);
                for(int j=0;j<k;j++){
                    cur = merge(cur,downs.get(i).get(j));
                    pre.get(i).add(cur);
                }
                cur = new tuple(1,0);
                for(int j=k-1;j>=0;j--){
                    cur = merge(cur,downs.get(i).get(j));
                    suf.get(i).add(cur);
                }
                Collections.reverse(suf.get(i));
            }
            
         //   vis = new boolean[n];
            dfs2(0);
            
            for(int i=0;i<n;i++){
                tuple ans = new tuple(1,0);
                if(i!=0){
                    ans = merge(ans,up[i]);
                }
                if(children.get(i).size()!=0){
                    ans = merge(ans,suf.get(i).get(0));
                }
                out.println(((ans.a+ans.b)%m+m)%m);
              
            }
        }
           
      ////  out.println(up[2].b+"  "+up[3].b);
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
