import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextLong();
		var b = sc.nextLong();
		var n = sc.nextLong();
		sc.close();

		var x = Math.min(n, b - 1);
		var value = (long) Math.floor(a * x / b) - a * (long) Math.floor(x / b);
		System.out.println(value);
	}
}