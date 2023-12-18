import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			long digit = in.nextLong();
			if (digit % 2 == 0) {
				while (digit % 2 == 0) {
					digit /= 2;
					ans++;
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}