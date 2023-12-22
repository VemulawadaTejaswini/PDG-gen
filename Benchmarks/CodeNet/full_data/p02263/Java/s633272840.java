import java.util.Scanner;

public class Main {
	public static int top = 0;
	public static int[] stack = new int[200];
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] k = (stdIn.nextLine()).split(" ");
		
		for (int i = 0; i < k.length;i++) {
			if (k[i].equals("+")) {
				int b = pop();
				int a = pop();
				push(a + b);
			}
			else if (k[i].equals("-")) {
				int b = pop();
				int a = pop();
				push(a - b);
			}
			else if (k[i].equals("*")) {
				int b = pop();
				int a = pop();
				push(a * b);
			}
			else
				push(Integer.parseInt(k[i]));
		}
		
		System.out.println(pop());
	}
	
	public static void push(int x) {
		stack[++top] = x;
	}
	
	public static int pop() {
		top--;
		return stack[top+1];
	}
}