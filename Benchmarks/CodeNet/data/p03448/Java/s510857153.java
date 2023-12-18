import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		// 文字列の入力

		int counter = 0;
		for (int i = 0; i <= a; i++) {
			int tmp1 = x - 500 * i;
			for (int j = 0; j <= b; j++) {
				int tmp2 = tmp1 - 100 * j;
				for (int k = 0; k <= c; k++) {
					int tmp3 = tmp2 - 50 * k;
					if (tmp3 == 0) {
						counter++;
					}
				}
			}
		}

		System.out.println(counter);

	}
}
