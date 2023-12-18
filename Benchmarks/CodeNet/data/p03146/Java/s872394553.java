import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int s = Integer.parseInt(str[0]);

		HashSet<Integer> set = new HashSet<>();
		set.add(s);

		for (int i = 1;; i++) {
			int n = calc(s);
			if (set.contains(n)) {
				System.out.println(i + 1);
				break;
			} else {
				set.add(n);
				s = n;
			}
		}
	}

	static int calc(int a) {
		if (a % 2 == 0) {
			return a / 2;
		} else {
			return 3 * a + 1;
		}
	}
}