import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		long[] t = new long[N + 1];
		long time = 0;

		for (int i = 0; i < N; i++) {
			t[i] = Long.valueOf(sc.next());
			if (t[i] > time) {
				time = t[i];
			}
		}

		for (int i = 0; i < N; i++) {
			while (time % t[i] != 0) {
				time += time;
			}
		}

		System.out.println(time);

		sc.close();
	}
}