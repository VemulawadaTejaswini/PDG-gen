import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var k = sc.nextInt();
		var a = sc.nextInt();
		var b = sc.nextInt();
		sc.close();

		boolean result = false;
		for (int i = a; i <= b; i++) {
			if (i % k == 0) {
				result = true;
			}
		}

		System.out.println(result ? "OK" : "NG");
	}
}