import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * https://beta.atcoder.jp/contests/abc070/tasks/abc070_d
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		Node[] nodes = new Node[N];
		for(int i=0; i<N; i++) nodes[i] = new Node(i);
		for(int i=0; i<N-1; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int c = sc.nextInt();
			nodes[a].edge.put(nodes[b], c);
			nodes[b].edge.put(nodes[a], c);
		}
		final int Q = sc.nextInt();
		final int K = sc.nextInt()-1;
		int[] x = new int[Q];
		int[] y = new int[Q];
		for(int i=0; i<Q; i++){
			x[i]=sc.nextInt()-1;
			y[i]=sc.nextInt()-1;
		}
		sc.close();
		
		calcDepth(nodes[K], new HashSet<Integer>());
		
		for(int i=0; i<Q; i++){
			System.out.println(nodes[x[i]].depth+nodes[y[i]].depth);
		}
		
	}
	
	static void calcDepth(Node n, Set<Integer> parents){
		parents.add(n.id);
		for(Entry<Node, Integer> c: n.edge.entrySet()){
			if(parents.contains(c.getKey().id)) continue;
			c.getKey().depth = n.depth + c.getValue();
			calcDepth(c.getKey(), parents);
		}
	}
	
	static class Node{
		int id;
		long depth = 0;
		Map<Node, Integer> edge = new HashMap<>();	
		Node(int id){
			this.id = id;
		}
	}

}