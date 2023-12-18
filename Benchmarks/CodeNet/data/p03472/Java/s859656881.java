import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long h = sc.nextLong();

		long[][] a = new long[n][2];
		long[][] b = new long[n][2];
		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextLong();
			a[i][1] = i;
			b[i][0] = sc.nextLong();
			b[i][1] = i;
		}
		Arrays.sort(a, (x, y) -> Long.compare(y[0], x[0]));
		Arrays.sort(b, (x, y) -> Long.compare(y[0], x[0]));

		long answer = 0;
		int bi = 0;

		while (h > 0 && b[bi][0] > a[0][0] && a[0][1] != b[bi][1]) {
			h -= b[bi++][0];
			answer++;
		}

		if (a[0][1] == b[bi][1] && a[0][0] < b[bi][0]) {
			h -= b[bi][0];
			answer++;
		}
		answer += h / a[0][0];
		answer += (h % a[0][0] > 0) ? 1 : 0;

		System.out.println(answer);
	}
}
