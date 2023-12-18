import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		sc.close();
		String ans[] = { "Yes", "No" };
		int an = 0;
		int n = t.length();
		int change[] = new int[27];
		int change2[] = new int[27];
		for (int i = 0; i < 27; ++i) {
			change[i] = -1;
			change2[i] = -1;
		}
		for (int i = 0; i < n; ++i) {
			int tmpt = t.charAt(i) - 'a';
			int tmps = s.charAt(i) - 'a';
			if (change[tmps] < 0) {
				change[tmps] = tmpt;
			} else {
				if (change[tmps] != tmpt) {
					an = 1;
					break;
				}
			}
			if (change2[tmpt] < 0) {
				change2[tmpt] = tmps;
			} else {
				if (change2[tmpt] != tmps) {
					an = 1;
					break;
				}
			}
		}
		System.out.println(ans[an]);
	}
}
