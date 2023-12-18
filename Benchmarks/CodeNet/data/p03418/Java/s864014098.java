import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		for (int b = k + 1; b <= n; b++) {
			for (int i = 1; i <= n; i++) {
				if ((i % b >= k)) {
					count++;
				}
			}
		}
		System.out.println(count);

		sc.close();

	}

}
