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
static int mxN = (int)(1e5+5);
static long[]fact,inv_fact;
static long my_inv(long a) {
	return pow(a,mod-2);
}
static long bin(int a,int b) {
	if(a < b || a<0 || b<0)return 0;
    return ((fact[a]*inv_fact[a-b])%mod * inv_fact[b])%mod;
}

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
        	int n = s.nextInt();
        	long m = s.nextLong();
        	long[]a=new long[n];
        	for(int i=0;i<n;i++)a[i] = s.nextLong()/2;
        	long lcm = 1,gcd=1;
        	for(int i=0;i<n;i++) {
        		lcm = lcm(a[i],lcm);
        	}
        //	out.println(lcm);
        	long ans = 0;
        	long times = m / lcm;
        	if(lcm % 2 == 0)out.println("0");
        	else {
        		long last = m - m%lcm;
        		ans = times/2;
        		if(last%2!=0)ans++;
        		out.println(ans);
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
