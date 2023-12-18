import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char s[] = sc.next().toCharArray();
		int min = 101, cnt, tmp;
		for (char j = 'a'; j <= 'z'; j++) {
			cnt = 0;
			tmp = 0;
			for (int i = s.length - 1; i >= 0; i--) {
				if (j == s[i]) {
					tmp = Math.max(tmp, cnt);
					cnt = 0;
				} else {
					cnt++;
				}
			}
			tmp = Math.max(tmp, cnt);
			min = Math.min(min, tmp);
		}
		System.out.println(min);
	}
}