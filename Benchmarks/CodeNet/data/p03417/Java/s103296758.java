import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;

		if (a > 2 && b > 2) {
			answer = (a - 2) * (b - 2);
		} else {
			if (a == 1) {
				if (b > 2) {
					answer = b - 2;
				} else if (b == 2) {
					answer = 0;
				} else if (b == 1) {
					answer = b;
				}
			} else if (a == 2) {
				answer = 0;
			} else if (a > 2) {
				if (b == 1) {
					answer = a - 2;
				}
				if (b == 2) {
					answer = 0;
				}
			}
		}

		System.out.println(answer);

	}

}