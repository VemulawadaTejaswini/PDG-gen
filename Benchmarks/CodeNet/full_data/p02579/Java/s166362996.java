import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	static final int INF = 50000000;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int H = sc.ni();
		int W = sc.ni();
		int C = (sc.ni()-1)*W+(sc.ni()-1); //beg
		int D = (sc.ni()-1)*W+(sc.ni()-1); //dest
		int[][] grid = new int[H][W];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				if (s.charAt(j)=='#')
					grid[i][j] = 1;
			}
		}
		int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
		int[][] mags = {{-2,1},{-2,2},{-2,-2},{-2,-1},{-1,-2},{-1,2},{1,-2},{1,2},{2,-2},{2,-1},{2,1},{2,2}};
		Dijkstra dij = new Dijkstra(H*W);
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				int n1 = i*W+j;
				for (int[] dir: dirs) {
					int newR = i+dir[0];
					int newC = j+dir[1];
					if (newR >= 0 && newR < H && newC >= 0 && newC < W) {
						int n2 = newR*W+newC;
						if (grid[newR][newC]==0) {
							dij.addEdge(n1, n2, 0);
						} else if (grid[i][j]==0) {
							dij.addEdge(n1, n2, 1);
						}
					}
				}
				if (grid[i][j]==1)continue;
				for (int[] mag: mags) {
					int newR = i+mag[0];
					int newC = j+mag[1];
					if (newR >= 0 && newR < H && newC >= 0 && newC < W) {
						int n2 = newR*W+newC;
						if (grid[newR][newC]==0) {
							dij.addEdge(n1, n2, 1);
						}
					}
				}
			}
		}
		int[] dist = dij.dijkstra(C);
		int ans = dist[D];
		if (ans == Integer.MAX_VALUE)
			ans = -1;
		pw.println(ans);
		
		pw.close();
	}
	
	static class Dijkstra {
		public int N;
		public ArrayList<int[]>[] graph;

		public Dijkstra(int numNodes) {
			N = numNodes;
			graph = new ArrayList[N];
			for (int i = 0; i < N; i++) {
				graph[i] = new ArrayList<int[]>();
			}
		}

		//uncomment the last line to make every edge two-way
		public void addEdge(int n1, int n2, int w) {
			graph[n1].add(new int[]{n2,w});
		}

		//uncomment the lines with "previousNode" if you'd like to calculate that
		public int[] dijkstra(int root) {
			//long[] previousNode = new long[N];
			//Arrays.fill(previousNode,-1);

			int[] distances = new int[N];
			Arrays.fill(distances,Integer.MAX_VALUE);
			distances[root] = 0;

			PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
				@Override
				public int compare(int[] arr1, int[] arr2) {
					return (arr1[1] - arr2[1]);
				}
			});
			int[] temp = new int[]{root,0};
			pq.add(temp);
			while (! pq.isEmpty()) {
				temp = pq.poll();
				for (int[] e: graph[temp[0]]) {
					int child = e[0];
					int w = e[1];
					int node = temp[0];
					if (distances[child] > distances[node] + w) {
						distances[child] = distances[node] + w;
						pq.add(new int[]{child,distances[child]});
					}
				}
			}

			return distances;
		}
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