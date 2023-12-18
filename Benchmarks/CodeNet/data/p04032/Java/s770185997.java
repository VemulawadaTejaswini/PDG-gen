import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	private static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		String str = new String(s);

		for (int i = 0; i < s.length - 2; i++) {
			for (int j = i + 2; j < s.length; j++) {
				int[] counter = new int['z' - 'a'];
				for (int k = i; k < j; k++) {
					counter[s[k] - 'a']++;
				}

				int half = (j - i) / 2;
				if (IntStream.of(counter).anyMatch(c -> c > half)) {
					System.out.println((i + 1) + " " + j);
					return;
				}
			}
		}
		System.out.println("-1 -1");
	}
}
