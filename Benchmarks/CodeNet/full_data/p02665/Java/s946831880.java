import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = IntStream.range(0, n + 1).map(i -> sc.nextInt()).toArray();
		sc.close();

		var sum = Arrays.stream(a).sum();
		var result = 0L;
		var node1 = 1;
		var node2 = 0;
		for (var i = 0; i <= n; i++) {
			sum -= a[i];
			var max = i == 0 ? 1 : node1 * 2;
			var node1c = Math.min(max - a[i], sum);
			var node2c = a[i];
			//System.out.printf("%d:%d %d\r\n", i, node1c, node2c);
			if ((node1c + node2c) < node1 || node1c < 0 || i < n && node1c == 0) {
				System.out.println(-1);
				return;
			}
			node1 = node1c;
			node2 = node2c;
			result += (node1 + node2);
		}

		System.out.println(result);
	}
}
