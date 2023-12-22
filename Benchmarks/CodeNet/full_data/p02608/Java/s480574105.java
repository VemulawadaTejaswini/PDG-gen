import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] res = new int[N + 1];
		for (int x = 1; x <= N; x++) {
			if (x * x > N) {
				break;
			}
			for (int y = 1; y <= x; y++) {
				if (x * x + y * y + x * y > N) {
					break;
				}
				for (int z = 1; z <= y; z++) {
					int tmpRes = x * x + y * y + z * z + x * y + y * z + z * x;
					if (tmpRes > N) {
						break;
					}
					if (tmpRes < N + 1) {
						if (x != y && y != z && z != x) {
							res[tmpRes] += 6;
						} else if (x == y && y == z && z == x) {
							res[tmpRes] += 1;
						} else {
							res[tmpRes] += 3;
						}
					}
				}
			}
		}
		for (int i = 1; i < res.length; i++) {
			System.out.println(res[i]);

		}
	}
}