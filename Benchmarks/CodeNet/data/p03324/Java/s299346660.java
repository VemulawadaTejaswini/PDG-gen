import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		if (d == 0) {
			int cnt = 0;
			for (int i = 1; ; i++) {
				if (i % 100 != 0) {
					cnt++;
					if (cnt == n) {
						System.out.println(i);
						return;
					}
				}
			}
		}
		if (d == 1) {
			int cnt = 0;
			for (int i = 100; ; i+=100) {
				if (i % 10000 != 0) {
					cnt++;
					if (cnt == n) {
						System.out.println(i);
						return;
					}
				}
			}
		}
		if (d == 2) {
			int cnt = 0;
			for (int i = 10000; ; i+=10000) {
				if (i % 1000000 != 0) {
					cnt++;
					if (cnt == n) {
						System.out.println(i);
						return;
					}
				}
			}
		}
	}
}
