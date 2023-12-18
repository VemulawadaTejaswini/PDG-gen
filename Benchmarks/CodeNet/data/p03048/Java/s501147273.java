import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt(); // 赤色の箱に入っているボールの個数
		int G = sc.nextInt(); // 緑色の箱に入っているボールの個数
		int B = sc.nextInt(); // 青色の箱に入っているボールの個数
		int N = sc.nextInt(); // 合計のボールの個数
		sc.close();

		int count = 0;

		for (int i = 0; i <= N;) {
			for (int j = 0; j <= N;) {
				int t = i + j;
				if (i + j + t > N) {
					break;
				}
				int tmp = N - (i + j);
				if (tmp >= 0 && tmp % B == 0) {
					count++;
				}
				j += G;
			}
			i += R;
		}
		System.out.println(count);
	}
}