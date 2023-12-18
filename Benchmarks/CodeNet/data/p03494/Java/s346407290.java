import java.util.Arrays;
import java.util.Scanner;

/**
 * 【問題概要】 黒板に NN 個の正の整数 A1,…,ANA1,…,AN が書かれています。
 * すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます。
 *
 * 黒板に書かれている整数すべてを，2 で割ったものに置き換える。 すぬけ君は最大で何回操作を行うことができるかを求めてください。
 *
 * @author tsuch
 *
 */
public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main instance = new Main();
		instance.solve();
	}

	private void solve() {
		try {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				int j = 0;
				int temp = sc.nextInt();
				while (true) {
					if (temp / 2 == (temp + 1) / 2) {
						temp = temp / 2;
						j = j + 1;
					} else {
						a[i] = j;
						break;
					}
				}
			}
			int b = Arrays.stream(a).min().getAsInt();
			System.out.println(b);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}