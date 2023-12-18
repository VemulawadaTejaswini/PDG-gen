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
static int n;
static double find(int c1,int c2,int c3){
    if(c1==0 && c2==0 && c3==0)return 0;
    if(c2==0 && c3==0 && c1==1)return n;
    double ans = 0;
    if(dp[c1][c2][c3]!=-1)return dp[c1][c2][c3];
    if(c3 > 0){
        ans += find(c1,c2+1,c3-1)*c3/(c1+c2+c3);
    }
    if(c2 > 0){
     ans += find(c1+1,c2-1,c3)*c2/(c1+c2+c3);   
    }
    if(c1 > 0){
        ans += find(c1-1,c2,c3)*c1/(c1+c2+c3);
    }
    ans += n*1.0/(c1+c2+c3);
    return dp[c1][c2][c3] = ans;
    
}
static double[][][]dp;
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
            n = s.nextInt();
            int[]a=new int[n];
            dp = new double[n+1][n+1][n+1];
            for(int i=0;i<=n;i++)
            for(int j=0;j<=n;j++)
            Arrays.fill(dp[i][j],-1);
            int cnt1=0,cnt2=0,cnt3=0;
            int cnt = 0;
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
                if(a[i]==1)cnt1++;
                else if(a[i]==2)cnt2++;
                else cnt3++;
            }
            out.println(find(cnt1,cnt2,cnt3));
          //  out.println(dp[cnt1][cnt2][cnt3]);
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
