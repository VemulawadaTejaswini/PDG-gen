import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int r = scanner.nextInt();
		int s = scanner.nextInt();
		int p = scanner.nextInt();
		String t = scanner.next();
		scanner.close();
		int score = 0;
		boolean[] win = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (i >= k && win[i - k] && t.charAt(i) == t.charAt(i - k))
				continue;
			else {
				win[i] = true;
			}
			switch (t.charAt(i)) {
			case 'r':
				score += p;
				break;
			case 's':
				score += r;
				break;
			case 'p':
				score += s;
				break;
			}

		}
		System.out.println(score);
	}

}
