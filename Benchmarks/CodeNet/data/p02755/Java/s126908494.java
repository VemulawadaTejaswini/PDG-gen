import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean bool = true;
		loop: for (int i = 13; i <= 1000; i++) {
			int k1 = (int) (i * 0.08);
			int k11 = (int) (i * 0.1);
			int k2 = (int) (i * 0.09);
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
