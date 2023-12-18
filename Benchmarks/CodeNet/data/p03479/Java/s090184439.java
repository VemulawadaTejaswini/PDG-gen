import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();

		long a = x;
		int ans = 1;
		while (true) {
			a *= 2;
			if (a <= y) {
				ans++;
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}
