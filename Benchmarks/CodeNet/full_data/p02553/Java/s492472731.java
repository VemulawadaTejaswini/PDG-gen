import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long max_a = Math.max(a*c, a*d);
		long max_b = Math.max(b*c,b*d);
		long max = Math.max(max_a, max_b);
		System.out.println(max);
	}
}