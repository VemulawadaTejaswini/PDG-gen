import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		int ans = 1;
		long n = X;
		for (int i = 0; i < 1000; i++) {
			n *= 2;
			if (n <= Y) {
				ans++;
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}
