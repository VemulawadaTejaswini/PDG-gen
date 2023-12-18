import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String ans = "";
		for (int i = 0; i < s.length() - 1; i++) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(i + 1);
			if (ch1 != 'B' && ch2 != 'B') {
				ans = ans + ch1;
			}
		}
		if (s.charAt(s.length() - 1) != 'B') {
			ans = ans + s.charAt(s.length() - 1);
		}
		System.out.println(ans);

	}

}
