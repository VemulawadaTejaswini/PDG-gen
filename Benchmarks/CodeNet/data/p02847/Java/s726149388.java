import java.util.Scanner;

public class Main {

	private static final String DAY_OF_THE_WEEK[] = { "SUN","MON","TUE","WED","THU","FRI","SAT"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int answer = 0;

		for (int i = 0; i < 7; i++) {
			if (S.equals(DAY_OF_THE_WEEK[i])) {
				answer = (7 - i) % 8;
			}
		}

		System.out.println(answer);
	}
}
