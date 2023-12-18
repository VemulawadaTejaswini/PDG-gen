import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String str;
		int Y = 0;

		for (int i = 0; i < N; i++) {
			str = s.next();
			if (str.equals("Y")) {
				Y++;
			}
		}
		if (Y == 0) {
			System.out.println("Three");
		} else {
			System.out.println("Four");
		}
	}
}