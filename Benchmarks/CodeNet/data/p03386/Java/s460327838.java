import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 小さい方の整数
		int b = sc.nextInt(); // 大きい方の整数
		int k = sc.nextInt(); // 端からの範囲

		if ((b - a + 1) / k < 2) { // 全部中身を表示すれば良い
			while (a <= b) {
				System.out.println(a);
				a++;
			}
		} else { // 両端からK個表示させる
			for (int i = a; i < a + k; i++) {
				System.out.println(i);
			}
			for (int j = b - k + 1; j <= b; j++) {
				System.out.println(j);
			}

		}

	}
}
