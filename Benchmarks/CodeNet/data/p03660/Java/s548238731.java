import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://abc067.contest.atcoder.jp/tasks/arc078_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Node[] nodes = new Node[N];
		for(int i=0; i<N; i++) nodes[i] = new Node(i);
		for(int i=0; i<N-1; i++){
			Node a = nodes[Integer.parseInt(sc.next())-1];
			Node b = nodes[Integer.parseInt(sc.next())-1];
			a.neighbor.add(b);
			b.neighbor.add(a);
		}
		sc.close();
		
		nodes[0].start = true;
		nodes[N-1].goal = true;
		int commonSize = dfs1(nodes[0],null)-1;
		int blackSize = dfs2(nodes[0],null)-1;
		int whiteSize = dfs2(nodes[N-1],null)-1;
		
		String ans = blackSize + commonSize%2 > whiteSize ? "Fennec" : "Snuke";
		System.out.println(ans);
		
	}
	
	private static int dfs2(Node node, Node parent) {
		int count = 1;
		for(Node n:node.neighbor){
			if(n==parent) continue;
			if(n.color>=0) continue;
			count += dfs2(n,node);
		}
		return count;
	}

	private static int dfs1(Node node, Node parent) {
		if(node.goal){
			return 0;
		}
		int size = -1;
		for(Node n:node.neighbor){
			if(n==parent) continue;
			int s = dfs1(n,node);
			if(s>=0){
				size = s+1;
				if(!n.goal && !n.start) n.color=1; 
				break;
			}
		}
		return size;
	}

	static class Node{
		int id;
		Set<Node> neighbor = new HashSet<>();
		boolean goal = false;
		boolean start = false;
		int color = -1;
		Node(int id){
			this.id = id;
		}
	}

}