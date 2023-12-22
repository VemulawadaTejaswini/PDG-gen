import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long ans = sc.nextLong();

		for(int i = 1; i < n; i++) {
			ans *= sc.nextLong();
		}

		if(ans > 1000000000000000000L) {
			ans = -1L;
		}

		if (ans < 0) {
			ans = -1L;
		}

		System.out.println(ans);

		sc.close();
	}

}