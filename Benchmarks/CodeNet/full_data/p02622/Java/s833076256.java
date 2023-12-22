import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String s1 = scn.next();
			String s2 = scn.next();

			if(s1.equals(s2)) {
				System.out.println(0);
				return;
			}
			int cnt = 0;
			for(int i=0; i<s1.length(); i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
