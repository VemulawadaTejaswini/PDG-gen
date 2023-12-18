
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[][] num = new int[n][26];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 26; j++) {
				num[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
			for(int j = 0; j < s[i].length(); j++) {
				num[i][s[i].charAt(j) - 'a']++;
			}
		}
		for(int i = 0; i < n; i++) {
			s[i] = "";
			for(int j = 0; j < 26; j++) {
				char tmp = (char) ('a' + j);
				for(int k = 0; k < num[i][j]; k++) {
					s[i] += tmp;
				}
			}
		}
		boolean[] flag = new boolean[n];
		for(int i = 0; i < n; i++) {
			flag[i] = true;
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			if(flag[i]) {
				int tmp = 1;
				for(int j = i + 1; j < n; j++) {
					if(flag[j] && (s[i].equals(s[j]))) {
						flag[j] = false;
						tmp++;
					}
				}
				if(tmp > 1) {
					ans += tmp * (tmp - 1) / 2;
				}
			}
		}
		System.out.println(ans);

	}

}
