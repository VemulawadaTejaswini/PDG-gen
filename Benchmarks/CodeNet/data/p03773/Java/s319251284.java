import java.io.*;
import java.math.BigInteger;
import java.util.*;
 
 
 
 public class Main {
	public static InputReader in;
    public static PrintWriter pw;
 
 
 
	public static void main(String args[]) {
		new Thread(null, new Runnable() {
            public void run() {
                try{
                    solve();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();
    }
	static ArrayList<Integer> g[];
	static ArrayList<Integer> h[];
	static boolean visited[];
	static boolean visit[];
	static int par[];
	static int degree[];
	static int edjes=0;
	static int start=-1;
	static int end=-1;
	static int Total=0;
	static int time1[];
	static int time2[];
	static int glob=0;
	static long ans[]=new long[1000000];
	static boolean vis2[][];
	//static long sum1=0;
	//static long val[];
    static ArrayList<Integer> levels[];
    static int max=0;
    static int lev=1;
    static ArrayList<Integer> nodes[];
    static ArrayList<Integer> values[];
    static int depth[];
    static boolean found=false;
   // static long sm[];
    static int sum1=0;
    static int pre[][];
    static int subtree[];
   static  int cnt=0;
   static  HashMap<String,Integer> hm;
   static int sm[];
   static int prime[];
   static long mul[];
   static long d[]=new long[1000000];
   static int tot=0;
   static long highest=(long)1e9;
    static Stack<Integer> tt=new Stack();
    public static void solve(){
		
	
		 in = new InputReader(System.in);
		 pw = new PrintWriter(System.out);
	     int a=in.nextInt();
	     int b=in.nextInt();
	     System.out.println((a+b)%24);
    }

public static long fact(int n)
{
	long ans=1;
	for(int i=1;i<=n;i++)
		
	{
		ans=(ans%1000000007)*(i%1000000007);
		ans%=1000000007;
	}
	return ans;
}


	public static int countNumber(int n)
    {
        int result = 0;
     
        // Pushing 1 to 9 because all number from 1
        // to 9 have this propert.
        for (int i = 1; i <= 9; i++)
        {
            Stack<Integer> s=new Stack();
            if (i <= n)
            {
                s.push(i);
                result++;
            }
     
            // take a number from stack and add
            // a digit smaller than last digit
            // of it.
            while (!s.empty())
            {
                int tp = s.peek();
                s.pop();
                for (int j = tp%10; j <= 9; j++)
                {
                    int x = tp*10 + j;
                 //   System.out.println(x);
                    if (x <= n)
                    {
                        s.push(x);
                        result++;
                    }
                }
              //  System.out.println();
            }
        }
     
        return result;
    }
    public static boolean IsPrime(long l) {
		// Corner cases
		if (l <= 1)
			return false;
		if (l <= 3)
			return true;
 
		// This is checked so that we can skip 
		// middle five numbers in below loop
		if (l % 2 == 0 || l % 3 == 0)
			return false;
 
		for (long i = 5; i * i <= l; i = i + 6)
			if (l % i == 0 || l % (i + 2) == 0)
				return false;
 
		return true;
	}
 
     
        
     
        

   
/*public static void dfs2(int curr,int lev)
{
	time1[curr]=glob++;
	
	depth[curr]=lev;
	visited[curr]=true;
	nodes[lev].add(time1[curr]);
	values[lev].add(a[curr]);
	for(int x:g[curr])
	{
		if(!visited[x])
		{
			dfs2(x,lev+1);
		}
	}
time2[curr]=glob++;
}
 
 
 
public static void bfs1(int curr)
{
Queue<Integer> Q=new LinkedList<Integer>();
Q.add(1);
visit[1]=true;
int lev=2;
levels[1].add(1);
while(!Q.isEmpty())
{
	int cnt=Q.size();
	while(cnt>0)
	{
		int p=Q.poll();
		visit[p]=true;
		for(int x:g[p])
		{
			if(!visit[x])
			{
				Q.add(x);
				levels[lev].add(x);
			}
		}
		cnt--;
	}
	max=Math.max(lev, max);
	lev++;
}
}
 
 
	
 	private static long fact(int len) {
	long ans=1;
	for(int i=1;i<=len;i++)
		ans*=i;
	return ans;
}
 
 
 
	
	// SubTree Checker DFS (TO CHECK IF X IS IN A SUBTREE OF Y)
	public static void dfs3(int curr)
	{
		visited[curr]=true;
		time1[curr]=glob++;
		for(int x:g[curr])
		{
		if(!visited[x])
			dfs3(x);
		}
		time2[curr]=glob++;
	}
    
	
	
 
    /*NO OF EDJES IN WHOLE CONNECTED COMPONENTS
  
	public static void dfs1(int curr)
	{
		visited[curr]=true;
		for(int next:g[curr])
		{
			edje++;
			if(!visited[next])
				dfs1(next);
		}
	}
	/*SUM OF ALL SUBTREE NODE'S VLAUES DFS
	public static void dfs(int curr,int prev)
		{
		val[curr]=1;
			for(int x:g[curr])
			{
				if(x!=prev)
				{
		            dfs(x,curr);
		            val[curr]+=val[x];
					
			    }
			}
		}*/
	
		public static long power(long a,long b)
		{
			long result=1;
			while(b>0)
			{
				if(b%2==1)
					result*=a;
				a=a*a;
				b/=2;
			}
			return result;
		}
				public static long pow(long n,long p,long m)
	{
		 long  result = 1;
		  if(p==0)
		    return 1;
		if (p==1)
		    return n;
		while(p!=0)
		{
		    if(p%2==1)
		        result *= n;
		    if(result>=m)
		    result%=m;
		    p >>=1;
		    n*=n;
		    if(n>=m)
		    n%=m;
		}
		return result;
	}
	static class Pair implements Comparable<Pair>{
	long now;
		long aft;
		Pair(long l,long m){
	     	this.now=l;
			this.aft=m;
			
		}
		@Override
		public int compareTo(Pair o) {
		return (int) (o.aft-aft);
		}
				
	}
	public static long gcd(long a, long b) {
		  if (b == 0) return a;
		  return gcd(b, a%b);
		}
	static class InputReader {
 
		private InputStream stream;
		private byte[] buf = new byte[8192];
		private int curChar, snumChars;
		private SpaceCharFilter filter;
 
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
 
		public int snext() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}
 
		public   int nextInt() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public long nextLong() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = snext();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = snext();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public String readString() {
			int c = snext();
			while (isSpaceChar(c))
				c = snext();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = snext();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}
}