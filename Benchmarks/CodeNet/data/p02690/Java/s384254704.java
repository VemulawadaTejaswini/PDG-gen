import java.util.Scanner;

// https://atcoder.jp/contests/abc166/tasks/abc166_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		long end = x / 2;
		if (x % 2 != 0) {
			end = end + 1;
		}

		for (long i = 1L; i * i <= x; i++) {
			if (x % i == 0) {
//				System.out.println("i："+i);
				for (long j = 1L; j <= i; j++) {
					long a = j;
					long b = j-i;
//					System.out.println(a);
//					System.out.println(b);
					long xx = (long) (Math.pow(a, 5) - Math.pow(b, 5));
					if (xx == x) {
						System.out.println(a + " " + b);
						return;
					}
					a = i+j;
					b = j;
//					System.out.println(a);
//					System.out.println(b);
					xx = (long) (Math.pow(a, 5) - Math.pow(b, 5));
					if (xx == x) {
						System.out.println(a + " " + b);
						return;
					}



				}
			}
		}
	}
}
