import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean bool = true;
		for (int i = 1; i <= 1000; i++) {
			Double d1 = i / 0.08;
			Double d2 = i / 0.1;

			int i1 = d1.intValue();
			int i2 = d2.intValue();

			int k1 = i1 / a;
			int k2 = i1 / b;

			int k3 = i2 / a;
			int k4 = i2 / b;

			if (k1 == k2) {
				System.out.println(i1);
				bool = false;
				break;
			} else if (k3 == k4) {
				System.out.println(i2);
				bool = false;
				break;
			}
		}
		if (bool) {
			System.out.println("-1");
		}
		sc.close();
	}
}