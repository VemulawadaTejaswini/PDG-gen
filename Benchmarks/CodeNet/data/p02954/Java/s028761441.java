import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int[] a = new int[s.length()];

		int current = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				current++;
			} else if (current > 0) {
				a[i] += current / 2;
				a[i - 1] += (current - 1) / 2 + 1;
				current = 0;
			}
		}

		current = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == 'L') {
				current++;
			} else if (current > 0) {
				a[i] += current / 2;
				a[i + 1] += (current - 1) / 2 + 1;
				current = 0;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
