import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] c = new int[n - 1];
		int[] s = new int[n - 1];
		int[] f = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			int time = 0;
			for (int j = i; j < n - 1; j++) {
				if (time < s[j]) {
					time = s[j];
				} else {
					// int q = (time - s[j]) / f[j];
					int r = (time - s[j]) % f[j];
					if (r != 0) {
						time += f[j] - r;
					}
				}
				time += c[j];
			}
			System.out.println(time);
		}

		System.out.println(0);
	}

}
