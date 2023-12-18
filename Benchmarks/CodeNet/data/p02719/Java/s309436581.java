import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();

		long a = n % k;
		long ans = Math.min(a, k -a);

		System.out.println(ans);

	}

}
