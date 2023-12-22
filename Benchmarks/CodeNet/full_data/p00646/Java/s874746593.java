import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			long L = sc.nextLong();
			if (L == 0) break;
			long ans = 1;
			for (long i = 2; i * i <= L; ++i) {
				if (L % i != 0) continue;
				int c = 1;
				L /= i;
				while (L % i == 0) {
					L /= i;
					++c;
				}
				ans *= c * 2 + 1;
			}
			if (L != 1) {
				ans *= 3;
			}
			System.out.println((ans - 1) / 2 + 1);
		}
	}
}