import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int edge = sc.nextInt();

		int[][] edgeList = new int[2][edge];
		int[] masterNodeList= new int[V];
		ArrayDeque<Integer> noticeQueue = new ArrayDeque<Integer>();

		for (int i = 0; i < edge; i++) {
			edgeList[0][i] = sc.nextInt();
			edgeList[1][i] = sc.nextInt();
		}

		Arrays.fill(masterNodeList, -1);

		noticeQueue.add(1);

		int target;

		while (noticeQueue.size() > 0) {
			target = noticeQueue.poll();

			for (int i = 0; i < edge; i++) {
				int edge_a = edgeList[0][i];
				int edge_b = edgeList[1][i];

				if (edge_a == target && masterNodeList[edge_b - 1] == -1) {
					noticeQueue.add(edge_b);
					masterNodeList[edge_b - 1] = target;
				}

				if (edge_b == target && masterNodeList[edge_a - 1] == -1) {
					noticeQueue.add(edge_a);
					masterNodeList[edge_a - 1] = target;
				}
			}
		}

		System.out.println("Yes");
		for (int i = 1; i < V; i++) {
			System.out.println(masterNodeList[i]);
		}
	}
}