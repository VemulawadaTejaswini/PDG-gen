import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		var q = sc.nextInt();
		var a = IntStream.range(0, q).map(i -> sc.nextInt()).toArray();
		sc.close();

		var c = new int[n];
		for (var i = 0; i < q; i++) {
			c[a[i] - 1]++;
		}

		for (var i = 0; i < n; i++) {
			System.out.println(k - q + c[i] > 0 ? "Yes" : "No");
		}
	}
}
