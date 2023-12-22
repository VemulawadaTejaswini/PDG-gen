import java.util.*;

class Main {
	public static int[] stack = new int[100];
	public static int top = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String str = sc.nextLine();
		String[] S = str.split(" ");

		for (int i = 0; i < S.length; i++ ) {
			if (S[i].equals("+")) {
				b = pop();
				a = pop();
				push(a + b);
			} else if (S[i].equals("*")) {
				b = pop();
				a = pop();
				push(a * b);
			} else if (S[i].equals("-")) {
				b = pop();
				a = pop();
				push(a - b);
			} else {
				push(Integer.parseInt(S[i]));
			}
		}
		System.out.println(pop());
	}

	public static void push(int x) {
		stack[++top] = x;
		
	}

	public static int pop() {
		top--;
		return stack[top + 1];
	}
}
