import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static final int MAX_NUM = 76543210;
	int[] ans, pazzle;

	void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			ans = new int[MAX_NUM + 1];
			pazzle = new int[8];
			for (int i = 0; i < 8; i++)
				pazzle[i] = scan.nextInt();
			bfs();
		}
	}

	void bfs() {
		Queue<int[]> que = new LinkedList<int[]>();
		que.add(pazzle);
		while (!que.isEmpty()) {
			int size = que.size();
			for (int i = 0; i < size; i++) {
				int[] p = que.poll();
				int num = convertArrayToNumber(p);
				if (num == 1234567) {
					System.out.println(ans[num]);
					return;
				}
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
					ans[n] = ans[num] + 1;
					que.add(np);
				}
			}
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