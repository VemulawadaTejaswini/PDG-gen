import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		boolean[] used = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			used[s.charAt(i) - 'a'] = true;
		}
		
		for (int i = 0; i < used.length; i++) {
			if (!used[i]) {
				System.out.println((char) ('a' + i));
				return;
			}
		}
		System.out.println("None");
		
	}
}


