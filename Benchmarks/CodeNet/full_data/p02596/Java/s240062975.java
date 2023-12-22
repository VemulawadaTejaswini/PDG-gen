import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var k = sc.nextInt();
		sc.close();

		var count = 1;
		var value = 7;
		while (count <= k) {
			var m = value % k;
			if (m == 0) {
				break;
			}
			value = m * 10 + 7;
			count++;
		}
		System.out.println(count >= k ? -1 : count);
	}
}
