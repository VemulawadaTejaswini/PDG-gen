
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		char c = s.charAt(0);
		int cnt = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				cnt++;
				continue;
			}
			c = s.charAt(i);
		}
		System.out.println(cnt);
	}
}