import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String[] stack;
		String line = stdIn.nextLine();
		stack = line.split(" ", 0);

		Stack stack1 = new Stack();

		for (int i = 0; i < stack.length; i++) {
			int tmp = 0;
			switch (stack[i]) {
				case "+":{
					tmp = stack1.pop() + stack1.pop();
					stack1.push(String.valueOf(tmp));
					break;
				}

				/*????????§??????????????§???*/
				case "-":{
					int operand1 = stack1.pop();
					int operand2 = stack1.pop();
					tmp = operand2 - operand1;
					stack1.push(String.valueOf(tmp));
					break;
				}
				case "*":{
					tmp = stack1.pop() * stack1.pop();
					stack1.push(String.valueOf(tmp));
					break;
				}
				default:{
					stack1.push(stack[i]);
					break;
				}
			}
		}
		System.out.println(stack1.pop());

	}
}

class Stack{
	int maxSize = 200;
	int pointer;
	String[] stack = new String[maxSize];

	public void initialize(){
		this.pointer = 0;
	}

	public void push(String x) {
		this.stack[pointer] = x;
		pointer++;
	}

	public int pop() {
		pointer--;
		return Integer.parseInt(stack[pointer]);
	}

}