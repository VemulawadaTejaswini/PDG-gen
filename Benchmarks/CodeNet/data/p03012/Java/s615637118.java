import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] w = new int[n];
		int total = 0;
		int zenhan = 0;
		int kouhan = 0;
		int sabun;

		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			total += w[i];
		}
		sabun = Math.abs(total - w[0] * 2);

		for (int i = 0; i < n; i++) {
			zenhan += w[i];
			kouhan = total - zenhan;

			if (Math.abs(zenhan - kouhan) <= sabun) {
				sabun = Math.abs(zenhan - kouhan);
			} else {
				break;
			}
		}
		System.out.println(sabun);
	}
}