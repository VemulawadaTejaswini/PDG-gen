import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		var list = new Long[n];
		Long waru = 1000000007L;
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextLong() % waru;
		}

		Long count = 0L;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				count += (list[i] * list[j]);
			}
		}
		System.out.println(count % waru);

	}
}