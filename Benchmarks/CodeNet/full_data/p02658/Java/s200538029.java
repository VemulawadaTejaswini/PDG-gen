import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long ans = sc.nextLong();
		boolean over = false;

		for(int i = 1; i < n; i++) {

			ans *= sc.nextLong();

			if (ans < 0L) {
				over = true;
			}
		}

		if(ans > 1000000000000000000L) {
			ans = -1L;
		}

		if (over && ans != 0) {
			ans = -1L;
		}

		System.out.println(ans);

		sc.close();
	}

}