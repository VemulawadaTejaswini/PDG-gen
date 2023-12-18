import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		int cnt = 0;
		while (s.contains("BW")) {
			while (s.charAt(0) == 'W') {
				s = s.substring(1);
			}
			while (s.charAt(s.length() - 1) == 'B') {
				s = s.substring(0, s.length() - 1);
			}
			s = s.replaceFirst("BW", "WB");
			cnt++;
		}
		System.out.println(cnt);
	}
}
