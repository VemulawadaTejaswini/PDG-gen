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
	private int ans, operand1, operand2, pointer = 0;

	StackSub(String[] readData) {
		this.readData = readData;
	}

	public int calcData() {
		char tempCharData;
		for (int i = 0; i < readData.length; i++) {
			tempCharData = readData[i].charAt(0);
			operand1 = pointer - 2;
			operand2 = pointer - 1;

			if (tempCharData == '+') {
				stack[operand1] = stack[operand1] + stack[operand2];
				pointer--;
			} else if (tempCharData == '-') {
				stack[operand1] = stack[operand1] - stack[operand2];
				pointer--;
			} else if (tempCharData == '*') {
				stack[operand1] = stack[operand1] * stack[operand2];
				pointer--;
			} else {
				stack[pointer] = Integer.parseInt(readData[i]);
				pointer++;
			}
		}
		ans = stack[0];
		return ans;
	}
}