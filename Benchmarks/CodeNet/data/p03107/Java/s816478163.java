import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int len = s.length();
		int cnt0 = 0;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == '0') {
				cnt0++;
			}
		}
		int cnt1 = len - cnt0;
		System.out.println(len - Math.abs(cnt0 - cnt1));
	}
}
