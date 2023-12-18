import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D(sc);
	}

	
	public static class Node{ 
		HashMap<Node,Integer> edge = new HashMap<Node,Integer>(); // 相手の位置ー自分位置
		public Node() {
			
		}
		public Set<Node> nodes(){
			return edge.keySet();
		}
		public static boolean addNodes(Node left, Node right, int dist) {
			if(left.edge.containsKey(right) && left.edge.get(right)!=dist) return false;
			Set<Node> cross = new HashSet<Node>(left.nodes());
			cross.retainAll(right.nodes());
			for(Node n : cross) {
				if(!(dist == left.edge.get(n)+n.edge.get(right))) return false; 
			}
			left.edge.put(right,dist);
			right.edge.put(left,-dist);
			return true;
		}
	}
	public static void D(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		Node[] lis = new Node[N];
		for(int i=0;i<N;i++) lis[i] = new Node();
		for(int i=0;i<M;i++) {
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			int d = sc.nextInt();
			if(!Node.addNodes(lis[l], lis[r], d)) {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
	}
	
}