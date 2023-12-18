import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean bool = true;

		loop: for (int i = 13; i < 1000; i++) {
			int k1 = (int) (i * 0.08);
			int k2 = (int) (i * 0.09);
			for (int j = k1; k1 < k2; j++) {

				int kk1 = (int) (j * 0.08);
				int kk2 = (int) (j * 0.1);
				if (kk1 == a && kk2 == b) {
					bool = false;
					System.out.println(j);
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