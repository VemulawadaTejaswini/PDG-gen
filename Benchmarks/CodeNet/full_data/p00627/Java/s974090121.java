import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			long N = sc.nextLong();
			if (N == 0) break;
			int ans = 0;
			for (long i = 0; i < N / 4; ++i) {
				ans += sc.nextInt();
			}
			System.out.println(ans);
		}
	}
}