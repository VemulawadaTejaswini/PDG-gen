
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long x = n / k;
		long ans = x * x * x;
		if (k % 2 == 0) {
			long y = (n + k / 2) / k;
			ans += y * y * y;
		}
		System.out.println(ans);
	}

}
