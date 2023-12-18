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
  public static int gcd(int a,int b)
  {
    if(a<b)

      return gcd(b,a);
    if(b==0)
      return a;
    return gcd(b,a%b);
    
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
static int mxN = (int)(1e6+5);
static long[]fact,inv_fact;
static long my_inv(long a) {
	return pow(a,mod-2);
}
static long bin(int a,int b) {
	if(b>a)return 0;
    return ((fact[a]*inv_fact[a-b])%mod * inv_fact[b])%mod;
}
static String str;
static int n,k,c;
static ArrayList<Integer> indices;
static int upper_bound(int[]arr,int st,int e,int val) {
	if(st > e)return -1;
	if(st==e) {
		if(arr[st] < val)return st;
		else return -1;
	}
	if(e - st == 1) {
		if(arr[e] < val)return e;
		if(arr[st] < val)return st;
		return -1;
	}
	int mid = (st+e)/2;
	if(arr[mid] >= val)return upper_bound(arr, st, mid-1, val);
	else return upper_bound(arr, mid, e, val);
}
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int tc = 1;//s.nextInt();
        mxx = (long)(1e18+5);
       
        while(tc-->0){
        	n = s.nextInt();
        	k = s.nextInt();
        	c = s.nextInt();
            str = s.next();
            indices = new ArrayList<Integer>();
            for(int i=0;i<n;i++) {
            	if(str.charAt(i)=='o')indices.add(i+1);
            }
            int[]arr=new int[indices.size()];
            for(int i=0;i<arr.length;i++)arr[i] = indices.get(i);
            int[]dp=new int[indices.size()];
            dp[0] = 1;	
            for(int i=1;i<arr.length;i++) {
            	int num =  upper_bound(arr,0,i-1,arr[i] - c);
            	if(num==-1)dp[i] = 1;
            	else dp[i] = dp[num]+1;
            }
            if(c==0 && indices.size() > k) {
            	break;
            }
//            for(int i=0;i<arr.length;i++)out.print(arr[i]+" ");
//            out.println();
//            for(int i=0;i<arr.length;i++)out.print(dp[i]+" ");
            ArrayList<Integer>[]cnts = new ArrayList[k+1];
            int j = arr.length-1;
            while(dp[j] > k)j--;
           for(int i=k;i>=1;i--) {
        	   cnts[i] = new ArrayList<>();
        	   while(j >= 0 && dp[j] == i) {
        		   cnts[i].add(arr[j]);
        		   j--;
        	   }
           }
    //       for(int i=1;i<=k;i++)out.println(cnts[i]);
           ArrayList<Integer>ans = new ArrayList<Integer>();
          int next = -1;
           for(int i=k;i>=1;i--) {
        	   if(cnts[i].size() == 1) {
        		   ans.add(cnts[i].get(0));
        		   next = i;
        	   }
        	   if(cnts[i].size() > 1) {
        		   if(i==k)continue;
        		   if(next==-1)continue;
        		   int x = cnts[i].size()-1;
        		   int y = cnts[next].size()-1;
        		   if(cnts[i].get(x-1) + c >= cnts[next].get(y)) {
        			   ans.add(cnts[i].get(x));
        			   next = i;
        		   }
        	   }
           }
            for(int i=ans.size()-1;i>=0;i--)out.println(ans.get(i));
            
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
