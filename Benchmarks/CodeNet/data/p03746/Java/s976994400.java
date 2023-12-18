import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static class Node {
		int idx;
		ArrayList<Node> edges = new ArrayList<>();
		public Node(int idx) {
			this.idx = idx;
		}
	}
	public static class Graph {
		int N;
		Node[] nodes;
		public Graph(int n) {
			N = n;
			nodes = new Node[N];
			for(int i=0; i<N; i++)
				nodes[i] = new Node(i);
		}
		
		public void addEdge(int a, int b) {
			nodes[a].edges.add(nodes[b]);
			nodes[b].edges.add(nodes[a]);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = sc.nextInt();
		Graph g = new Graph(N);

		int M = sc.nextInt();
		for(int i=0; i<M; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			g.addEdge(a, b);
		}
		
		LinkedList<Integer> ans = new LinkedList<>();
		boolean[] visited = new boolean[N];
		int head = 0;
		int tail = g.nodes[0].edges.get(0).idx;
		visited[head] = visited[tail] = true;
		ans.add(head);
		ans.add(tail);
		
		while(true) {
			int next=-1;
			for(Node n : g.nodes[head].edges) {
				if(!visited[n.idx]) {
					next = n.idx;
					break;
				}
			}
			if(next<0)
				break;
			visited[next] = true;
			ans.push(next);
			head = next;
		}
		while(true) {
			int next=-1;
			for(Node n : g.nodes[tail].edges) {
				if(!visited[n.idx]) {
					next = n.idx;
					break;
				}
			}
			if(next<0)
				break;
			visited[next] = true;
			ans.add(next);
			tail = next;
		}
	
		pw.println(ans.size());
		Iterator<Integer> it = ans.iterator();
		while(it.hasNext())
			pw.print((it.next()+1) + (it.hasNext() ? " " : "\n"));
		
		sc.close();
		pw.close();
	}
}
