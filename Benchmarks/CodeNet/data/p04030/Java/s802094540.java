import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] letters = scanner.next().toCharArray();
		char[] ans = new char[letters.length];
		int p = 0; 
		
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == 'B') {
				if (p>0) {
					p--;
				}
			}else {
				ans[p] = letters[i];
				p++;
			}
		}
		String s = new String(ans);
		s = s.substring(0, p);
		System.out.println(s);
		scanner.close();
	}
}
