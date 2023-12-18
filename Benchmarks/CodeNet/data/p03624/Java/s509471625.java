import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] alp = new int['z' - 'a' + 1];
		Arrays.fill(alp, 0);
		for(int i = 0; i < S.length(); i++) {
			alp[S.charAt(i) - 'a']++;
		}
		char c = '-';
		for(int i = 0; i < alp.length; i++) {
			if(alp[i] == 0 && c == '-') {
				c = (char)('a' + i);
			}
		}
		System.out.println(c == '-' ? "None" : c);
	}
}