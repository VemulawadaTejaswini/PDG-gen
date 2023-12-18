import java.util.Scanner;

public class Main {
	public static long L(long x, long y) {
		long a, b, r, g;
		if (x < y) {
			a = y;
			b = x;
		} else {
			a = x;
			b = y;
		}
		while (true) {
			r = a - a / b * b;
			if (r == 0) {
				g = b;
				break;
			}
			a = b;
			b = r;
		}
		return x * y / g;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		long time[] = new long[100];
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			time[i] = sc.nextLong();
		}
		long tmp;
		tmp = L(time[0], time[1]);
		for (int i = 2; i < N; i++) {
			tmp = L(tmp, time[i]);
		}
		System.out.println(tmp);
	}
}
