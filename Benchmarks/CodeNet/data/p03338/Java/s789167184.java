import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			int N = Integer.parseInt(in.nextLine());
			String S = in.nextLine();

			int max = -1;
			for (int i = 1; i < N; i++) {
				String x = S.substring(0, i);
				String y = S.substring(i, N);

				int count = 0;
				HashSet<String> used = new HashSet<>();
				for (int j = 0; j < x.length(); j++) {
					String s = "" + x.charAt(j);
					if (!used.add(s)) {
						continue;
					}
					if (y.contains(s)) {
						count++;
					}
				}

				max = Math.max(max, count);

			}

			System.out.println(max);
		}
	}
}
