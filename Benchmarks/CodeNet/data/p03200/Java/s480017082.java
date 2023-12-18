import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		long wcnt = 0;
		long widx = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'W') {
				wcnt += i - widx;
				widx++;
			}
		}
		System.out.println(wcnt);
	}
}
