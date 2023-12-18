
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		// 年齢
		int r = sc.nextInt();

		// 通常の値段
		int D = sc.nextInt();

		// x(2000)～x(2011)の配列(11個)
		int x[] = new int[11];

		for (int i = 0; i < 11; i++) {
			// x(2000)のみ入力
			if (i == 0) {
				x[i] = sc.nextInt();
				continue;
			}

			// 指定された式
			x[i] = r * x[i - 1] - D;
			System.out.println(x[i]);

		}

	}
}
