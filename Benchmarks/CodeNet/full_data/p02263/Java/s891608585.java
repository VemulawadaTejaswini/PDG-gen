import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	int top;
	int max;
	int[] S;
	public void initialize() {
		top = 0;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public boolean isFull() {
		return top >= max - 1;
	}

	public void push(int x) {
		if(isFull()) {
			throw new  ArithmeticException();
		}
		top++;
		S[top] = x;
	}

	public int pop() {
		if(isEmpty()) {
			throw new ArithmeticException();
		}
		top--;
		return S[top + 1];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] num = br.readLine().split(" ");

		char[] numChar = new char[num.length];

		Main stack  = new Main();

		int result = 0;
		for(int i = 0; i < num.length; i++) {
			 numChar[i] = num[i].charAt(i);

			 if(numChar.equals("+")) {
				 result = (stack.pop() + stack.pop());
			 }
			 else if(numChar.equals("-")) {
				 result = (stack.pop() - stack.pop());
			 }
			 else if(numChar.equals("*")) {
				 result = (stack.pop() * stack.pop());
			 }
		}
		System.out.println(result);
	}
}