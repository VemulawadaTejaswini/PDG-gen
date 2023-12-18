import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);


		int n = scan.nextInt();
		int m = scan.nextInt();
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % j >= m) {
					ans++;
				}
			}
		}

		System.out.println(ans);


	}


}