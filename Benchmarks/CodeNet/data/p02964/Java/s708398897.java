import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int N = Integer.parseInt(line[0]);
		long K = Long.parseLong(line[1]);
		String A = sc.nextLine().replace(" ", "");

		String X = "";
		for (long i = 0; i < K; i++) {
			X = X + A;

			char s = X.charAt(0);
			String subX = X.substring(1);
			int idx = subX.indexOf(s);
			while (idx > -1 && idx + 2 < X.length()) {
				X = X.substring(idx + 2, X.length());
				if (X.length() > 0) {
					s = X.charAt(0);
					subX = X.substring(1);
					idx = subX.indexOf(s);
				}
			}
		}

		List<Integer> s = new ArrayList<Integer>();
		for (int n = 0; n < X.length(); n++) {
			int x = Integer.parseInt(X.substring(n, n + 1));

			if (s.contains(x)) {
				while (s.contains(x) && !s.isEmpty()) {
					s.remove(s.size() - 1);
				}
			} else {
				s.add(x);
			}
		}
		int i = 0;
		for (; i < s.size() - 1; i++) {
			System.out.print(s.get(i) + " ");
		}
		System.out.print(s.get(i));
	}

}