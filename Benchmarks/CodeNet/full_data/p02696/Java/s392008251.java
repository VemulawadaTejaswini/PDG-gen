import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextLong();
		var b = sc.nextLong();
		var n = sc.nextLong();
		sc.close();

		var max = 0L;
		for (var i = 0; i <= Math.min(n, 1000000); i++) {
			var result = (long)Math.floor(a * i / b) - a * (long)Math.floor(i / b);
			max = Math.max(max, result);
		}

		System.out.println(max);
	}
}