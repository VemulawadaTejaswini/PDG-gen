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
      return Integer.compare(a, p.a);
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
  static long mod =(long)(1e9+7); //998244353;//
   
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
    return ((fact[a]*inv_fact[a-b])%mod * inv_fact[b])%mod;
}

static ArrayList<ArrayList<Integer>>adj ;
static int n,m;
static int[][]a,b;
static int[][][][]dp;
static int rec(int i,int j,int red,int blue) {
	if(i >= n || j >= m) {
		return (int)1e9;
	}
	if(i==n-1&&j==m-1) {
		return Math.min(Math.abs(red+a[i][j] - blue-b[i][j]), Math.abs(red+b[i][j] - blue-a[i][j]));
	}
	if(dp[i][j][red][blue]!=-1)return dp[i][j][red][blue];
	int o1 = rec(i+1,j,red+a[i][j],blue+b[i][j]);
	int o2 = rec(i+1,j,red+b[i][j],blue+a[i][j]);
	int o3 = rec(i,j+1,red+a[i][j],blue+b[i][j]);
	int o4 = rec(i,j+1,red+b[i][j],blue+a[i][j]);
	return dp[i][j][red][blue] = Math.min(Math.min(o3, o4),Math.min(o1, o2));
	
}

 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;//s.nextInt();
        mxx = (long)(1e18+5);
 
        while(t-->0){
        	n = s.nextInt();
        	m = s.nextInt();
        	a = new int[n][m];
        	b = new int[n][m];
        	for(int i=0;i<n;i++) {
        		for(int j=0;j<m;j++) {
        			a[i][j]=s.nextInt();
        		}
        	}
        	for(int i=0;i<n;i++) {
        		for(int j=0;j<m;j++) {
        			b[i][j]=s.nextInt();
        		}
        	}
        	dp = new int[n][m][80*80+1][1+80*80];
        	for(int i=0;i<n;i++)
        		for(int j=0;j<m;j++)
        			for(int k=0;k<80*80;k++)
        				Arrays.fill(dp[i][j][k], -1);
        	out.println(rec(0,0,0,0));
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
