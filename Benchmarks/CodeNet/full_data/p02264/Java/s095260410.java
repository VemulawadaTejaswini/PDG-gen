import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] S = sc.nextLine().split(" ");
		int n = Integer.parseInt(S[0]);
		int quantum = Integer.parseInt(S[1]);

		Queue<Node> queue = new ArrayDeque<Node>();

		for (int i = 0; i < n; i++) {
			S = sc.nextLine().split(" ");
			Node node = new Node(S[0], Integer.parseInt(S[1]));
			queue.offer(node);
		}

		long count = 0;

		while (!queue.isEmpty()) {
			Node tmp = queue.poll();
			if (tmp.getTime() > quantum) {
				count += quantum;
				tmp.setTime(tmp.getTime() - quantum);
				queue.offer(tmp);
			} else {
				count += tmp.getTime();
				System.out.printf("%s %d", tmp.getName(), count);
				System.out.println("");
			}
		}

		sc.close();
	}
}

class Node {
	private String name;
	private int time;

	public Node(String name, int time) {
		this.name = name;
		this.time = time;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTime() {
		return this.time;
	}
}

