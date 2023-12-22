import java.util.Scanner;

// https://atcoder.jp/contests/abc166/tasks/abc166_D
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		for (long i = 1L; i * i <= x; i++) {
			if (x % i == 0) {
				//				System.out.println("i："+i);
				for (long a = -220; a <= 220; a++) {
					for (long b = -220; b <= 220; b++) {
						long xx = (long) (Math.pow(a, 5) - Math.pow(b, 5));
						if (xx == x) {
							System.out.println(a + " " + b);
							return;
						}
					}
				}
			}
		}

	}
}
