import java.util.Scanner;

public class Main {
	static Scanner sc;
	static char[] ans;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int n = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		sb.append("? ");
		for (int i = 1; i <= n; i++) {
			sb.append(i).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		String s0 = sc.next();
		if (s0.equals("-1")) return;

		int l = 1;
		int r = n + 1;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			sb = new StringBuilder();
			sb.append("? ");
			for (int i = mid; i < mid + n; i++) {
				sb.append(i).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
			String s = sc.next();
			if (s.equals("-1")) return;
			if (s.equals(s0)) {
				l = mid;
			} else {
				r = mid;
			}
		}

		int n2 = n * 2;
		ans = new char[n2 + 1];
		if (s0.equals("Red")) {
			ans[l] = 'R';
			ans[l + n] = 'B';
		} else {
			ans[l] = 'B';
			ans[l + n] = 'R';
		}

		StringBuilder sb1 = new StringBuilder();
		sb1.append("? ");
		for (int i = l + 1; i < l + n; i++) {
			sb1.append(i).append(' ');
		}
		String s1 = sb1.toString();
		for (int i = 1; i < l; i++) {
			exec(s1, i);
		}
		for (int i = l + n + 1; i <= n2; i++) {
			exec(s1, i);
		}

		StringBuilder sb2 = new StringBuilder();
		sb2.append("? ");
		for (int i = 1; i < l; i++) {
			sb2.append(i).append(' ');
		}
		for (int i = l + n + 1; i <= n2; i++) {
			sb2.append(i).append(' ');
		}
		String s2 = sb2.toString();
		for (int i = l + 1; i < l + n; i++) {
			exec(s2, i);
		}
		sc.close();

		StringBuilder sba = new StringBuilder();
		sba.append("! ");
		for (int i = 1; i <= n2; i++) {
			sba.append(ans[i]);
		}
		System.out.println(sba.toString());
	}

	static void exec(String s1, int i) {
		System.out.println(s1 + i);
		String s = sc.next();
		if (s.equals("-1")) return;
		ans[i] = s.charAt(0);
	}
}
