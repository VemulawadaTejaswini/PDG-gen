import java.util.Scanner;
import java.util.Stack;

class Main {
	static final String YES = "YES";
	static final String NO = "NO";

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] ball = new int[10];
			while (sc.hasNextInt()) {
				int dataset = sc.nextInt();

				for (int i = 0; i < dataset; i++) {
					for (int j = 0; j < 10; j++) {
						ball[j] = sc.nextInt();
					}

					System.out.println(push(ball));
				}
			}
		} finally {
			sc.close();
		}
	}

	public static String push(int[] ball) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();

		for (int number : ball) {
			if (stack1.isEmpty() || stack1.peek() < number) {
				stack1.push(number);
			} else if (stack2.isEmpty() || stack2.peek() < number) {
				stack2.push(number);
			} else {
				return NO;
			}
		}
		return YES;
	}
}