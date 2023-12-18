import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		long tmp = Math.min(a, k);
		a = Math.abs(a - tmp);
		k = Math.abs(k - tmp);
		tmp = Math.min(b, k);
		b = Math.abs(b - tmp);
		k = Math.abs(k - tmp);
		System.out.println(a + " " + b);
	}
}
