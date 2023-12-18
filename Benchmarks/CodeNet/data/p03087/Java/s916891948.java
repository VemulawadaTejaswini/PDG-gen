import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		question[] questions = new question[Q];

		for (int i = 0; i < Q; i++) {
			questions[i] = new question();
			questions[i].i = sc.nextInt();
			questions[i].r = sc.nextInt();
			// System.out.println(questions[i]);
		}

		for (question q : questions) {
			String str = S.substring(q.i - 1, q.r);
			String str2 = str.replaceAll("AC", "");
			System.out.println((str.length() - str2.length()) / 2);
		}

	}
}

class question {
	int i;
	int r;

	public String toString() {
		return "i:" + i + ",r:" + r;
	}
}