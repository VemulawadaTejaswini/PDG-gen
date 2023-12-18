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
static long[][]a;
static long[]dp;
static int n;
static long[]pre;

static void rec(int i,ArrayList<Integer> hs,long score,int mask,int grp){
    if(i==hs.size()){
        dp[mask] = Math.max(dp[mask],score+pre[grp]);
        return;
    }
    
    rec(i+1,hs,score,mask,grp);
    rec(i+1,hs,score,mask^(1<<hs.get(i)),grp^(1<<hs.get(i)));
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
            a = new long[n][n];
            for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            a[i][j]=s.nextLong();
           dp = new long[(1<<n)];
           pre = new long[(1<<n)];
           for(int mask=0;mask<(1<<n);mask++){
               for(int i=0;i<n;i++){
                   if((mask&(1<<i)) > 0){
                       for(int j=i+1;j<n;j++){
                           if((mask&(1<<j)) > 0){
                               pre[mask] += a[i][j];
                           }
                       }
                   }
               }
           }
           Arrays.fill(dp,0);
           dp[0] = 0;
           for(int mask = 0 ; mask < (1<<n);mask++){
               int cur = mask;
               ArrayList<Integer> hs = new ArrayList<>();
               for(int i=0;i<n;i++){
                   if((cur&(1<<i)) == 0)
                   hs.add(i);
               }
              rec(0,hs,dp[mask],mask,0);
           }
           out.println(dp[(1<<n)-1]);
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
