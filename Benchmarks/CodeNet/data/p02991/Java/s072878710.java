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
		int M = sc.ni();
		ArrayList<Integer>[] graph = new ArrayList[3*N];
		for (int i = 0; i < 3*N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int u = sc.ni()-1;
			int v = sc.ni()-1;
			graph[u].add(N+v);
			graph[N+u].add(2*N+v);
			graph[2*N+u].add(v);
		}
		int root = sc.ni()-1;
		int dest = sc.ni()-1;
		ArrayDeque<Integer> bfs = new ArrayDeque<Integer>();
		int[] dist = new int[3*N];
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[root] = 0;
		bfs.add(root);
		while (! bfs.isEmpty()) {
			int node = bfs.poll();
			for (int neighbor: graph[node]) {
				if (dist[neighbor] == Integer.MAX_VALUE) {
					dist[neighbor] = dist[node]+1;
					bfs.add(neighbor);
				}
			}
		}
		
		if (dist[dest] == Integer.MAX_VALUE) {
			pw.println(-1);
		} else {
			pw.println(dist[dest]/3);
		}
		pw.close();
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
				  //return arr1[0]-arr2[0]; //ascending order
				  if (arr1[0] != arr2[0]) {
					  return arr1[0]-arr2[0];
				  } else {
					  return arr1[1] - arr2[1];
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
        	  public int compare(long[] arr1, long[] arr2) {
				  //return 0;
				  if (arr1[0] < arr2[0]) {
					  return -1;
				  } else if (arr1[1] > arr2[1]) {
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