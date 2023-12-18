import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://abc054.contest.atcoder.jp/tasks/abc054_c
 */
public class Main {
	
	static Node[] nodes;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		nodes = new Node[N];
		for(int i=0; i<N; i++) nodes[i] = new Node(i);
		for(int i=0; i<M; i++){
			Node a = nodes[sc.nextInt()-1];
			Node b = nodes[sc.nextInt()-1];
			a.neighbors.add(b);
			b.neighbors.add(a);
		}
		sc.close();
		
		boolean[] visited = new boolean[N];
		for(int i=0; i<N; i++) visited[i] = false;
		long ans = dfs(nodes[0], visited, 1);
		
		System.out.println(ans);

	}
	
	private static long dfs(Node node, boolean[] visited, int current) {
		visited[node.id] = true;
		if(current==nodes.length){
			return 1;
		}
		long count = 0;
		for(Node n:node.neighbors){
			if(!visited[n.id]){
				boolean[] v = Arrays.copyOf(visited, visited.length);
				count += dfs(n, v, current+1);
			}
		}
		return count;
	}

	static class Node{
		int id;
		Set<Node> neighbors = new HashSet<>();
		Node(int id){
			this.id = id;
		}
	}

}