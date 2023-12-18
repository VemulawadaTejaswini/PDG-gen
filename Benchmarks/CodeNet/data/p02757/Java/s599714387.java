import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), p = scanner.nextInt();
			char[] s = scanner.next().toCharArray();
			// 文字列を数字に変換
			int[] s2 = new int[n];
			IntStream.range(0, n).forEach(i -> s2[i] = s[i] - '0');
			int[][] result = new int[2][n + 1];
			Arrays.fill(result[0], 0);
			long count = 0L;
			int now = 1, prev = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = i; j <= n; j++) {
					result[now][j] = (result[prev][j - 1] * 10 + s2[j - 1]) % p;
					if (0 == result[now][j]) {
						count++;
					}
				}
				now = 1 - now;
				prev = 1 - prev;
			}
			System.out.println(count);
		}
	}
}
