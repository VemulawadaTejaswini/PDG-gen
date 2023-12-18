import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				if (a[i] >= b[j]) {
					continue;
				} else {
					for (int k = 0; k < N; k++) {
						if (b[j] >= c[k]) {
							continue;
						} else {
							ans++;
						}
					}
				}
			}
		}

		System.out.println(ans);
	}

}
