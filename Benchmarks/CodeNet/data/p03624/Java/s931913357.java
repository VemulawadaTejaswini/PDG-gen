import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String s[] = new String[S.length()];
		for(int i = 0; i < S.length(); i++) {
			s[i] = S.substring(i, i + 1);
		}
		Arrays.sort(s);
		String temp[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int cnt = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals(temp[cnt])) {
				cnt++;
			} else if(cnt != 0 && s[i].equals(temp[cnt - 1])) {
				
			} else {
				System.out.println(temp[cnt]);
				return;
			}
		}
		System.out.println("None");
	}
}
