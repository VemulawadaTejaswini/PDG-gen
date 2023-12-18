import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int[] n = new int[26];
		int begin = -1;
		int end = -1;
		loop: for (int j = 0; j < c.length - 1; j++) {
			for (int i = j; i < c.length; i++) {
				n[(int) c[i] - 97]++;

				if (check(n)) {
					begin = j + 1;
					end = i + 1;
					break loop;
				}
			}

			for (int i = 0; i < 26; i++) {
				n[i] = 0;
			}
		}

		System.out.println(begin + " " + end);

		sc.close();

	}

	public static boolean check(int[] n) {
		int sum = 0, max = 0;

		for (int i = 0; i < 26; i++) {
			sum += n[i];
			if (max < n[i]) {
				max = n[i];
			}
		}
		if (sum != 1 && (double) max / sum > 0.5) {
			return true;
		}
		return false;
	}
}
