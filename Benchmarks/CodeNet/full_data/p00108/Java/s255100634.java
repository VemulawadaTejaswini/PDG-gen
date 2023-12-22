
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;

			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = scanner.nextInt();
			}
			int count = 0;
			while (true) {
				int[] newnum = Arrays.copyOf(num, num.length);
				int[] memo = new int[13];
				for (int i = 0; i < n; i++) {
					memo[num[i]]++;
				}
				for (int i = 0; i < n; i++) {
					num[i] = memo[num[i]];
				}

				if (Arrays.equals(newnum, num)) {
					break;
				}
				count++;
			}
			System.out.println(count);
			for (int i = 0; i < n; i++) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(num[i]);
			}
			System.out.println();

		}
	}
}