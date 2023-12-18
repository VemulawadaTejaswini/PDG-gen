import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long[] a = new long[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < 3; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(a[0] * a[1]);
	}
}
