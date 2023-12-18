import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveD();
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long w = sc.nextLong();
		long bestValue = 0;
		List<Node> nodeList = new ArrayList<Node>();
		nodeList.add(new Node(0L, w));
		for (int i = 0; i < n; i++) {
			long weight = sc.nextLong();
			long value = sc.nextLong();
			List<Node> nextNodeList = new ArrayList<Node>();
			for (Node node : nodeList) {
				if (weight <= node.restWeight) {
					nextNodeList.add(new Node(node.currentValue + value, node.restWeight - weight));
				}
				nextNodeList.add(node);
			}
			nodeList = nextNodeList;
		}
		for (Node node : nodeList) {
			if (bestValue < node.currentValue) {
				bestValue = node.currentValue;
			}
		}
		System.out.println(bestValue);
	}

	class Node {
		public long currentValue;
		public long restWeight;
		public Node(long currentValue, long restWeight) {
			this.currentValue = currentValue;
			this.restWeight = restWeight;
		}
	}
}