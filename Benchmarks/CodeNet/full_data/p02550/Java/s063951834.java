import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int x = sc.nextInt();
		int m = sc.nextInt();

		int a = x;
		long sum = a;
		for (long i = 1; i < n; i++) {
			a = (a * a) % m;
			sum += a;
			System.out.println(i);
		}

		System.out.println(sum);

	}

}
