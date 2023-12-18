import java.io.*;
import java.util.*;
//import java.math.*;
//import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		int[][] points = new int[N][2];
		ArrayList<Integer> Xs = new ArrayList<Integer>();
		ArrayList<Integer> Ys = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			points[i][0] = sc.ni();
			Xs.add(points[i][0]);
			points[i][1] = sc.ni();
			Ys.add(points[i][1]);
		}
		HashMap<Integer,Integer> xMap = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> yMap = new HashMap<Integer,Integer>();
		Collections.sort(Xs);
		int xI = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0 || Xs.get(i) > Xs.get(i-1)) {
				xMap.put(Xs.get(i),xI);
				xI++;
			}
		}
		Collections.sort(Ys);
		int yI = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0 || Ys.get(i) > Ys.get(i-1)) {
				yMap.put(Ys.get(i),yI);
				yI++;
			}
		}
		DisjointSetUnion dsu = new DisjointSetUnion(xI+yI);
		for (int i = 0; i < N; i++) {
			points[i][0] = xMap.get(points[i][0]);
			points[i][1] = yMap.get(points[i][1])+xI;
			dsu.connect(points[i][0], points[i][1]);
		}
		
		long[][] XY = new long[N][2];
		for (int i = 0; i < xI+yI; i++) {
			if (i < xI) {
				XY[dsu.root(i)][0] += 1;
			} else {
				XY[dsu.root(i)][1] += 1;
			}
		}
		int[] edges = new int[N];
		for (int i = 0; i < N; i++) {
			edges[dsu.root(points[i][0])] += 1;
		}
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += (XY[i][0]*XY[i][1]-edges[i]);
		}
		pw.println(ans);
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
				  return arr1[1]-arr2[1]; //ascending order
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
				  if (arr1[0] < arr2[0]) {
					  return -1;
				  } else if (arr1[0] > arr2[0]) {
					  return 1;
				  } else {
					  return 0;
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