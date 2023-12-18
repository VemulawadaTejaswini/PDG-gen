import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://abc067.contest.atcoder.jp/tasks/arc078_b
 */
public class Main {
	
	final static int BLACK=1;
	final static int WHITE=2;

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
		Node optBlackNode = dfs2(nodes[0], commonSize/2 + commonSize%2, null, BLACK);
		Node optWhiteNode = dfs2(nodes[N-1], commonSize/2, null, WHITE);
		
		//System.out.println(optBlackNode.id);
		//System.out.println(optWhiteNode.id);
		
		
		int blackSize = dfs3(optBlackNode, null, WHITE);
		int whiteSize = dfs3(optWhiteNode,null, BLACK);
		
		//System.out.println(blackSize);
		//System.out.println(whiteSize);
		
		String ans = blackSize > whiteSize ? "Fennec" : "Snuke";
		System.out.println(ans);
		
	}

	private static int dfs3(Node node, Node parent, int opsColor) {
		int count = 1;
		for(Node n:node.neighbor){
			if(n==parent) continue;
			if(n.color == opsColor ) continue;
			count += dfs3(n,node,opsColor);
		}
		return count;
	}
	
	private static Node dfs2(Node node, int count, Node parent, int color) {
		if(count==0){
			node.color = color;
			return node;
		}
		for(Node n:node.neighbor){
			if(n==parent) continue;
			if(n.common){
				return dfs2(n,count-1,node,color);
			}
		}
		return null;
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
				if(!n.goal && !n.start) n.common = true; 
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
		boolean common = false;
		int color = -1;
		Node(int id){
			this.id = id;
		}
	}

}
