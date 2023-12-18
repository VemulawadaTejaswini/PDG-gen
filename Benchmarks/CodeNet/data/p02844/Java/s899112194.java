
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		char[] s = in.next().toCharArray();
		int count = s.length;
		int num = 0;
		int[] dp = new int[30001];
		long ans = 0;
		for (int i = 0; i < count - 2; i++) {
			for (int j = i + 1; j < count - 1; j++) {
				for (int k = j + 1; k < count; k++) {
					num++;
					Integer a = ((s[i] - '0') * 100) + ((s[j] - '0') * 10) + (s[k] - '0');
					if (dp[a] == 0) {
						ans++;
						dp[a]++;
					} else {
						continue;
					}
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}