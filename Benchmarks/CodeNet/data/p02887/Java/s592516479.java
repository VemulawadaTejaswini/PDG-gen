import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String[] input = str.split("");
		String result = "";

		for (int i = 0; i < n; i++) {
			if (result.isEmpty()) {
				result += input[i];
				continue;
			}

			if (input[i].equals(input[i-1])) {
				continue;
			}
			result += input[i];
		}

		System.out.println(result.length());
	}
}