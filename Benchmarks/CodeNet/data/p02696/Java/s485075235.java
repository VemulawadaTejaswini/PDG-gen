import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextLong();
		var b = sc.nextLong();
		var n = sc.nextLong();
		sc.close();

		var max = 0L;
		if (b <= 1000000) {
			for (var i = Math.max(0, n - 1000000); i <= n; i++) {
				var result = (long) Math.floor(a * i / b) - a * (long) Math.floor(i / b);
				max = Math.max(max, result);
			}
		} else {
			for (var i = Math.min(b - 1, n); i <= n; i += b) {
				var result = (long) Math.floor(a * i / b) - a * (long) Math.floor(i / b);
				max = Math.max(max, result);
			}
		}
		System.out.println(max);
	}
}