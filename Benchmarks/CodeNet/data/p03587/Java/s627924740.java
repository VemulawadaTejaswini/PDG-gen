import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int cnt = 0;
		String a;
		a = stdin.next();
		for (int i = 0; i < 6; i++) {
			if (a.charAt(i)- '0' == 1) {
				cnt++;
			}

		}
		System.out.println(cnt);

	}
}
