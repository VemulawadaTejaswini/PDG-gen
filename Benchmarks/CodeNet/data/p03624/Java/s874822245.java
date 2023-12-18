import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (char c = 'a'; c <= 'z'; c++) {
			boolean flag = false;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == c) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(c);
				return;
			}
		}
		System.out.println("None");
	}
}
