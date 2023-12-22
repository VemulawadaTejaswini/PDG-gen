import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			if(n == 0 && m == 0 && p == 0 && a == -1 && b == -1) break;
			int[] t = new int[n];
			for(int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
			}
			Node[] node = new Node[m];
			for(int i = 0; i < m; i++) {
				node[i] = new Node();
			}
			for(int i = 0; i < p; i++) {
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				int z = sc.nextInt();
				node[x].to.add(new Edge(y,x,z));
				node[y].to.add(new Edge(x,y,z));
			}
			PriorityQueue<Data> queue = new PriorityQueue<Data>();
			double[][] dp = new double[m][1 << n];
			for(int i = 0; i < m; i++) {
				Arrays.fill(dp[i], 2 << 27);
			}
			queue.add(new Data(a,0,0));
			double ans = 2 << 27;
			while(!queue.isEmpty()) {
				Data tmp = queue.poll();
				//System.out.println(tmp.now + " " + tmp.cost + " " + Integer.toBinaryString(tmp.use));
				if(dp[tmp.now][tmp.use] <= tmp.cost) continue;
				if(tmp.now == b) ans = Math.min(tmp.cost,ans);
				dp[tmp.now][tmp.use] = tmp.cost;
				for(int i = 0; i < node[tmp.now].to.size(); i++) {
					for(int k = 0; k < n; k++) {
						if((tmp.use & (1 << k)) != 0) continue;
						queue.add(new Data(node[tmp.now].to.get(i).to,(tmp.use | (1 << k)),(node[tmp.now].to.get(i).cost / (double)t[k]) + tmp.cost));
					}
				}
				
			}
			if(ans == 2 << 27) {
				System.out.println("Impossible");
			}
			else {
				System.out.printf("%.20f\n",ans);
			}
			
			
			
			
 		}
	}
	static class Data implements Comparable<Data>{
		int now;
		int use;
		double cost;
		@Override
		public int compareTo(Data o) {
			if(this.cost < o.cost) return -1;
			else if(this.cost > o.cost) return 1;
			return 0;
		}
		Data(int a, int b, double c) {
			now = a;
			use = b;
			cost = c;
		}
		
		
	}
	
	
	static class Node {
		static int ID = 0;
		int id;
		Node() {
			id = ID++;
		}
		ArrayList<Edge> to = new ArrayList<Edge>();
	}
	static class Edge {
		int to;
		int from;
		int cost;
		Edge(int a, int b, int c) {
			to = a;
			from = b;
			cost = c;
		}
	}
	
}