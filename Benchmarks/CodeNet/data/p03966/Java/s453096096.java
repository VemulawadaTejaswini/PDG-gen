import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long t = scanner.nextInt();
		long a = scanner.nextInt();
		for (int i = 0; i < N - 1; i++) {
			// t[i] = scanner.nextInt();
			// a[i] = scanner.nextInt();
			long q = scanner.nextInt();
			long w = scanner.nextInt();
			if (t <= q && a <= w) {
				t = q;
				a = w;
				continue;
			}
			long j = Math.max((long) Math.ceil((double) t / (double) q), (long) Math.ceil((double) a / (double) w));
			long e = q * j;
			long r = w * j;
			// while(!(t <= e && a <= r)){
			// j++;
			// e = q*j;
			// r= w*j;
			// }
			t = e;
			a = r;
		}
		long ans = a+t;
		System.out.println(ans);

	}
}