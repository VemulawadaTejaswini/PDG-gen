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
///static long[][]dp;
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
static int[][]dp;
static int find(int[]arr,int k,int turn){
    int n = arr.length;
    if(dp[turn][k]!=-1)return dp[turn][k];
    if(turn == 1){
    if(k == 0)return 0;
 //   int ans = 0;
    for(int i=0;i<n;i++){
        if(arr[i] <= k){
            int v = find(arr,k-arr[i],0);
            if(v==0)return dp[turn][k]=1;
        }
    }
    return dp[turn][k]=0;
    }else{
        if(k == 0)return 0;
 //   int ans = 0;
    for(int i=0;i<n;i++){
        if(arr[i] <= k){
            int v = find(arr,k-arr[i],1);
            if(v==0)return dp[turn][k]=1;
        }
    }
    return dp[turn][k]=0;
    }
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
            int k = s.nextInt();
            int[]arr=new int[n];
            dp = new int[2][k+1];
            Arrays.fill(dp[0],-1);
            Arrays.fill(dp[1],-1);
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
           // Arrays.sort(arr);
            int val = find(arr,k,1);
            if(val==1){
                out.println("First");
            }else{
                out.println("Second");
            }
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
