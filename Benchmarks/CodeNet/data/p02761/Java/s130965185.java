import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		int s[] = new int[M];
		int c[] = new int[M];
		int a[] = new int[N];
		if (N != 1) {
			a[0] = 1;
		} else {
			a[0] = 0;
		}
		for (int i = 1; i < N; i++) {
			a[i] = 0;
		}

		for (int i = 0; i < M; i++) {
			s[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();
			if (N != 1) {
				if ((a[0] == 1 && s[i] == 0) || a[s[i]] == 0 || a[s[i]] == c[i]) {
					if (s[i] != 0 || c[i] != 0) {
						a[s[i]] = c[i];
					} else {
						System.out.println(-1);
						sc.close();
						return;
					}
				} else {
					System.out.println(-1);
					sc.close();
					return;
				}
			} else if (N == 1) {
				if (a[0] == 0 || a[0] == c[i]) {
					a[0] = c[i];
				} else {
					System.out.println(-1);
					sc.close();
					return;
				}
			}
		}
		sc.close();
		for (int i = 0; i < N; i++) {
			System.out.print(a[i]);
		}
	}
}
