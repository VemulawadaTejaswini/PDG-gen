import java.util.*;

public class Main {
	static void test(String answer) {
		if (answer.equals("Vacant")) {
			System.out.println(0);
			System.out.flush();
			return;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String answer;
		System.out.println(0);
		System.out.flush();
		answer = scanner.next();
		test(answer);
		int B;
		int C = 0;
		for (int i = 0; i < 19; i++) {
			N = N / 2;
			B = N + C;
			System.out.println(B);
			System.out.flush();
			String currentAnswer = scanner.next();
			test(currentAnswer);
			if (currentAnswer.equals(answer)) {
				C += 0;
			} else {
				C += N;
			}
		}
	}
}