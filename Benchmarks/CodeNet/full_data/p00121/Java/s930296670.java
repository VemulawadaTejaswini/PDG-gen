import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static final int MAX_NUM = 76543210;

	void run() {
		Scanner scan = new Scanner(System.in);
		int[] ans = new int[MAX_NUM + 1];
		Queue<int[]> que = new LinkedList<int[]>();
		que.add(new int[] { 0, 1, 2, 3, 4, 5, 6, 7 });
		while (!que.isEmpty()) {
			int size = que.size();
			for (int i = 0; i < size; i++) {
				int[] p = que.poll();
				int num = convertArrayToNumber(p);
				int index = getZeroOfIndex(p);
				int[] d = { -4, -1, 1, 4 };
				for (int j = 0; j < d.length; j++) {
					int ni = index + d[j];
					if (ni < 0 || ni >= 8)
						continue;
					if (index == 4 && d[j] == -1)
						continue;
					if (index == 3 && d[j] == 1)
						continue;
					int[] np = p.clone();
					swap(np, ni, index);
					int n = convertArrayToNumber(np);
					if (ans[n] != 0)
						continue;
					if (ans[n] == 0 && n == 1234567) continue;
					ans[n] = ans[num] + 1;
					que.add(np);
				}
			}
		}
		while (scan.hasNext()) {
			int[] pazzle = new int[8];
			for (int i = 0; i < 8; i++) {
				pazzle[i] = scan.nextInt();
			}
			System.out.println(ans[convertArrayToNumber(pazzle)]);
		}
	}

	void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

	int convertArrayToNumber(int[] array) {
		int sum = 0;
		for (int i = 1; i <= 8; i++) {
			sum += array[i - 1] * Math.pow(10, 8 - i);
		}
		return sum;
	}

	int getZeroOfIndex(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}