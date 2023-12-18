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
		int Z = sc.ni();
		int W = sc.ni();
		int[] A = new int[N+1];
		for (int i = 1; i <= N; i++)
			A[i] = sc.ni();
		int[] X = new int[N+1];
		X[0] = Z;
		for (int i = 1; i <= N; i++)
			X[i] = A[i];
		
		int[] Y = new int[N+1];
		Y[0] = W;
		for (int i = 1; i <= N; i++)
			Y[i] = A[i];
		
		SegmentTree[] rows = new SegmentTree[N+1];
		for (int i = 0; i <= N; i++)
			rows[i] = new SegmentTree(N+1,-1);
		SegmentTree[] cols = new SegmentTree[N+1];
		for (int j = 0; j <= N; j++)
			cols[j] = new SegmentTree(N+1,1);
		
		
		long[][] dp = new long[N+1][N+1];
		for (int i = 0; i < N; i++) {
			dp[i][N] = Math.abs(X[i]-Y[N]);
			rows[i].update(0, 0, N, N, dp[i][N]);
			cols[N].update(0, 0, N, i, dp[i][N]);
		}
		for (int j = 0; j < N; j++) {
			dp[N][j] = Math.abs(X[N]-Y[j]);
			rows[N].update(0, 0, N, j, dp[N][j]);
			cols[j].update(0, 0, N, N, dp[N][j]);
		}
		rows[N].update(0, 0, N, N, Long.MAX_VALUE);
		cols[N].update(0, 0, N, N, -1);
		for (int i = N-1; i >= 0; i--) {
			for (int j = N-1; j >= 0; j--) {
				if (i<j) {
					dp[i][j] = cols[j].query(0, 0, N, j+1, N);
					rows[i].update(0, 0, N, j, dp[i][j]);
					cols[j].update(0, 0, N, i, dp[i][j]);
				} else if (i>j) {
					dp[i][j] = rows[i].query(0, 0, N, i+1, N);
					rows[i].update(0, 0, N, j, dp[i][j]);
					cols[j].update(0, 0, N, i, dp[i][j]);
				} else {
					rows[i].update(0, 0, N, j, Long.MAX_VALUE);
					cols[j].update(0, 0, N, i, -1);
				}
			}
		}
		
		long ans = 0;
		for (int i = 1; i <= N; i++)
			ans = Math.max(ans,dp[i][0]);
		pw.println(ans);
		
		pw.close();
	}
	
	//No lazy propagation. 0 indexed. Very fast.
	static class SegmentTree {
	  public long[] tree;
	  public int N;
	  public int type;

	  //Zero initialization
	  public SegmentTree(int n, int t) {
	    N = n;
	    tree = new long[(int)(Math.ceil((Math.log(N) / Math.log(2)) + 1))];
	    type = t;
	  }

	  public long query(int treeIndex, int lo, int hi, int i, int j) {
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
	    
	    long leftQuery = query(2 * treeIndex + 1, lo, mid, i, mid);
	    long rightQuery = query(2 * treeIndex + 2, mid + 1, hi, mid + 1, j);

	    // merge query results
	    return merge(leftQuery, rightQuery);
	  }

	  public void update(int treeIndex, int lo, int hi, int arrIndex, long val) {
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

	  public long merge(long a, long b) {
		  if (type == -1)
			  return Math.min(a,b);
		  else if (type == 1)
			  return Math.max(a,b);
		  else
			  return -1;
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
				  if (a[0] != b[0]) {
					  return (a[0]-b[0]);
				  } else {
					  return (a[1]-b[1]);
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