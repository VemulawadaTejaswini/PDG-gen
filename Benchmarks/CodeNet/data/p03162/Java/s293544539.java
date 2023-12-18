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
static long[][]dp;
static int maxV;
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
static void dfs
(ArrayList<ArrayList<Integer>>adj,int sv,boolean[]vis,int[]x){}
static TrieNode root;
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;
        int tc = 0;
      //  maxV = 300000;
        while(tc++<t){
            int n = s.nextInt();
            int[]a=new int[n];
            int[]b=new int[n];
            int[]c=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
                b[i]=s.nextInt();
                c[i]=s.nextInt();
            }
            int[][]dp=new int[3][n];
            if(n == 1){
                out.println(Math.max(a[0],Math.max(b[0],c[0])));
                break;
            }
            dp[0][0] = a[0];
            dp[1][0] = b[0];
            dp[2][0] = c[0];
            for(int i=1;i<n;i++){
                dp[0][i] = a[i] + Math.max(dp[1][i-1],dp[2][i-1]);
                dp[1][i] = b[i] + Math.max(dp[0][i-1],dp[2][i-1]);
                dp[2][i] = c[i] + Math.max(dp[0][i-1],dp[1][i-1]);
            }
           out.println(Math.max(dp[0][n-1],Math.max(dp[1][n-1],dp[2][n-1])));
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