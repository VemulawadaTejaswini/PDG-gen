
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] result = new int[n];

			for (int i = 0; i < n; i++) {
				result[sc.nextInt() - 1] = i;
			}
			StringBuilder sb = new StringBuilder();
			for (int i : result) {
				if (0 < sb.length()) {
					sb.append(" ");
				}
				sb.append(i + 1);
			}
			System.out.println(sb);
		}
	}
}
