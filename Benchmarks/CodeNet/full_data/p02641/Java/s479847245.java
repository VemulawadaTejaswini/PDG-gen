import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int x = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);

		if (n == 0) {
			System.out.println(x);
			return;
		}

		Set<Integer> p = new HashSet<>();

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			p.add(Integer.parseInt(str[i]));
		}

		if (!p.contains(x)) {
			System.out.println(x);
			return;
		}

		for (int i = 1; i <= 200; i++) {
			int left = Math.abs(x - i);
			int right = Math.abs(x + i);

			if (!p.contains(left) && p.contains(right)) {
				System.out.println(left);
				return;
			} else if (p.contains(left) && !p.contains(right)) {
				System.out.println(right);
				return;
			} else if (!p.contains(left) && !p.contains(right)) {
				System.out.println(left);
				return;
			}
		}
	}
}
