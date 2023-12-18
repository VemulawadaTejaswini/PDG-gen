import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;

public class Main {
	static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		int U = sc.ni()-1;
		int V = sc.ni()-1;
		ArrayList<Integer>[] tree = new ArrayList[N];
		for (int i = 0; i < N; i++)
			tree[i] = new ArrayList<Integer>();
		for (int i = 0; i < N-1; i++) {
			int n1 = sc.ni()-1;
			int n2 = sc.ni()-1;
			tree[n1].add(n2);
			tree[n2].add(n1);
		}
		int[] uDist = new int[N];
		Arrays.fill(uDist,Integer.MAX_VALUE);
		uDist[U] = 0;
		
		int[] vDist = new int[N];
		Arrays.fill(vDist,Integer.MAX_VALUE);
		vDist[V] = 0;
		
		ArrayDeque<Integer> bfs = new ArrayDeque<Integer>();
		bfs.add(U);
		while (! bfs.isEmpty()) {
			int node = bfs.pollFirst();
			for (int neighbor: tree[node]) {
				if (uDist[neighbor] == Integer.MAX_VALUE) {
					uDist[neighbor] = uDist[node]+1;
					bfs.add(neighbor);
				}
			}
		}
		
		
		bfs.add(V);
		while (! bfs.isEmpty()) {
			int node = bfs.pollFirst();
			for (int neighbor: tree[node]) {
				if (vDist[neighbor] == Integer.MAX_VALUE) {
					vDist[neighbor] = vDist[node]+1;
					bfs.add(neighbor);
				}
			}
		}
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (uDist[i] < vDist[i]) {
				ans = Math.max(ans,vDist[i]);
			}
		}
		pw.println(ans-1);
		pw.close();
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
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
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
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