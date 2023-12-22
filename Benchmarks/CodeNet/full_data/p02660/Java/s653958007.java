import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		int count = 0;
		for (int z = 2; z <= n; z++) {
			if (n % z != 0)
				continue;

			count++;
			n /= z;
		}
		System.out.println(count);
	}
}
