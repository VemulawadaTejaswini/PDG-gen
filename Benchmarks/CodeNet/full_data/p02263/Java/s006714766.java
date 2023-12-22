import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StackSub readDataArr = new StackSub(in.readLine().split(" "));
		System.out.println(readDataArr.calcData());
	}
}

class StackSub {
	private String[] readData;
	private int[] stack = new int[100];
	private int pointer = 0, result, operand2, operand1,
			strToIntData;

	StackSub(String[] readData) {
		this.readData = readData;
	}

	public void push(int data) {
		stack[pointer] = data;
		pointer++;
	}

	public int pop() {
		pointer--;
		return stack[pointer];
	}

	public int calcData() {
		String tempStrData;
		for (int i = 0; i < readData.length; i++) {
			tempStrData = readData[i];

			if (tempStrData.equals("+")) {
				operand1 = pop();
				operand2 = pop();
				result = operand2 + operand1;
				push(result);
			} else if (tempStrData.equals("-")) {
				operand1 = pop();
				operand2 = pop();
				result = operand2 - operand1;
				push(result);
			} else if (tempStrData.equals("*")) {
				operand1 = pop();
				operand2 = pop();
				result = operand2 * operand1;
				push(result);
			} else {
				strToIntData = Integer.parseInt(readData[i]);
				push(strToIntData);
			}
		}
		return pop();
	}
}