import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong()
				, k = scan.nextLong();

		long ans = 0;
		long startIndex = n - k;
		for (long i = 0; i < n; i++) {
			long input = scan.nextInt();
			if (i < startIndex) {
				continue;
			}
			ans = input / 2;
		}

		scan.close();

		System.out.println(ans);
	}

}
