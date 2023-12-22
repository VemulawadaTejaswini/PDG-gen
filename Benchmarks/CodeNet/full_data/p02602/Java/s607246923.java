import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		var a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		for (var i = 0; i < n - k; i++) {
			System.out.println(a[i] < a[i + k] ? "Yes" : "No");
		}
	}
}
