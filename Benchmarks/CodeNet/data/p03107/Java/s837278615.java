import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		while (true) {
			int len = s.length();
			s = s.replaceAll("01|10", "");
			
			int dif = len - s.length();
			if (dif > 0) {
				cnt += dif;
			} else {
				break;
			}
		}
		System.out.println(cnt);
	}
}
