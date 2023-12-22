import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var l = sc.nextInt();
		var r = sc.nextInt();
		var d = sc.nextInt();
		sc.close();

		var count = 0;
		for (var i = l; i <= r; i++) {
			if (i % d == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
