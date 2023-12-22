import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		var list = new Long[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextLong();
		}

		Long count = 0L;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				count += (list[i] % 1000000007L * list[j] % 1000000007L) % 1000000007L;
			}
		}
		System.out.println(count % 1000000007L);

	}
}