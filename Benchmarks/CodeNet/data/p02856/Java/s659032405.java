import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		long sum = 0;
		long digit = 0;
		for (int i = 1; i <= m; i++) {
			int d = sc.nextInt();
			long c = sc.nextLong();
			sum = sum + d * c;
			digit = digit + c;
		}
		long ans = sum / 9 + digit - 1;
		System.out.println(ans);
	}
}