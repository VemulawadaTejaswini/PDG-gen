import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int frontNum = scanner.nextInt();
			int sideNum = scanner.nextInt();
			if (frontNum == 0) {
				scanner.close();
				break;
			}

			int[] front = new int[frontNum];
			Map<Integer, Queue<Integer>> frontMap = new HashMap<Integer, Queue<Integer>>();
			Map<Integer, Queue<Integer>> sideMap = new HashMap<Integer, Queue<Integer>>();
			for (int i = 1; i <= 20; i++) {
				Queue<Integer> frontList = new ArrayDeque<Integer>();
				Queue<Integer> sideList = new ArrayDeque<Integer>();
				frontMap.put(i, frontList);
				sideMap.put(i, sideList);
			}

			for (int y = 0; y < front.length; y++) {
				front[y] = scanner.nextInt();
				frontMap.get(front[y]).add(y);
			}

			int[] side = new int[sideNum];
			for (int x = 0; x < side.length; x++) {
				side[x] = scanner.nextInt();
				sideMap.get(side[x]).add(x);
			}

			int[][] ans = new int[sideNum][frontNum];
			int sum = 0;
			for (int height = 20; height >= 1; height--) {
				while (!sideMap.get(height).isEmpty()
						&& !frontMap.get(height).isEmpty()) {
					int sidex = sideMap.get(height).poll();
					int fronty = frontMap.get(height).poll();
					ans[sidex][fronty] = height;
					sum += height;
				}
			}

			for (int height = 20; height >= 1; height--) {
				while (!sideMap.get(height).isEmpty()) {
					int sidex = sideMap.get(height).poll();
					for (int y = 0; y < ans[sidex].length; y++) {
						if (ans[sidex][y] == 0 && front[y] >= height) {
							ans[sidex][y] = height;
							sum += height;
							break;
						}
					}
				}

				while (!frontMap.get(height).isEmpty()) {
					int frontH = frontMap.get(height).poll();
					for (int j = 0; j < ans.length; j++) {
						if (ans[j][frontH] == 0 && side[j] >= height) {
							ans[j][frontH] = height;
							sum += height;
							break;
						}
					}
				}
			}
			System.out.println(sum);

		}

	}
}