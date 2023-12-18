import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] t = sc.nextLine().toCharArray();
		long ans = 0;
		int tmp = 0;
		int tSize = t.length;
		int sSize = s.length();
		for (int i = 0; i < tSize; i++) {
			char c = t[i];
			int index = s.indexOf(c, tmp);
			if (index < 0) {
				if (tmp == 0) {
					System.out.println(-1);
					return;
				} else {
					ans = ans + sSize - tmp;
					tmp = 0;
					i = i - 1;
					continue;
				}
			}
			ans = ans + index + 1 - tmp;
			tmp = index + 1;
		}
		System.out.println(ans);
	}
}
