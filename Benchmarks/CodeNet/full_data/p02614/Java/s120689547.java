import java.net.Inet4Address;
import java.util.*;

public class Main {

	static int result = 0;
	static int height = 0;
	static int width = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			String dot = sc.next();
			for (int j = 0; j < w; j++) {
				map[i][j] = dot.charAt(j);
			}
		}
		int count = 0;
		height = h;
		width = w;
		int[] rowColCount = new int[h+w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == '#') {
					count++;
					rowColCount[i]++;
					rowColCount[h+j]++;
				}
			}
		}
		if (count < k) {
			System.out.println(0);
			return;
		} else if (count == k) {
			System.out.println(1);
			return;
		}
		Stack<Integer> queue = new Stack<>();
		backtrace(rowColCount, queue, count - k, 0, map);
		System.out.println(result);
	}

	private static void backtrace(int[] rowColCount, Stack<Integer> queue, int count, int index, char[][] map) {
		if (count == 0) {
			result++;
			return;
		} else if (count < 0) {
			return;
		}

		for (int i = index; i < rowColCount.length; i++) {
			int res = count - rowColCount[i];
			if (!queue.isEmpty()) {
				int min = queue.stream().min(Integer::compareTo).get();
				int max = queue.stream().max(Integer::compareTo).get();
				if (i < height && max >= height) {
					for (int j = height; j < height + width; j++) {
						if (queue.contains(j) && map[i][j - height] == '#') {
							res += 1;
						}
					}
				}
				if (i >= height && min < height) {
					for (int j = 0; j < height; j++) {
						if (queue.contains(j) && map[j][i - height] == '#') {
							res += 1;
						}
					}
				}
			}
			queue.add(i);
			backtrace(rowColCount, queue, res, i+1, map);
			queue.pop();
		}
	}
}
