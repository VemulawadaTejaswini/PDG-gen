import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		int b[] = new int[N];
		Arrays.fill(b, 1);
		b[0] = -1;
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt() - 1;
			int t = sc.nextInt() - 1;
			if (b[t] < 0)
				b[t] = -1 * (Math.abs(b[t]) + 1);
			else
				b[t] = (int) Math.signum(b[s]) * (Math.abs(b[t]) + 1);
			b[s] = (int) Math.signum(b[s]) * (Math.abs(b[s]) - 1);

		}
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] < 0)
				count++;
		}
		System.out.println(count);

	}
}
