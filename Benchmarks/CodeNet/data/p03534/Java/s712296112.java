import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		int acnt = 0, bcnt = 0, ccnt = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'a') {
				acnt++;
			} else if (s[i] == 'b') {
				bcnt++;
			} else if (s[i] == 'c') {
				ccnt++;
			}
		}
		int min = Math.min(acnt, bcnt);
		min = Math.min(min, ccnt);
		acnt = acnt - min;
		bcnt = bcnt - min;
		ccnt = ccnt - min;
		if (acnt <= 1 && bcnt <= 1 && ccnt <= 1) {
			sb.append("YES");
		} else {
			sb.append("NO");
		}
		System.out.println(sb);
	}
}
