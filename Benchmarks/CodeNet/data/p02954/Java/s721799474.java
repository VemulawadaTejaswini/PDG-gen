import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		int r = 0, l;
		int[] a = new int[s.length];
		for (int i = 0; i < s.length - 1; i++) {
			if (s[i] == 'R' && s[i + 1] == 'L') {
				a[i]++;
				a[i + 1]++;

				for (int j = r; j < i; j++) {
					if ((i - j) % 2 == 0) {
						a[i]++;
					} else {
						a[i + 1]++;
					}
				}

				for (int j = i + 2; j < s.length; j++) {
					if (s[j] == 'L') {
						if ((j - i) % 2 == 0) {
							a[i]++;
						} else {
							a[i + 1]++;
						}
					} else {
						i = j - 1;
						r = i + 1;
						break;
					}
				}
			}
		}
		sb.append(a[0]);
		for (int i = 1; i < s.length; i++) {
			sb.append(" " + a[i]);
		}
		System.out.println(sb);
	}
}