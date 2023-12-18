import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] s = new int[N][26];
		for (int i = 0; i < s.length; i++) {
			char[] tmp = sc.next().toCharArray();
			for (int j = 0; j < tmp.length; j++) {
				s[i][tmp[j] - 'a']++;
			}
		}
		int ans = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (Arrays.equals(s[i], s[j]))
					ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}