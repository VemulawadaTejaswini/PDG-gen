
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int s = scanner.nextInt();
			if (n == 0 & s == 0) {
				break;
			}
			boolean[] map = new boolean[n];
			Arrays.fill(map, true);
			int t = 1;
			int a = 0;
			for (int i = 0; i < n; i++) {
				while (true) {
					if (map[a]) {
						t++;
						a = (a + 1) % n;
					} else {
						a = (a + 1) % n;
					}
					if (t == s & map[a]) {
						t = 1;
						map[a] = false;
						break;
					}
				}
			}
			System.out.println(a + 1);
		}

	}
}