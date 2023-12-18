import java.io.*;
import java.util.*;
import java.math.*;

 
 public class Main	{
   static class Pair implements Comparable<Pair>{
   int a;
   int b;
   public Pair(int x,int y){a=Math.min(x, y);b=Math.max(x, y);}
   public Pair(){}
   public int compareTo(Pair p){
     return a  - p.a ;
   }

@Override
public boolean equals(Object obj) {
	Pair cur = (Pair)obj;
	if((a==cur.a && b==cur.b) || (a==cur.b && b==cur.a)) {
		return true;
	}
	else return false;
}
@Override
public int hashCode() {
	final int prime = 31;
	if( a>= b) {
	int result = 1;
	result = prime * result + a;
	result = prime * result + b;
	return result;
	}
	else {
		int a1 = b;
		int b1 = a;
		int result = 1;
		result = prime * result + a1;
		result = prime * result + b1;
		return result;
	}
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
static int mxN = (int)(1e6+5);
static long[]fact,inv_fact;
static long my_inv(long a) {
	return pow(a,mod-2);
}
static long bin(int a,int b) {
	if(b>a)return 0;
    return ((fact[a]*inv_fact[a-b])%mod * inv_fact[b])%mod;
}

static HashMap<Pair,ArrayList<Pair>> adj;
static HashMap<Pair,Boolean> vis;
static HashMap<Pair,Boolean> calc;
static HashMap<Pair,Integer>dp;
static int dfs(Pair cur) {
	
	if(vis.get(cur)) {
		if(!calc.get(cur))
			return -1;
		return dp.get(cur);
	}
	vis.put(cur, true);
	dp.put(cur, 1);
	for(int i=0;i<adj.get(cur).size();i++) {
		
			int temp = dfs(adj.get(cur).get(i));
			if(temp == -1)return -1;
			dp.put(cur,Math.max(dp.get(cur), 1 + temp));
		
	}
	calc.put(cur,true);
	return dp.get(cur);
}

 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int tc = 1;//s.nextInt();
        mxx = (long)(1e18+5);
 
        while(tc-->0){
        	int n = s.nextInt();
        	adj = new HashMap<Main.Pair, ArrayList<Pair>>();
        	vis = new HashMap<Pair,Boolean>();
        	calc = new HashMap<Main.Pair, Boolean>();
        	dp = new HashMap<Main.Pair, Integer>();
        	for(int i=1;i<=n;i++) {
        		for(int j=i+1;j<=n;j++) {
        			adj.put(new Pair(i,j),new ArrayList<Main.Pair>());
        			vis.put(new Pair(i,j),false);
        			calc.put(new Pair(i,j), false);
        			dp.put(new Pair(i,j), -1);
        		}
        	}
        	
        	int[][]a=new int[n+1][n];
        	for(int i=1;i<=n;i++) {
        		for(int j=1;j<=n-1;j++) {
        			a[i][j] = s.nextInt();
        		}
        	}
        	for(int i=1;i<=n;i++) {
        		for(int j=2;j<=n-1;j++) {
        			
        			adj.get(new Pair(i,a[i][j-1])).add(new Pair(i,a[i][j]));
        		}
        	}
        	int ans = 0;
        	for(Map.Entry<Pair, ArrayList<Pair>> es: adj.entrySet()) {
        		Pair cur = es.getKey();
        			int val = dfs(cur);
        			if(val == -1) {
        				out.println("-1");
        				return;
        			}
        			else {
        				ans = Math.max(ans, val);
        			}
        		
//        		ArrayList<Pair> al = es.getValue();
//        		out.print(cur.a+","+cur.b+"--->>");
//        		for(int i=0;i<al.size();i++) {
//        			out.print(" "+al.get(i).a + ","+al.get(i).b);
//        		}
//        		out.println();
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
