import java.util.Scanner;

public class Main {
	static boolean[][] nodes;
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);

		char ans = 'H';
		if (a == 'H') {
			if (b == 'D') {
				ans = 'D';
			}
		} else {
			if (b == 'H') {
				ans = 'D';
			}
		}

		System.out.println(ans);

		sc.close();
	}

}
