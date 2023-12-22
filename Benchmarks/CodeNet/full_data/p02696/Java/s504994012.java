import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a, b, n, x = 0;
		long max = 0;
		a = sc.nextLong();
		b = sc.nextLong();
		n = sc.nextLong();
		while (x <= n) {
			max = Math.max(max, Math.floorDiv(x * a, b) - a * Math.floorDiv(x, b));
			x++;
		}
		System.out.println(max);
	}
}