import java.util.Scanner;

// C - Stones
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		int black = 0;
		int white = 0;

		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == '.') {
				white++;
			}
		}

		int min = white;

		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == '#') {
				black++;
			} else {
				white--;
			}
			min = Math.min(min, black + white);
		}
		System.out.println(min);
	}
}