import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		int cnt[] = new int[26];
		Arrays.fill(cnt, 1);
		for(int i = 0; i < N; i++) {
			cnt[S.charAt(i) - 97]++;
		}
		int ans = 1;
		for(int i = 0; i < 26; i++) {
			ans *= cnt[i] % 1000000007;
		}
		System.out.println(ans - 1);
	}
}
