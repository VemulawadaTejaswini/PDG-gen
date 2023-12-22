import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int year, money;

	static int calc() {
		int type = sc.nextInt();
		double ratio = sc.nextDouble();
		int fee = sc.nextInt();
		if (type == 0) {
			int v = money;
			int add = 0;
			for (int i = 0; i < year; ++i) {
				add += (int) (v * ratio);
				v -= fee;
			}
			return v + add;
		} else {
			int v = money;
			for (int i = 0; i < year; ++i) {
				v += (int) (v * ratio);
				v -= fee;
			}
			return v;
		}
	}

	public static void main(String[] args) {
		int M = sc.nextInt();
		for (int i = 0; i < M; ++i) {
			money = sc.nextInt();
			year = sc.nextInt();
			int N = sc.nextInt();
			int ans = 0;
			for (int j = 0; j < N; ++j) {
				ans = Math.max(ans, calc());
			}
			System.out.println(ans);
		}
	}
}