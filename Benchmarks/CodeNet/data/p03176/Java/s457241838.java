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
 
static long[]dp;
static int n;
static long[]tree;
static long[]a;
static int[]h;
private static long query(int qlow, int qhigh, int low, int high, int pos) {
		
		if (qhigh<low || high<qlow) {
			return -1*(int)1e9;
		} else if (qlow<=low && qhigh>=high) {
			return tree[pos];
		} else {
			int mid = 0;
			mid = (low+high)/2;
			return Math.max(query(qlow, qhigh, low, mid, 2*pos+1),
					query(qlow, qhigh, mid+1, high, 2*pos+2));
		}
		
	}
	
	private static void update(int index, long value, int low, int high, int pos) {
		if (low==high) {
			tree[pos] = value;
			return;
		}
		
		int mid = (low+high)/2;
		if (index<=mid)
			update(index, value, low, mid, 2*pos+1);
		else
			update(index, value, mid+1, high, 2*pos+2);
		
		tree[pos] = Math.max(tree[2*pos+1], tree[2*pos+2]);
		
	}
static long mxx;
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;
        int tc = 0;
        mxx = (long)(1e18+5);
        while(tc++<t){
            n = s.nextInt();
            h=new int[n];
            a=new long[n];
            int maxH=0;
            for(int i=0;i<n;i++){
                h[i]=s.nextInt();
                maxH = Math.max(maxH,h[i]);
            }
            maxH++;
            for(int i=0;i<n;i++){
                a[i]=s.nextLong();
            }
        
            tree = new long[4*maxH];
            maxH--;
            long ans = 0;
            for(int i=0;i<n;i++){
                
                long temp = a[i]+ query(0,h[i]-1,0,maxH,0);
              ans = Math.max(ans,temp);
                update(h[i],temp,0,maxH,0);
                
            
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
