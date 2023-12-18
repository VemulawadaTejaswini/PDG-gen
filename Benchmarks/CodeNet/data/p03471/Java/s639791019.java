import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Y = sc.nextInt();

		int x;
		for (int z = 0; z < N; z++) {
			for (int y = 0; y < N; y++) {
				x = N - y - z;
				if (x >= 0 && 10000 * x + 5000 * y + 1000 * z == Y) {
					System.out.println(x + " " + y + " " + z);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}