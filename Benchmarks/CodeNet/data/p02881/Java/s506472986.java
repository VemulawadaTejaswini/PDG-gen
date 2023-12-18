import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		int cnt = 0;
		int x = 1;
		int y = 1;

		for (int i = 0; i < N - 1; i++) {
			if (x * y == N) {
				System.out.println(cnt);
			} else if (x != y) {
				if (x > y) {
					y++;
					cnt++;
				} else {
					x++;
					cnt++;
				}
			} else if (x == y) {
				x++;
				cnt++;
			}
		}
	}
}