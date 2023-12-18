import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		
		long ans = 0;
		for (int i = 0; i < 1 << (N - 1); i++) {
			int last = 0;
			for (int j = 0; j < N - 1; j++) {
				if ((1 & i >> j) == 1) {
					ans += Long.parseLong(S.substring(last, j + 1));
					last = j + 1;	
				}
			}
			ans += Long.parseLong(S.substring(last, N));
		}
		System.out.println(ans);
	}
}
