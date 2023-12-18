import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());
		long min = Integer.MAX_VALUE;

		for (int i = l; i < r; i++) {
			for (int j = i + 1; j <= r; j++) {
				if ((i % 2019 * j % 2019) < min) {
					min = (i % 2019 * j % 2019);
				}
			}
		}

		System.out.println(min);
	}
}