import java.util.*;
class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Node[] node = new Node[n];
			for(int i = 0; i < n; i++) {
				node[i] = new Node(i);
			}
			Edge[] edge = new Edge[n-1];
			
			for(int i = 0; i < n-1; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int t = sc.nextInt();
				edge[i] = new Edge(a,b,t);
				node[a-1].edge.add(t);
				node[b-1].edge.add(t);		
				node[a-1].x++;
				node[b-1].x++;
			}
			int sum = 0;
			int max = 0;
			
			for(int i = 0; i < n-1; i++) {
				if(node[edge[i].f-1].x >= 2 && node[edge[i].t-1].x >= 2) {
					sum += edge[i].c * 2;
					max = Math.max(edge[i].c, max);
				}
			}
			
			if(node[0].x == 1) {
				sum += node[0].edge.get(0);
			}
			
			
			sum -= max;
			
			if(n == 2) sum = 0;
			
			System.out.println(sum);
		
		}
	}
	
	static class Node {
		int id;
		int x;
		ArrayList<Integer> edge = new ArrayList<Integer>();
		Node(int id) {
			this.id = id;
		}
	}
	
	static class Edge {
		int f;
		int t;
		int c;
		Edge(int f, int t, int c) {
			this.f = f;
			this.t = t;
			this.c = c;
		}
	}
	
	
}