import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ary[] = new int[3];
		int A = Integer.parseInt(S.substring(0, 1));
		ary[0] = Integer.parseInt(S.substring(1, 2));
		ary[1] = Integer.parseInt(S.substring(2, 3));
		ary[2] = Integer.parseInt(S.substring(3, 4));
		for (int i = 0; i < (Math.pow(2, 3)); i++) {
			int ans = A;
			StringBuilder sb = new StringBuilder(S);
			for (int j = 0; j < 3; j++) {
				if ((1&i>>j) == 1) {
					ans += ary[j];
					sb.insert(2 * j + 1, "+");
				} else {
					ans -= ary[j];
					sb.insert(2 * j + 1, "-");
				}
			}
			if(ans == 7) {
				System.out.println(sb.append("=7"));
				return;
			}
		}
	}
}
