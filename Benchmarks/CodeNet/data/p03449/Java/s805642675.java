import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int suma = 0, sumb = 0;
		int ans = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			suma += a[i];
		}
		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
			sumb += b[i];
		}

		ans += a[0];
		suma -= a[0];
		suma += b[N-1];
		
		for (int i = 1; i < N; i++) {
			if (suma >= sumb) {
				ans += a[i];
				suma -= a[i];
				sumb -= b[i - 1];
			} else {
				for (int j = i - 1; j < N -1; j++) {
					ans += b[j];
				}
				break;
			}
		}
		ans += b[N-1];

		System.out.println(ans);

		sc.close();
	}
}
