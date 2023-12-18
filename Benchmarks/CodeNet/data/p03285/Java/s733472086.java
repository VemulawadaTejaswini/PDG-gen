import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean flg = false;

		int res = 0;
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 20; j++) {
				res = 4 * i + 7 * j;
				if (res == N) {
					flg = true;
					break;
				}
				if (res > N) {
					break;
				}
			}
		}
		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();

	}

}