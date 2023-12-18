import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

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

		double maxSum = 0;
		double tmpSum = 0;
		for (int i = 0; i <= list.size() - k; i++) {

			for (int j = 0; j < k; j++) {
				tmpSum = tmpSum + list.get(i + j);
			}
			if (tmpSum > maxSum) {
				maxSum = tmpSum;
			}
			tmpSum = 0;
		}
		double re = (maxSum + k) / 2;
		System.out.println(re);

	}

}