import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();
		int l = 0;
		int cnt = 0;

		for (int i = 0; i < n + 1; i++) {
			l += scan.nextInt();
			cnt++;
			if (l > x) {
				break;
			}
		}

		System.out.println(cnt);

	}
}