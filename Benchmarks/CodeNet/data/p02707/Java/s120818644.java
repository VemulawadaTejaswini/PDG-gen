import java.io.*;
import java.util.*;
import java.math.*;

 
 public class Main	{
   static class Pair implements Comparable<Pair>{
   int a;
   int b;
   public Pair(int x,int y){a=x;b=y;}
   public Pair(){}
   public int compareTo(Pair p1){
      return a+b-p1.a-p1.b;
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
  static long mod = 998244353;//(long)(1e9+7);
   
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
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;//s.nextInt();
        mxx = (long)(1e18+5);
 
        while(t-->0){
        	int n = s.nextInt();
        	ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        	for(int i=0;i<=n;i++)adj.add(new ArrayList<Integer>());
        	for(int i=2;i<=n;i++) {
        		int x = s.nextInt();
        		adj.get(x).add(i);
        		adj.get(i).add(x);
        	}
        	Queue<Pair> q = new LinkedList<Pair>();
        	q.add(new Pair(1,1));
        	
        	boolean[]vis = new boolean[n+1];
        	int[]ans = new int[n+2];
        	int[] lev = new int[n+1];
        	while(q.size() > 0) {
        		Pair cur = q.poll();
        		int v = cur.a;
        		int level = cur.b;
        		lev[v] = level;
        		vis[v] = true;
        		for(int i=0;i<adj.get(v).size();i++) {
        			if(!vis[adj.get(v).get(i)]) {
        			q.add(new Pair(adj.get(v).get(i),level+1));
        			ans[v]++;
        			}
        		}
        	}
        	
        	for(int i=1;i<=n;i++) {
        		out.println(ans[i]);
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
