
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 1; i < n - 1; i++) {
				int a = i * i % n;
				if (!list.contains(a)) {
					list.add(a);
				}
			}
			int[] num = new int[(n + 1) / 2];
			for (int i = 1; i < list.size(); i++) {
				for (int j = 0; j < i; j++) {
					num[slove(i, j, list, n)]++;
					num[slove(j, i, list, n)]++;
				}
			}
			for (int i = 1; i < num.length; i++) {
				System.out.println(num[i]);
			}

		}
	}

	private static int slove(int i, int j, List<Integer> list, int n) {
		int t = list.get(i) - list.get(j);
		if (t < 0) {
			t += n;
		}
		if (t > (n - 1) / 2) {
			t = n - t;
		}
		return t;
	}
}