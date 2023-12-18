import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc077/tasks/arc084_b
 */
public class Main {

	static Node nodes[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		nodes = new Node[N];
		for(int i=0; i<N; i++) {
			nodes[i] = new Node(i);
		}

		for(int i=0; i<N-1; i++){
			Node u = nodes[Integer.parseInt(sc.next()) - 1];
			Node v = nodes[Integer.parseInt(sc.next()) - 1];
			int w = Integer.parseInt(sc.next());
			u.neighbors.put(v.id, w);
			v.neighbors.put(u.id, w);
		}
		sc.close();
		
		nodes[0].ans = 0;
		setAns(nodes[0]);
		
		for(Node n: nodes) {
			System.out.println(n.ans);
		}
		
	}
	
	public static void setAns(Node node){
		for(Entry<Integer, Integer> entry : node.neighbors.entrySet()) {
			Node n = nodes[entry.getKey()]; 
			if (n.ans < 0) {
				if(entry.getValue()%2 == 0) {
					n.ans = node.ans;
				}else {
					n.ans = (node.ans+1)%2;
				}
				setAns(n);
			}
		}
	}
	
	static class Node{
		int id;
		int ans = -1;
		HashMap<Integer, Integer> neighbors = new HashMap<Integer, Integer>();
		Node(int id){
			this.id = id;
		}
	}

}