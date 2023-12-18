import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		char[] c = S.toCharArray();
		
		boolean[] alp = new boolean[26];
		Arrays.fill(alp, false);
		
		for(int i = 0; i < S.length(); i++) {
			alp[c[i] - 'a'] = true;
		}
		
		for(int i = 0; i < 26; i++) {
			if(alp[i] == false) {
				System.out.println((char)(i+'a'));
				System.exit(0);
			}
		}
		System.out.println("None");

	}

}