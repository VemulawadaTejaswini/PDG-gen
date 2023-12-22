import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int ans = 1;
		long ansl = 1;
		try {
			for (int i = 0; i < n; i++) {
				int temp = sc.nextInt();
				if (temp == 0) {
					System.out.println(0);
					break;
				}
				ansl *= temp;
				ans = (int) ansl;
			}

		} catch (InputMismatchException e) {
			System.out.println(-1);
		}
		if (ans < 0) {
			System.out.println(ansl);
		}
	}
}