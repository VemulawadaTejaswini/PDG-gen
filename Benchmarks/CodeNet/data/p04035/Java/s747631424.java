import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int[] a = new int[N + 1];
		int max = 0;
		int max_i = 0;
		for (int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
			if (i >= 2) {
				if (a[i - 1] + a[i] > max) {
					max = a[i - 1] + a[i];
					max_i = i - 1;
				}
			}
		}

		if (max < L) {
			System.out.println("Impossible");
		} else {
			System.out.println("Possible");
			StringBuffer buf = new StringBuffer();
			for (int i = 1; i < max_i; i++) {
				buf.append(i + "¥n");
			}
			for (int i = N - 1; i >= max_i; i--) {
				buf.append(i + "¥n");
			}
			System.out.println(buf.toString());
		}
	}
}
