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

static long mxx;
static int n,m;
static int[]w,s;
static long[]v;
static class tuple implements Comparable<tuple>{
    int w,s;
    long v;
    public tuple(int w,int s,long v){this.w=w;this.s=s;this.v=v;}
    public int compareTo(tuple b){
        return (b.w+b.s-w-s);
    }
}
static tuple[]arr;
static long[]dp;

 public static void solve() throws Exception {
   // solve the problem here
   MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;
        int tc = 0;
        mxx = (long)(1e18+5);
        while(tc++<t){
            n = sc.nextInt();
            w=new int[n];
            s=new int[n];
            v=new long[n];
            arr=new tuple[n];
            int mxs = 0;
        //     Arrays.fill(dp,-1);
           for(int i=0;i<n;i++){
               w[i]=sc.nextInt();
               s[i]=sc.nextInt();
               v[i]=sc.nextLong();
               arr[i]=new tuple(w[i],s[i],v[i]);
              mxs = Math.max(mxs,s[i]);
           }
            dp = new long[mxs+1];
           Arrays.sort(arr);
           for(int i=0;i<n;i++){
               for(int j=arr[i].w;j<=mxs;j++){
                   int ind = Math.min(j-arr[i].w,arr[i].s);
                  dp[ind] = Math.max(dp[ind],dp[j] + arr[i].v);
               }
               dp[arr[i].s] = Math.max(dp[arr[i].s],arr[i].v);
           }
           long ans = 0;
           for(int i=0;i<=mxs;i++){
               ans = Math.max(ans,dp[i]);
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
