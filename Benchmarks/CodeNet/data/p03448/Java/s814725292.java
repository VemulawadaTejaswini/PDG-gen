import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int sum = a + b + c;
		int x = Integer.parseInt(sc.next());
		int cnt = 0;

		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				if (500 * i + 100 * j + 50 * (sum - i - j) == x) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
