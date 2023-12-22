package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	//共通
	static int[][] edgeList;
	static int[] masterNodeList;
	static int[] seenFlgs;
	static Deque<Integer> noticeQueue;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int edge = sc.nextInt();

		edgeList = new int[edge][2];
		masterNodeList = new int[V];
		seenFlgs = new int[V];
		noticeQueue = new ArrayDeque<Integer>();

		for (int i = 0; i < edge; i++) {
			edgeList[i][0] = sc.nextInt();
			edgeList[i][1] = sc.nextInt();
		}

		Arrays.fill(seenFlgs, -1);

		noticeQueue.add(1);
		seenFlgs[0] = 0;

		int target;

		while (noticeQueue.size() > 0) {
			target = noticeQueue.poll();

			for (int i = 0; i < edge; i++) {
				if (edgeList[i][0] == target && seenFlgs[edgeList[i][1] - 1] == -1) {
					noticeQueue.add(edgeList[i][1]);
					seenFlgs[edgeList[i][1] - 1] = seenFlgs[edgeList[i][0] - 1]  + 1;
					masterNodeList[edgeList[i][1] - 1] = target;
				}

				if (edgeList[i][1] == target && seenFlgs[edgeList[i][0] - 1] == -1) {
					noticeQueue.add(edgeList[i][0]);
					seenFlgs[edgeList[i][0] - 1] = seenFlgs[edgeList[i][1] - 1] + 1;
					masterNodeList[edgeList[i][0] - 1] = target;
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		sb.append("Yes" + "\n");
		for (int i = 1; i < V; i++) {
			if (masterNodeList[i] == -1) {
				System.out.println("No");
			}
			sb.append(masterNodeList[i] + "\n");

			if (i == V - 1) {
				System.out.println(sb.toString());
			}
		}



	}
}