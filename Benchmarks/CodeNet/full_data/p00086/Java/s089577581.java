
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			int[] map = new int[101];
			while (true) {
				int n = scanner.nextInt();
				int s = scanner.nextInt();
				if (n == 0 && s == 0) {
					break;
				}
				map[n]++;
				map[s]++;
			}
			int count = 0;
			for (int i = 0; i < 101; i++) {
				if (map[i] % 2 == 1) {
					count++;
				}

			}
			if (count != 2) {
				System.out.println("NG");
			} else if (map[1] % 2 == 1 && map[2] % 2 == 1) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
}