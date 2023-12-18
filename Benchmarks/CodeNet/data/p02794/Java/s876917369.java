import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		int[][] edges = new int[N-1][2];
		ArrayList<Edge>[] tree = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			tree[i] = new ArrayList<Edge>();
		}
		for (int i = 0; i < N-1; i++) {
			edges[i][0] = sc.ni()-1;
			edges[i][1] = sc.ni()-1;
			tree[edges[i][0]].add(new Edge(edges[i][1],i));
			tree[edges[i][1]].add(new Edge(edges[i][0],i));
		}
		int M = sc.ni();
		long[] path = new long[M];
		for (int i = 0; i < M; i++) {
			int u = sc.ni()-1;
			int v = sc.ni()-1;
			int[] prev = new int[N];
			int[] takeEdge = new int[N];
			boolean[] vis = new boolean[N];
			vis[u] = true;
			Arrays.fill(prev,-1);
			Arrays.fill(takeEdge,-1);
			ArrayDeque<Integer> bfs = new ArrayDeque<Integer>();
			bfs.add(u);
			while (! bfs.isEmpty()) {
				int node = bfs.poll();
				for (Edge next: tree[node]) {
					if (! vis[next.to]) {
						vis[next.to] = true;
						prev[next.to] = node;
						takeEdge[next.to] = next.index;
						bfs.add(next.to);
					}
				}
			}
			
			int n = v;
			while (n != u) {
				long bit = (long)takeEdge[n];
				path[i] += (1<<bit);
				n = prev[n];
			}
		}
		
		long[] dp = new long[1<<M]; //The bitmask of the required edges that must be painted white in order to fail certain restrictions.
		long[] cnt = new long[1<<M]; //the number of possible colorings to satisfy the dp.
		for (int i = 0; i < M; i++) {
			dp[1<<i] = path[i];
			cnt[1<<i] = (1<<((long)((N-1)-Long.bitCount(path[i]))));
		}
		for (int i = 1; i < dp.length; i++) {
			if (dp[i] > 0) continue;
			//Let i = "10111100"
			int right = Integer.lowestOneBit(i); //100
			int left = i-right; //10111000
			dp[i] = (dp[left]|dp[right]);
			cnt[i] = (1<<((long)((N-1)-Long.bitCount(dp[i]))));
		}
		
		//pw.println(Arrays.toString(cnt));
		
		//Inclusion Exclusion
		long badCases = 0;
		for (int i = 1; i < dp.length; i++) {
			if (Long.bitCount(i) % 2 == 0) {
				badCases -= cnt[i];
			} else {
				badCases += cnt[i];
			}
		}
		long totalCases = (1<<((long)(N-1)));
		pw.println(totalCases-badCases);
		pw.close();
	}
	
	static class Edge {
		public int to;
		public int index;
		public Edge (int t, int i) {
			to = t;
			index = i;
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