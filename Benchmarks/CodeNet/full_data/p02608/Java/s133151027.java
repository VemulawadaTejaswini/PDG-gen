import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(count(i));
		}
	}

	public static int count(int n) {
		double M = Math.pow(n, 0.5);
		int c = 0;
		for (int x = 1; x <= M; x++) {
			for (int y = (int) Math.min(x, M); y <= M; y++) {
				for (int z = (int) Math.min(y, M); z <= M; z++) {
					if (x * x + y * y + z * z + x * y + y * z + z * x == n) {
						if (x == y && y == z) {
							c += 1;
						} else if (x == y || y == z) {
							c += 3;
						} else {
							c += 6;
						}
					}
				}
			}
		}
		return c;
	}

}
