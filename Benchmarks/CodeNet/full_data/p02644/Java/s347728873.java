import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.zip.ZipEntry;

import javax.imageio.stream.MemoryCacheImageInputStream;
import javax.security.auth.Subject;
import javax.security.auth.kerberos.KerberosKey;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.tools.JavaCompiler;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
 
import org.omg.CORBA.TRANSACTION_MODE;
import org.omg.IOP.TAG_CODE_SETS;
 
import java.awt.font.GraphicAttribute;
import java.io.*;
import java.nio.channels.AcceptPendingException;
import java.rmi.server.RMIClassLoader;
import java.security.spec.DSAGenParameterSpec;
import java.sql.PseudoColumnUsage;
import java.time.Period;

   public class Main {
	 static int h;
	 static int w;
	 static int k;
	 static int x1;
	 static int y1;
	 static int x2;
	 static int y2;
	 static char[][] grid;
	 static int ans=-1;
	 static int [][] visited;
	 
	 static int[]dx= {0,1,0,-1};
	 static int[]dy= {1,0,-1,0};
	 public static boolean valid(int x,int y) {
		 
		 if(x>=h||y>=w||x<0||y<0||grid[x][y]=='@') {
			 return false;
		 }
		 return true;
	 }
	 public static void bfs(int x,int y) {
		 TreeMap<pair,Integer>q=new TreeMap<Main.pair, Integer>();
		
		 q.put(new pair(x, y),0);
		 
		 while(!q.isEmpty()) {
			 pair z=q.firstKey();
			 int Z=q.pollFirstEntry().getValue();
			visited[(int) z.x][(int) z.y]=2;
			Process: for(int i=0;i<4;i++) {
				 for(int j=1;j<=k;j++) {
					 int X=(int) (z.x+dx[i]*j);
					 int Y=(int) (z.y+dy[i]*j);
					 if(!valid(X, Y)||visited[X][Y]==2) {
						 continue Process;
					 }
					 if(X==x2&&Y==y2) {
						 
						 ans=Z+1;
						 return;
					 }
					 if(visited[X][Y]==0) {
						 visited[X][Y]=1;
						 q.put(new pair(X, Y),Z+1);
						
					 }
				 }
			 }
			 
		 }
	 }
    public static void main(String[] args) throws Exception {
          h=sc.nextInt();
          w=sc.nextInt();
          k=sc.nextInt();
    	x1=sc.nextInt()-1;
    	y1=sc.nextInt()-1;
    	x2=sc.nextInt()-1;
    	y2=sc.nextInt()-1;
    	grid=new char[h][w];
    	visited=new int[h][w];
    	for(int i=0;i<h;i++) {
    		grid[i]=sc.next().toCharArray();
    	}
    	visited[x1][y1]=1;
    	bfs(x1, y1);
    	pw.println(ans);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
       pw.close();
    }
 
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
 
		public Scanner(FileReader r) {
			br = new BufferedReader(r);
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}
		public long[] nextlongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
		public Long[] nextLongArray(int n) throws IOException {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
		public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
		public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
		public boolean ready() throws IOException {
			return br.ready();
		}
 
	}
 
	static class pair implements Comparable<pair> {
		long x;
		long y;
 
		public pair(long x, long y) {
			this.x = x;
			this.y = y;
		}
 
		public String toString() {
			return x + " " + y;
		}
		public boolean equals(Object o) {
            if (o instanceof pair) {
                pair p = (pair)o;
                return p.x == x && p.y == y;
            }
            return false;
        }
        public int hashCode() {
            return new Double(x).hashCode() * 31 + new Double(y).hashCode();
        }
        public int compareTo(pair other) {
        	if(this.x==other.x) {
        		return Long.compare(this.y, other.y);
        	}
			return Long.compare(this.x, other.x);
		}
	}
 
	static class tuble implements Comparable<tuble> {
		int x;
		int y;
		int z;
 
		public tuble(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
 
		public String toString() {
			return x + " " + y + " " + z;
		}
 
		public int compareTo(tuble other) {
			if (this.x == other.x) {
				if(this.y==other.y) {
					return this.z - other.z;
				}
				return this.y - other.y;
			} else {
				return this.x - other.x;
			}
		}
	}
 
	public static long GCD(long a, long b) {
		if (b == 0)
			return a;
		if (a == 0)
			return b;
		return (a > b) ? GCD(a % b, b) : GCD(a, b % a);
	}
 
	public static long LCM(long a, long b) {
		return a * b / GCD(a, b);
	}
 
	static long Pow(long a, long e, long mod) // O(log e)
	{
		a %= mod;
		long res = 1l;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1l;
		}
		return res;
	}
   public static long modinverse(long a,long mod) {
	   return Pow(a, mod-2, mod);
   }
	static long nc(int n, int r) {
		if (n < r)
			return 0;
		long v = fac[n];
		v *= Pow(fac[r], mod - 2, mod);
		v %= mod;
		v *= Pow(fac[n - r], mod - 2, mod);
		v %= mod;
		return v;
	}
 
	public static boolean isprime(long a) {
		if (a == 0 || a == 1) {
			return false;
		}
		if (a == 2) {
			return true;
		}
		for (int i = 2; i < Math.sqrt(a) + 1; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
 
	public static boolean isPal(String s) {
		boolean t = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				t = false;
				break;
			}
		}
		return t;
	}
 
	public static long RandomPick(long[] a) {
		int n = a.length;
		int r = rn.nextInt(n);
		return a[r];
	}
 
	public static int RandomPick(int[] a) {
		int n = a.length;
		int r = rn.nextInt(n);
		return a[r];
	}
 static class hash {
	 int[]HashsArray;
	 boolean reverse;
	 int prelen;
	public  hash(String s, boolean r) {
		prelen = s.length();
		reverse=r;
		HashsArray = new int[prelen + 1];
		if (HashsArrayInd == 0) {
			int[] mods = { 1173017693, 1173038827, 1173069731, 1173086977, 1173089783, 1173092147, 1173107093,
					1173114391, 1173132347, 1173144367, 1173150103, 1173152611, 1173163993, 1173174127, 1173204679,
					1173237343, 1173252107, 1173253331, 1173255653, 1173260183, 1173262943, 1173265439, 1173279091,
					1173285331, 1173286771, 1173288593, 1173298123, 1173302129, 1173308827, 1173310451, 1173312383,
					1173313571, 1173324371, 1173361529, 1173385729, 1173387217, 1173387361, 1173420799, 1173421499,
					1173423077, 1173428083, 1173442159, 1173445549, 1173451681, 1173453299, 1173454729, 1173458401,
					1173459491, 1173464177, 1173468943, 1173470041, 1173477947, 1173500677, 1173507869, 1173522919,
					1173537359, 1173605003, 1173610253, 1173632671, 1173653623, 1173665447, 1173675577, 1173675787,
					1173684683, 1173691109, 1173696907, 1173705257, 1173705523, 1173725389, 1173727601, 1173741953,
					1173747577, 1173751499, 1173759449, 1173760943, 1173761429, 1173762509, 1173769939, 1173771233,
					1173778937, 1173784637, 1173793289, 1173799607, 1173802823, 1173808003, 1173810919, 1173818311,
					1173819293, 1173828167, 1173846677, 1173848941, 1173853249, 1173858341, 1173891613, 1173894053,
					1173908039, 1173909203, 1173961541, 1173968989, 1173999193};
			mod = RandomPick(mods);
			int[] primes = { 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
			prime = RandomPick(primes);
			prepow = new int[1000010];
			prepow[0] = 1;
			for (int i = 1; i < 1000010; i++) {
				prepow[i] = (int) ((1l * prepow[i - 1] * prime) % mod);
				
			}
		}
		if (!reverse) {
 
			for (int i = 0; i < prelen; i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					HashsArray[i + 1] = (int) ((1l * HashsArray[i]
							+ ((1l * s.charAt(i) - 'a' + 1) *prepow[i]) % mod) % mod);
				else
					HashsArray[i + 1] = (int) ((1l * HashsArray[i]
							+ ((1l * s.charAt(i) - 'A' + 27) * prepow[i]) % mod) % mod);
			}
 
		} else {
			
			for (int i = 0; i < prelen; i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					HashsArray[i + 1] = (int) ((1l * HashsArray[i]
							+ ((1l * s.charAt(i) - 'a' + 1) * prepow[1000010 - 1 - i]) % mod) % mod);
				else
					HashsArray[i + 1] = (int) ((1l * HashsArray[i]
							+ ((1l * s.charAt(i) - 'A' + 27) * prepow[1000010 - 1 - i]) % mod) % mod);
			}
 
		}
 
		HashsArrayInd++;
 
	}
 
	public int PHV(int l, int r) {
		if (l > r) {
			return 0;
		}
		int val = (int) ((1l * HashsArray[r] + mod - HashsArray[l - 1]) % mod);
		if (!reverse) {
 
//			val = (int) ((1l * val *  modinverse(prepow[l-1], mod)) % mod);
			val = (int) ((1l * val * prepow[1000010 - l]) % mod);
		} else {
//			val = (int) ((1l * val * modinverse(prepow[prelen-r], mod)) % mod);
			
			val = (int) ((1l * val * prepow[r - 1]) % mod);
		}
		return val;
	}
 }
    public static void genprime(int n) {
    	 boolean prime[] = new boolean[n+1]; 
         for(int i=0;i<n;i++) 
             prime[i] = true; 
           
         for(int p = 2; p*p <=n; p++) 
         { 
             if(prime[p] == true) 
             { 
                 for(int i = p*p; i <= n; i += p) 
                     prime[i] = false; 
             } 
         } 
         for(int i = 2; i <= n; i++) 
         { 
             if(prime[i] == true) {
                primes.put(i,primes.size());
                primes2.put(primes2.size(),i);
             }
             
         }
    }
   
   
    public static long LSB(long x) {
		return x&-x;
	}
	static class fenwick {
		long[] arr;
		public fenwick(PriorityQueue<Integer> a) {
			PriorityQueue<Integer>q=new PriorityQueue<Integer>(a);
			arr=new long[a.size()+1];
			int i=1;
			while(!q.isEmpty()) {
				int z=q.poll();
				arr[i]+=z;
				if(i+LSB(i)<=a.size()) {
					arr[(int) (i+LSB(i))]+=arr[i];
				}
				i++;
			}
		}
		public fenwick(TreeSet<Integer> a) {
			arr=new long[a.size()+1];
			int i=1;
			for(int h:a) {
				arr[i]+=h;
				if(i+LSB(i)<=a.size()) {
					arr[(int) (i+LSB(i))]+=arr[i];
				}
				i++;
			}
		}
		public fenwick(Integer[] a) {
			arr=new long[a.length+1];
			for(int i=1;i<=a.length;i++) {
				arr[i]+=a[i-1];
				if(i+LSB(i)<=a.length) {
					arr[(int) (i+LSB(i))]+=arr[i];
				}
			}
		}
		public fenwick(int[] a) {
			arr=new long[a.length+1];
			for(int i=1;i<=a.length;i++) {
				arr[i]+=a[i-1];
				if(i+LSB(i)<=a.length) {
					arr[(int) (i+LSB(i))]+=arr[i];
				}
			}
		}public fenwick(long[] a) {
			arr=new long[a.length+1];
			for(int i=1;i<=a.length;i++) {
				arr[i]+=a[i];
				if(i+LSB(i)<=a.length) {
					arr[(int) (i+LSB(i))]+=arr[i];
				}
			}
		}
		public void update(int ind,long x) {
			int i=ind;
			while(i<arr.length) {
				arr[i]+=x;
				i+=LSB(i);
			}
		}
		public long PrefixSum(int ind) {
			long sum=0;
			int i=ind;
			while(i>0) {
				sum+=arr[i];
				i=(int) (i-LSB(i));
			}
			return sum;
		}
		public long RangeQuerey(int l,int r) {
			return  this.PrefixSum(r+1)-this.PrefixSum(l);
		}
		public long maxConsecutiveValue(int k) {
			long max=Long.MIN_VALUE;
			for(int i=k-1;i<arr.length-1;i++) {
				
				max= Math.max(max,  this.RangeQuerey(i-k+1, i));
				
			}
			return max;
		}
		public long minConsecutiveValue(int k) {
			long min=Long.MAX_VALUE;
			
			for(int i=k-1;i<arr.length-1;i++) {
				
				min= Math.min(min,  this.RangeQuerey(i-k+1, i));
				
			}
			return min;
		}
		public long value(int ind) {
			return arr[ind];
		}
	}
	static void sieveLinear(int N)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		lp = new int[N + 1];								//lp[i] = least prime divisor of i
		for(int i = 2; i <= N; ++i)
		{
			if(lp[i] == 0)
			{
				primes.add(i);
				lp[i] = i;
			}
			int curLP = lp[i];
			for(int p: primes)//all primes smaller than or equal my lowest prime divisor
				if(p > curLP || p * 1l * i > N)
					break;
				else
					lp[p * i] = p;
		}
	}
	public static void primefactorization(int n) {
		int x=n;
	while(x>1) {
		int lowestDivisor=lp[x];
		while(x%lowestDivisor==0) {
			primefactors.add(lowestDivisor);
			x/=lowestDivisor;
		}
	}
	}
	public static class SuffixArray {

		int[] SA;
		int[] AS;
		String SS;
		public SuffixArray(String S)					//has a terminating character (e.g. '$')
		{
			SS=S;
			char[] s=new char[S.length()+1];
			for(int i=0;i<S.length();i++) {
				s[i]=S.charAt(i);
			}
			s[S.length()]='$';
			int n = s.length, RA[] = new int[n];
			SA = new int[n];
			
			for(int i = 0; i < n; ++i) { RA[i] = s[i]; SA[i] = i; }
			
			for(int k = 1; k < n; k <<= 1)
			{
				sort(SA, RA, n, k);
				sort(SA, RA, n, 0);
				int[] tmp = new int[n];

				for(int i = 1, r = 0, s1 = SA[0], s2; i < n; ++i)
				{
					s2 = SA[i];
					tmp[s2] = RA[s1] == RA[s2] && RA[s1 + k] == RA[s2 + k] ? r : ++r;
					s1 = s2;
				}
				for(int i = 0; i < n; ++i)
					RA[i] = tmp[i];
				
				if(RA[SA[n-1]] == n - 1)
					break;
			}
			AS=new int[SA.length];
			for(int i=0;i<SA.length;i++) {
				AS[SA[i]]=i;
			}
		}
		public String toString() {
			
			return Arrays.toString(SA);
		}
		public int get(int n) {
			return SA[n];
		}
		public int Substring(String s) {  // log(n)*|s|
			int low=0;
			int high=SA.length;
			int mid=(low+high)/2;
			int ind=-1;
			
			while(low<high-1) {
				
				if(SS.length()-SA[mid]<s.length()) {
				
					boolean less=false;
					for(int i=SA[mid];i<SS.length();i++) {
						if(SS.charAt(i)>s.charAt(i-SA[mid])) {
							less=true;
							break;
						}
						if(SS.charAt(i)<s.charAt(i-SA[mid])) {
							less=false;
							break;
						}
					}
					if(!less) {
						low=mid;
					}else {
						high=mid;
					}
				}else {
					boolean less=true;
					boolean equal=true;
					for(int i=SA[mid];i<SA[mid]+s.length();i++) {
						if(SS.charAt(i)<s.charAt(i-SA[mid])&&equal) {
							less=false;
							equal=false;
							break;
						}
						if(SS.charAt(i)!=s.charAt(i-SA[mid])){
							equal=false;
						}
					}
					if(equal) {
						ind=SA[mid];
					}
					if(!less) {
						low=mid;
					}else {
						high=mid;
					}
				}
				
				
				mid=(low+high)/2;
			}
			return ind;
		}
		public int LastSubstring(String s) {  // log(n)*|s|
			int low=0;
			int high=SA.length;
			int mid=(low+high)/2;
			int ind=-1;
			
			while(low<high-1) {
				
				if(SS.length()-SA[mid]<s.length()) {
				
					boolean less=true;
					for(int i=SA[mid];i<SS.length();i++) {
						if(SS.charAt(i)<s.charAt(i-SA[mid])) {
							break;
						}
						if(SS.charAt(i)>s.charAt(i-SA[mid])) {
							less=false;
							break;
						}
					}
					if(less) {
						low=mid;
					}else {
						high=mid;
					}
				}else {
					boolean less=true;
					boolean equal=true;
					for(int i=SA[mid];i<SA[mid]+s.length();i++) {
						if(SS.charAt(i)>s.charAt(i-SA[mid])&&equal) {
							less=false;
							equal=false;
							break;
						}
						if(SS.charAt(i)!=s.charAt(i-SA[mid])){
							equal=false;
						}
					}
					if(equal) {
						ind=SA[mid];
					}
					if(less) {
						low=mid;
					}else {
						high=mid;
					}
				}
				
				
				mid=(low+high)/2;
			}
			return ind;
		}
		public int CountSubstring(String s) {
			int z=LastSubstring(s);
			if(z==-1)
				return 0;
			return AS[z]-AS[Substring(s)]+1;
		}
		public void sort(int[] SA, int[] RA, int n, int k)
		{
			int maxi = Math.max(256, n), c[] = new int[maxi];  
			for(int i = 0; i < n; ++i)
				c[i + k < n ? RA[i + k] : 0]++;
			for(int i = 0, sum = 0; i < maxi; ++i)
			{
				int t = c[i];
				c[i] = sum;
				sum += t;
			}
			int[] tmp = new int[n];
			for(int i = 0; i < n; ++i)
			{
				int j = SA[i] + k;
				tmp[c[j < n ? RA[j] : 0]++] = SA[i];
			}
			
			for(int i = 0; i < n; ++i)
				SA[i] = tmp[i];
		}
	}
	static LinkedList<Integer>primefactors=new LinkedList<>();
	static TreeMap<Integer,Integer>primes=new TreeMap<Integer, Integer>();
	static TreeMap<Integer,Integer>primes2=new TreeMap<Integer, Integer>();
	static int[]lp;
    
	
	static int HashsArrayInd = 0;
	static int[] prepow;
	static int prime = 61;
	static long fac[];
	static int mod = 1000000007;
	static Random rn = new Random();
	static Scanner sc = new Scanner(System.in);
	static PrintWriter pw = new PrintWriter(System.out);
}