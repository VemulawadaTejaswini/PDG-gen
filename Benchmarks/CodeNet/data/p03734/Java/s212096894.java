import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveD();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		long ans = t * n;
		long prev = -t;
		for (int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			if (tmp - prev < t) {
				ans -= t - tmp + prev;
			}
			prev = tmp;
		}
		System.out.println(ans);
	}

	private void solveD() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long w = sc.nextLong();
		long bestValue = 0;
		List<Node> nodeList = new ArrayList<Node>();
		nodeList.add(new Node(0L, w));
		long firstWeight = 0;
		for (int i = 0; i < n; i++) {
			long weight = sc.nextLong();
			long value = sc.nextLong();
			if (i == 0) {
				firstWeight = weight;
			}
			List<Node> nextNodeList = new ArrayList<Node>();
			for (Node node : nodeList) {
				if (weight <= node.restWeight) {
					nextNodeList.add(new Node(node.currentValue + value, node.restWeight - weight));
				}
				if (node.restWeight <= (n - i) * (firstWeight + 3)) {
					nextNodeList.add(node);
				}
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