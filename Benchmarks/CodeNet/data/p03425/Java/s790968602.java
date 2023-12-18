import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<String> marchSet = new HashSet<>();
		int march[] = new int[5];

		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			marchSet.add(s);
		}

		for (String s : marchSet) {
			if (s.charAt(0) == 'M')
				march[0]++;
			else if (s.charAt(0) == 'A')
				march[1]++;
			else if (s.charAt(0) == 'R')
				march[2]++;
			else if (s.charAt(0) == 'C')
				march[3]++;
			else if (s.charAt(0) == 'H')
				march[4]++;
		}

		long cnt = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				for (int k = j + 1; k < 5; k++) {
					cnt += (long) (march[i] * march[j] * march[k]);
				}
			}
		}

		System.out.println(cnt);

	}
}
