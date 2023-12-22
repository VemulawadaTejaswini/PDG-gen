import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int edge = sc.nextInt();

		int[][] edgeList = new int[2][edge];
		int[] masterNodeList= new int[V];
		int[] seenFlgs = new int[V];
		Deque<Integer> noticeQueue = new ArrayDeque<Integer>();

		for (int i = 0; i < edge; i++) {
			edgeList[0][i] = sc.nextInt();
			edgeList[1][i] = sc.nextInt();
		}

		Arrays.fill(seenFlgs, -1);
		Arrays.fill(masterNodeList, -1);

		noticeQueue.add(1);
		seenFlgs[0] = 0;

		int target;

		while (noticeQueue.size() > 0) {
			target = noticeQueue.poll();

			for (int i = 0; i < edge; i++) {
				if (edgeList[0][i] == target && seenFlgs[edgeList[1][i] - 1] == -1) {
					noticeQueue.add(edgeList[1][i]);
					seenFlgs[edgeList[1][i] - 1] = seenFlgs[target - 1]  + 1;
					masterNodeList[edgeList[1][i] - 1] = target;
				}

				if (edgeList[1][i] == target && seenFlgs[edgeList[0][i] - 1] == -1) {
					noticeQueue.add(edgeList[0][i]);
					seenFlgs[edgeList[0][i] - 1] = seenFlgs[target - 1]  + 1;
					masterNodeList[edgeList[0][i] - 1] = target;
				}
			}
		}

		System.out.println("Yes");
		for (int i = 1; i < V; i++) {
			System.out.println(masterNodeList[i]);
		}
	}
}