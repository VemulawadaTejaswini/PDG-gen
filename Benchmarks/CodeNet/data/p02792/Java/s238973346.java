import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cnt = 0;
		for (int a = 1; a <= n; a++) {
			if (a % 10 == 0)
				continue;
//			System.out.println("a:" + a);
			String sa = String.valueOf(a);
			int startA = Integer.valueOf(sa.substring(0, 1));
			int endA = a % 10;

			String sn = String.valueOf(n);
			for (int i = 0; i < sn.length(); i++) {
//				System.out.println(" i:" + i);
				if (i == 0) {
					if (startA == endA) {
						cnt++;
//						System.out.println(" cnt:" + cnt + ", startA:" + startA
//								+ ", endA:" + endA);
					}
					continue;
				}

				if (i == sn.length() - 1) {
					if (endA * (int) Math.pow(10, i) + startA <= n) {
						if (i > 2) {
							cnt += Integer.valueOf(sn.substring(1, sn.length() - 1)) + 1;
//							System.out.println(" cnt:" + cnt);
						} else {
							cnt++;
//							System.out.println(" cnt:" + cnt);
						}
					}
				} else {
					cnt += (int) Math.pow(10, i - 1);
//					System.out.println(" cnt:" + cnt);
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}
