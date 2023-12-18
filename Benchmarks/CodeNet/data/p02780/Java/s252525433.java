import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static double max = 0;

	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		for (int j = 0; j <= list.size() - k; j++) {
			double av = ave(list, k, j);
			if (av > max) {
				max = av;
			}
		}

		System.out.println(max);

	}

	private static double ave(List<Integer> list, int k, int j) {

		double cnt = 0;
		for (int i = 0; i < k; i++) {
			cnt = cnt + list.get(i + j) + 1;
		}

		return cnt / 2;
	}

}