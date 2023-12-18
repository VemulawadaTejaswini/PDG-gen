import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();

		int l[] = new int[Q];
		int r[] = new int[Q];

		for (int i = 0; i < Q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		int ans[] = new int[Q];
				for (int i = 0; i < Q; i++) {
			int cnt = 0;
			String s = S.substring(l[i]-1, r[i]);
			if (!s.contains("A") || !s.contains("C")) {
				ans[i] = 0;
				break;
			}
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == 'A' && j != s.length()-1) {
					if (s.charAt(j+1) =='C') {
						cnt++;
					}
					j++;
				}
			}
			ans[i] = cnt;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
