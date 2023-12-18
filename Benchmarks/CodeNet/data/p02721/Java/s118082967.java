import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	//static long[] factorial;
 
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		int K = sc.ni();
		int C = sc.ni();
		String s = sc.next();
		int[] dp = new int[N];
		int[] req = new int[N];
		Arrays.fill(req,-1);
		for (int i = 0; i <= C; i++) {
			if (s.charAt(i)=='o') {
				dp[i] = 1;
				req[i] = i;
			} else {
				dp[i] = 0;
			}
		}
		int max = dp[0];
		int cnt = 1;
		int index = 0;
		for (int i = C+1; i < N; i++) {
			if (s.charAt(i)=='o') {
				dp[i] = max+1;
				if (cnt==1)
					req[i] = index;
			}
			if (dp[i-C]==max) {
				cnt++;
			} else if (dp[i-C] > max) {
				max = dp[i-C];
				cnt = 1;
				index = i-C;
			}
		}
		
		int M = 0;
		for (int i = 0; i < N; i++)
			M = Math.max(M,dp[i]);
		if (M == K) {
			//Might be forced to work
			DisjointSetUnion dsu = new DisjointSetUnion(N);
			for (int i = 0; i < N; i++) {
				if (req[i] >= 0) {
					dsu.connect(i, req[i]);
				}
			}
			HashSet<Integer> vals = new HashSet<Integer>();
			int r = -1;
			for (int i = 0; i < N; i++) {
				if (dp[i] == K) {
					int root = dsu.root(i);
					if (r == -1)
						r = root;
					if (r != root) {
						pw.close();
						return;
					}
					vals.add(i);
				}
			}
			
			while (vals.size() > 1) {
				HashSet<Integer> rep = new HashSet<Integer>();
				for (int v: vals) {
					if (req[v] >= 0)
						rep.add(req[v]);
				}
				vals = rep;
			}
			int ans = 0;
			for (int v: vals)
				ans = v;
			
			//System.out.println(Arrays.toString(req));
			ArrayList<Integer> print = new ArrayList<Integer>();
			while (ans >= 0 && (print.size() == 0 || ans+1 != print.get(print.size()-1))) {
				print.add(ans+1);
				ans = req[ans];
			}
			Collections.sort(print);
			for (int p: print)
				pw.println(p);
		}
		
		pw.close();
	}
	
	static class DisjointSetUnion {
		public int[] parent;
		public int[] weight;
		public int count;

		public DisjointSetUnion(int nodes) {
			count = nodes;
			parent = new int[nodes];
			weight = new int[nodes];
			for (int i = 0; i < nodes; i++) {
				parent[i] = i;
				weight[i] = 1;
			}
		}
		//"find"
		public int root(int p) {
			while (p != parent[p]) {
				p = parent[p];
			}
			return p;
		}

		//"union"
		public void connect(int p, int q) {
			int rootP = root(p);
			int rootQ = root(q);
			if (rootP == rootQ) return;
			if (weight[rootP] < weight[rootQ]) {
				parent[rootP] = rootQ;
				weight[rootQ] += weight[rootP];
			} else {
				parent[rootQ] = rootP;
				weight[rootP] += weight[rootQ];
			}
			count--;
		}

		public boolean connected(int p, int q) {
			return root(p) == root(q);
		}
	}
	
 
	public static long dist(long[] p1, long[] p2) {
		return (Math.abs(p2[0]-p1[0])+Math.abs(p2[1]-p1[1]));
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
		if (a < b) return gcd(b,a);
		if (b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	//Fast exponentiation (x^y mod m)
	public static long power(long x, long y, long m) { 
		if (y < 0) return 0L;
		long ans = 1;
		x %= m;
		while (y > 0) { 
			if(y % 2 == 1) 
				ans = (ans * x) % m; 
			y /= 2;  
			x = (x * x) % m;
		} 
		return ans; 
	}
	
	public static int[] shuffle(int[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
	public static long[] shuffle(long[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
	public static int[][] shuffle(int[][] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
 
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] a, int[] b) {
				  //return a[0]-b[0]; //ascending order
				  if (a[1] != b[1]) {
					  return (a[1]-b[1]);
				  } else {
					  return (a[0]-b[0]);
				  }
	          }
		});
		return array;
	}
    
    public static long[][] sort(long[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<long[]>() {
			  @Override
        	  public int compare(long[] a, long[] b) {
				  if (a[0] < b[0])
					  return -1;
				  else if (a[0] > b[0])
					  return 1;
				  else
					  return 0;
	          }
		});
		return array;
	}
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        }
        
        int ni() { 
            return Integer.parseInt(next()); 
        }
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() {
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}