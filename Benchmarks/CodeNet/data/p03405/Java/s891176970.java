import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	static long[] factorial;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		int M = sc.ni();
		long X = sc.nl();
		Edge[] edges = new Edge[M];
		for (int i = 0; i < M; i++) {
			edges[i] = new Edge(sc.ni()-1,sc.ni()-1,sc.nl());
		}
		Arrays.sort(edges);
		boolean[] colored = new boolean[M];
		ArrayList<Integer> mstX = new ArrayList<Integer>();
		
		for (int i = 0; i < M; i++) {
			DisjointSetUnion dsu = new DisjointSetUnion(N);
			long tot = edges[i].weight;
			dsu.connect(edges[i].n1, edges[i].n2);
			ArrayList<Integer> used = new ArrayList<Integer>();
			used.add(i);
			for (int j = 0; j < N; j++) {
				if (j==i) continue;
				if (tot >= X) break;
				if (dsu.count == 1) break;
				if (! dsu.connected(edges[j].n1, edges[j].n2)) {
					dsu.connect(edges[j].n1, edges[j].n2);
					tot += edges[j].weight;
				}
			}
			if (i == 0 && tot > X) {
				pw.println(0);
				pw.close();
				return;
			}
			if (tot < X) {
				for (int e: used)
					colored[e] = true;
			}
			if (tot == X) {
				for (int e: used)
					mstX.add(e);
			}
		}

		boolean[] other = new boolean[M];
		long otherCnt = 0;
		for (int e: mstX) {
			if (! colored[e]) {
				other[e] = true;
			}
		}
		for (boolean b: other) {
			if (b) otherCnt++;
		}
		//pw.println(Arrays.toString(colored));
		//pw.println(Arrays.toString(other));
		if (otherCnt == 0) {
			pw.println(0);
			pw.close();
			return;
		}
		long ans = 1;
		for (int i = 0; i < M; i++) {
			if (colored[i]) {
				ans = 2;
				break;
			}
		}
		if (otherCnt > 1)
			otherCnt = (power(2,otherCnt,MOD)-2+MOD)%MOD;
		long unset = 1;
		for (int i = 0; i < M; i++) {
			if (!colored[i] && !other[i]) {
				unset *= 2;
				unset %= MOD;
			}
		}
		ans = (ans*otherCnt*unset)%MOD;
		pw.println(ans);
		pw.close();
	}
	static class Edge implements Comparable<Edge> {
		public int n1;
		public int n2;
		public long weight;
		public Edge (int p, int q, long w) {
			n1 = p;
			n2 = q;
			weight = w;
		}
		
		public int compareTo(Edge e) {
			if (weight < e.weight) {
				return -1;
			} else if (weight > e.weight) {
				return 1;
			} else {
				return 0;
			}
		}
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
        	  public int compare(int[] arr1, int[] arr2) {
				  return arr1[0]-arr2[0]; //ascending order
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
        	  public int compare(long[] arr1, long[] arr2) {
				  //return 0;
				  if (Math.min(Math.abs(arr1[0]),Math.abs(arr1[1])) < Math.min(Math.abs(arr2[0]),Math.abs(arr2[1]))) {
					  return -1;
				  } else {
					  return 1;
				  }
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