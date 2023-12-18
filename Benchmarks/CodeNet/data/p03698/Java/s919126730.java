
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			//英小文字からなる文字列
			String s = sc.next().toLowerCase();
			String ans = "yes";
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						ans = "no";
					}
				}
				
			}
			System.out.println(ans);
		}
	}
}
