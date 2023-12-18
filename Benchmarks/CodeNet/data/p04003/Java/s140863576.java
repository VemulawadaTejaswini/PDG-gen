import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Edge, Integer> map = new HashMap<>();
		ArrayList<Edge>[] adj= new ArrayList[n];
		for(int i=0;i<n;i++) {
			adj[i] = new ArrayList<>();
		}
//		int dp[] = new int[2*m];
		
		HashMap<Edge, Integer> get = new HashMap<>();
		for(int i=0;i<m;i++) {
			int p = sc.nextInt()-1;
			int q = sc.nextInt()-1;
			int c = sc.nextInt()-1;
			Edge x = new Edge(q,c);
			Edge y = new Edge(p,c);
			adj[p].add(x);
			adj[q].add(y);
			get.put(x,2*i);
			get.put(y,2*i+1);
			
		}
		HashMap<Edge, Integer> dp = new HashMap<Edge, Integer>();
		LinkedList<Edge> pq = new LinkedList<>();
			
		for(Edge x : adj[0]) {
			dp.put(x,1);
			pq.add(x);
		}
		while(!pq.isEmpty()) {
			Edge curr = pq.poll();
			int steps = dp.get(curr);
			for(Edge next : adj[curr.dest]) {
				if(next.c==curr.c) {
					if(steps<dp.getOrDefault(next,1000000000)) {
						dp.put(next, steps);
						pq.addFirst(next);
					}
				}
				else {
					if(steps+1<dp.getOrDefault(next,1000000000)) {
						dp.put(next,steps+1);
						pq.addLast(next);
					}
				}
			}
		}
		int min = 1000000000;
		for(int c=0;c<1000000;c++) {
			min = Math.min(min,dp.getOrDefault(new Edge(n-1,c),1000000000));
		}
		if(min>=1000000000) {
			System.out.println(-1);
		}
		else {
			System.out.println(min);
		}
		
	}
	static class Edge{
		int dest;
		int c;
		public Edge(int dest,int c) {
			this.dest = dest;
			this.c = c;
		}
		@Override
		public int hashCode() {
			return dest*1299827+c*1299821;
		}
		@Override
		public boolean equals(Object o) {
			Edge e = (Edge)o;
			return (e.dest==dest && e.c==c);
		}
		
	}
}
class MyScanner
{
   BufferedReader br;
   StringTokenizer st;
 
   public MyScanner() {
      br = new BufferedReader(new InputStreamReader(System.in));
   }
 
   String next() {
       while (st == null || !st.hasMoreElements()) {
           try {
               st = new StringTokenizer(br.readLine());
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
       return st.nextToken();
   }
 
   int nextInt() {
       return Integer.parseInt(next());
   }
 
   long nextLong() {
       return Long.parseLong(next());
   }
 
   double nextDouble() {
       return Double.parseDouble(next());
   }
 
   String nextLine(){
       String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
   }
   
   
 
}

