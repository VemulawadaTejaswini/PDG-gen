import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean bool = true;
		int t1 = 0;
		int t2 = 0;
		loop: for (int i = 13; i <= 2000; i++) {
			int k1 = (int) (i * 0.08);
			int k11 = (int) (i * 0.1);
			if (a == k1 && b == k11) {
				bool = false;
				System.out.println(i);
				break loop;
			}
			int k2 = (int) (i * 0.09);

			if (t1 == k1 && t2 == k2) {
				continue;
			}

			t1 = k1;
			t2 = k2;

			for (int j = k1; j < k2; j++) {

				if (j == a && k11 == b) {
					bool = false;
					System.out.println(i);
					break loop;
				}
			}

		}
		if (bool) {
			System.out.println("-1");
		}

		sc.close();
	}
}