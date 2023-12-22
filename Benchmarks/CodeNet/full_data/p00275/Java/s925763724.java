
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] player = new int[n];
			int i = 0;
			int ba = 0;
			char[] c = scanner.next().toCharArray();
			int count = 0;
			while (count != 100) {
				if (c[count] == 'M') {
					player[i]++;
				} else if (c[count] == 'S') {
					ba += player[i] + 1;
					player[i] = 0;
				} else {
					player[i] += ba + 1;
					ba = 0;
				}
				count++;
				i = (i + 1) % n;
			}
			Arrays.sort(player);
			for (int j = 0; j < n; j++)
				System.out.print(player[j] + " ");
			System.out.println(ba);
		}
	}
}