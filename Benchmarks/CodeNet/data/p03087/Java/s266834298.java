import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();

		int[] t = new int[n + 1];
		for (int i = 0; i < n - 1; i++) {
			// 2文字切り出して"AC"なら+1
			t[i + 1] = t[i] + (s.substring(i, i + 2).equals("AC") ? 1 : 0);
		}
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			l--;
			r--;
			int ans = t[r] - t[l];
			System.out.println(ans);
		}

		sc.close();
	}
}
