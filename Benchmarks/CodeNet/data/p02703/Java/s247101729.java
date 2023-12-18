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
		int M = sc.ni();
		int S = Math.min(sc.ni(),9999);
		int[][] edges = new int[M][4];
		for (int i = 0; i < M; i++) {
			edges[i] = new int[]{sc.ni()-1,sc.ni()-1,sc.ni(),sc.ni()};
		}
		int[][] ex = new int[N][2];
		for (int i = 0; i < N; i++) {
			ex[i] = new int[]{sc.ni(),sc.ni()};
		}
		ArrayList<Edge>[] graph = new ArrayList[10000*N];
		for (int i = 0; i < graph.length; i++)
			graph[i] = new ArrayList<Edge>();
		
		for (int i = 0; i < N; i++) {
			for (int m = 0; m < 10000; m++) {
				int n1 = 10000*i+m;
				int n2 = 10000*i+Math.min(9999, m+ex[i][0]);
				graph[n1].add(new Edge(n1,n2,ex[i][1]));
			}
		}
		
		for (int[] e: edges) {
			for (int m = e[2]; m < 10000; m++) {
				int n1 = 10000*e[0]+m;
				int n2 = 10000*e[0]+m-e[2];
				int n3 = 10000*e[1]+m;
				int n4 = 10000*e[1]+m-e[2];
				graph[n1].add(new Edge(n1,n4,e[3]));
				graph[n3].add(new Edge(n3,n2,e[3]));
			}
		}
		
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		long[] distances = new long[10000*N];
		Arrays.fill(distances,Long.MAX_VALUE);
		distances[S] = 0;
		pq.add(new Pair(S,0L));
		while (! pq.isEmpty()) {
			Pair temp = pq.poll();
			int parent = temp.node;
			for (Edge e: graph[parent]) {
				int child = e.to;
				if (distances[child] > distances[parent] + e.time) {
					distances[child] = distances[parent] + e.time;
					pq.add(new Pair(child,distances[child]));
				}
			}
		}
		long[] ans = new long[N];
		for (int i = 0; i < N; i++) {
			long v = Long.MAX_VALUE;
			for (int m = 0; m < 10000; m++) {
				v = Math.min(v,distances[10000*i+m]);
			}
			ans[i] = v;
		}
		for (int i = 1; i < N; i++)
			pw.println(ans[i]);
		
		pw.close();
	}
	
	static class Pair implements Comparable<Pair> {
		public int node;
		public long weight;
		
		public Pair(int n, long w) {
			node = n;
			weight = w;
		}
		
		public int compareTo(Pair p) {
			if (weight < p.weight)
				return -1;
			else
				return 1;
		}
	}
	
	static class Edge {
		public int from;
		public int to;
		public long time; //weight
		public Edge(int f, int t, long w) {
			from = f;
			to = t;
			time = w;
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