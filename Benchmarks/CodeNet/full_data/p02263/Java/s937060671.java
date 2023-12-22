import java.util.Scanner;

public class Main {
	static int[] s = new int[200]; // オペランド100個と演算子99個が収まる容量
	static int top = 0;
	static int max = 200;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				int num = sc.nextInt();
				push(num);

			} else {
				String str = sc.next();
				int a = pop();
				int b = pop();

				switch (str) {
				case "+":
					push(b + a);
					break;

				case "-":
					push(b - a); // LIFO（後入れ先出し）

					break;
				case "*":
					push(b * a);
					break;
				}
			}
		}
		System.out.println(pop());

	}

	/* 配列によるスタックの実装 */

	private static void initialize() {
		top = 0;
	}

	private static boolean isEmpty() {
		return top == 0;
	}

	private static boolean isFull() {
		return top >= max - 1;
	}

	private static void push(int x) {
		if (!isFull()) {
			top++;
			s[top] = x;
		} else {
			System.err.println("容量オーバーです。");
		}
	}

	private static int pop() {
		int ret = -1;
		if (!isEmpty()) {
			ret = s[top];
			top--;
		} else {
			System.err.println("中身が空です。");
		}
		return ret;
	}

}
