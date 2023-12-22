import java.util.Scanner;

public class Main {

	static int top;
	static int[] S = new int[1000];

	public static void push(int x) {
		top++;
		S[top] = x;
	}

	public static int pop() {
		top--;
		return S[top + 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char s;
		top = 0;
		while (sc.hasNext()) {
			s = sc.next().charAt(0);
			if (s == '+') {
				b = pop();
				a = pop();
				push(a + b);
			} else if (s == '-') {
				b = pop();
				a = pop();
				push(a - b);
			} else if (s == '*') {
				b = pop();
				a = pop();
				push(a * b);
			} else {
				push(Character.getNumericValue(s));
			}
		}
		System.out.println(pop());
		sc.close();
	}
}

