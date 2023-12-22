import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; ++i) {
			int count = 1;
			int y = s.nextInt(), m = s.nextInt(), d = s.nextInt();
			count += ((y % 3 < 1 || m % 2 > 0) ? 20 : 19) - d;

			count += 20 * ((10 - m) / 2);
			count += (y % 3 < 1 ? 20 : 19) * ((10 - m + 1)/ 2);

			for (++y; y < 1000; ++y) {
				count += (y % 3 < 1) ? 200 : 195;
			}
			System.out.println(count);
		}
	}
}