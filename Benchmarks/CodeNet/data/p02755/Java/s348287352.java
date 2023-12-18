import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean bool = true;
		loop: for (int i = 1; i <= 1010; i++) {
			int k1 = (int) (i * 0.08);
			int k2 = (int) (i * 0.1);

			if (k1 == a && k2 == b) {
				bool = false;
				System.out.println(i);
				break loop;
			}
		}

		if (bool) {
			System.out.println("-1");
		}

		sc.close();
	}
}