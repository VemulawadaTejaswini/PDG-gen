import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	static final long MOD = 1000000007L;
	static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		
		int N = sc.ni();
		int[][] temp = new int[N][2];
		int[] old = new int[N];
		for (int i = 0; i < N; i++) {
			temp[i][0] = sc.ni();
			temp[i][1] = i;
			old[i] = temp[i][0];
		}
		temp = shuffle(temp);
		temp = sort(temp);
		int[] W = new int[N];
		int[] indices = new int[N];
		for (int i = 0; i < N; i++) {
			W[temp[i][1]] = i;
			indices[i] = temp[i][1];
		}
		int[] prev = new int[N];
		int p = -1;
		prev[0] = p;
		for (int w = 1; w < N; w++) {
			if (old[indices[w]] > old[indices[w-1]])
				p = w-1;
			prev[w] = p;
		}
		
		ArrayList<Integer>[] tree = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < N-1; i++) {
			int n1 = sc.ni()-1;
			int n2 = sc.ni()-1;
			tree[n1].add(n2);
			tree[n2].add(n1);
		}
		ArrayDeque<Integer> bfs = new ArrayDeque<Integer>();
		bfs.add(0);
		int[] parent = new int[N];
		Arrays.fill(parent, -2);
		parent[0] = -1;
		while (!bfs.isEmpty()) {
			int n = bfs.poll();
			for (int next: tree[n]) {
				if (parent[next] == -2) {
					parent[next] = n;
					bfs.add(next);
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < tree[i].size(); i++) {
				if (tree[i].get(j)==parent[i]) {
					//not a child
					tree[i].remove(j);
					break;
				}
			}
		}
		
		
		//euler tour
		int[] arr = new int[N];
		SegmentTree st = new SegmentTree(N);
		
		int[] ans = new int[N];

		int[] cnt = new int[N]; //number of children of node i visited
		int node = 0;
		while (node != -1) {
			//System.out.println(node);
			if (cnt[node] < tree[node].size()) {
				//add the current node to the LIS segment tree. go down.
				int val = 1;
				if (prev[W[node]] >= 0)
					val += st.query(0, 0, N-1, 0, prev[W[node]]);
				arr[W[node]] = val;
				ans[node] = val;
				st.update(0, 0, N-1, W[node], arr[W[node]]);
				cnt[node] += 1;
				node = tree[node].get(cnt[node]-1);
			} else {
				//remove the current node to the LIS segment tree. go up.
				int val = 1;
				if (prev[W[node]] >= 0)
					val += st.query(0, 0, N-1, 0, prev[W[node]]);
				ans[node] = val;
				arr[W[node]] = 0;
				st.update(0, 0, N-1, W[node], 0);
				node = parent[node];
			}
		}
		for (int a: ans)
			pw.println(a);
		
		pw.close();
	}
	
	//No lazy propagation. 0 indexed. Very fast.
	static class SegmentTree {
		public int[] tree;
		public int N;

		//Zero initialization
		public SegmentTree(int n) {
			N = n;
			tree = new int[4*N+1];
		}
		
		public int query(int treeIndex, int lo, int hi, int i, int j) {
			// query for arr[i..j]
			if (lo > j || hi < i)
				return 0;
			if (i <= lo && j >= hi)
				return tree[treeIndex];
			int mid = lo + (hi - lo) / 2;

			if (i > mid)
				return query(2 * treeIndex + 2, mid + 1, hi, i, j);
			else if (j <= mid)
				return query(2 * treeIndex + 1, lo, mid, i, j);

			int leftQuery = query(2 * treeIndex + 1, lo, mid, i, mid);
			int rightQuery = query(2 * treeIndex + 2, mid + 1, hi, mid + 1, j);

			// merge query results
			return merge(leftQuery, rightQuery);
		}

		public void update(int treeIndex, int lo, int hi, int arrIndex, int val) {
			if (lo == hi) {
				tree[treeIndex] = val;
				return;
			}

			int mid = lo + (hi - lo) / 2;

			if (arrIndex > mid)
				update(2 * treeIndex + 2, mid + 1, hi, arrIndex, val);
			else if (arrIndex <= mid)
				update(2 * treeIndex + 1, lo, mid, arrIndex, val);

			// merge updates
			tree[treeIndex] = merge(tree[2 * treeIndex + 1], tree[2 * treeIndex + 2]);
		}

		public int merge(int a, int b) {
			return Math.max(a,b);
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
				  return a[0]-b[0]; //ascending order
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