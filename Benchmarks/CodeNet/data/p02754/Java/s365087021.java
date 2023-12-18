import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		long sum = a * (n / (a + b));
		sum += a < n%(a+b) ? a : n%(a+b);

		System.out.println(sum);
	}
}