import java.util.Scanner;

public class Main {
	static long b = 1;
	static long tmpb = 1;
	static long m = 0;
	static long N;
	static long A;
	static long B;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextLong();
		A = sc.nextLong();
		B = sc.nextLong();
		if (B - A <= 1)  {
			b += N;
			System.out.println(b);
			return;
		}

		for (long i = 0; i < N; i++) {
			if (m >= 1) {
				trademon();
				continue;
			}
			if (tmpb < A) {
				breakbis();
				continue;
			}

			if (tmpb >= A) {
				tradebis();
				continue;
			}
		}
		System.out.println(b);
	}

	public static void breakbis() {
		b ++;
		tmpb++;
	}

	public static void tradebis() {
		b -=A;
		tmpb = 0;
		m ++;
	}
	public static void trademon() {
		m --;
		b += B;
		tmpb+=B;
	}
}
