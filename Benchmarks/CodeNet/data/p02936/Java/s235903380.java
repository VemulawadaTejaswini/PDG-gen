import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N, Q;
	Node[] nodes;
	
	static class Node {
		List<Node> connected = new ArrayList<>();
		int p;
		void connect(Node n) {
			connected.add(n);
		}
		void addForLeaf(Node root) {
			for (Node n : connected) {
				if (n == root) continue;
				n.p += p;
				n.addForLeaf(this);
			}
		}
	}
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		Q = sc.nextInt();
		nodes = new Node[N];
		for (int i = 0; i < N; i++) nodes[i] = new Node();
		
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			nodes[a-1].connect(nodes[b-1]);
			nodes[b-1].connect(nodes[a-1]);
		}
		for (int i = 0; i < Q; i++) nodes[sc.nextInt()-1].p += sc.nextInt();
		
		nodes[0].addForLeaf(null);
		
		System.out.println(Arrays.stream(nodes).map(n -> String.valueOf(n.p)).collect(Collectors.joining(" ")));
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}