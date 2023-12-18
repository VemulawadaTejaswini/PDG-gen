import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		System.out.println(solve(n, s));
	}

	private static int solve(int n, String s) {
		int min = n;
		int cnt = 0;

		for (int i = 0; i < n; i++) {

			if (i == 0) {
				for (int j = 0; j < n; j++)
					if (s.charAt(j) == 'E')
						cnt++;
			}

			else {
				if (s.charAt(i-1) == 'W')
					cnt++;
				if (s.charAt(i) == 'E')
					cnt--;
			}

			if (min > cnt) min = cnt;
		}
		return min;
	}
}