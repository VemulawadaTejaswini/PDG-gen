import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int cnt = 0;
		for (int i = 0; i < s.length() - 3; i++) {
			String tmp = s.substring(i, i + 3);
			for (int k = i + 3; k < s.length(); k++) {
				tmp += s.charAt(k);
				if (Long.parseLong(tmp) % 2019 == 0) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
