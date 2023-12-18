import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();
		int K = scanner.nextInt();

		System.out.println(genSubstring(s).toArray()[K-1]);
	}

	public static TreeSet<String> genSubstring(String s) {
		TreeSet<String> set = new TreeSet<>();
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j<=Math.min(n, i+6); j++) {
				set.add(s.substring(i, j));
			}
		}
		return set;
	}
}