import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		int sidx, eidx, cnt;
		String str = -1 + " " + -1;
		for (char c = 'a'; c <= 'z'; c++) {
			cnt = 0;
			sidx = -1;
			eidx = -1;
			for (int i = 0; i < s.length; i++) {
				if (s[i] == c) {
					if (sidx == -1) {
						sidx = i;
						cnt++;
					} else {
						eidx = i;
						cnt++;
					}
				}
			}
			if (eidx - sidx > 1 && cnt * 2 > eidx - sidx + 1) {
				sidx++;
				eidx++;
				str = sidx + " " + eidx;
				break;
			}
		}
		System.out.println(str);
	}
}
