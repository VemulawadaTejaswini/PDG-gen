import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if (k % 2 == 0) {
			System.out.println(-1);
			return;
		}
		int p = 7;
		for (int i = 1; i < 1000000; i++) {
			if (p % k == 0) {
				System.out.println(i);
				return;
			}
			p = (10 * p + 7) % k;
		}
		System.out.println(-1);
	}

}
