import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var h1 = sc.nextInt();
		var m1 = sc.nextInt();
		var h2 = sc.nextInt();
		var m2 = sc.nextInt();
		var k = sc.nextInt();
		sc.close();

		var result = Math.max((h2 - h1) * 60 + (m2 -m1) - k, 0);
		System.out.println(result);
	}
}
