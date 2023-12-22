import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StackSub readDataArr = new StackSub(in.readLine());
		readDataArr.toCharArray();
		System.out.println(readDataArr.calcData());
	}
}

class StackSub {
	private String readData;
	private char[] charDataArray;
	private int[] stack = new int[100];
	private int ans, operand1, operand2, pointer = 0;

	StackSub(String readData) {
		this.readData = readData;
	}

	public void toCharArray() {
		charDataArray = readData.toCharArray();
	}

	public int calcData() {
		char tempCharData;
		for (int i = 0; i < charDataArray.length; i += 2) {
			tempCharData = charDataArray[i];
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
				stack[pointer] = Character.getNumericValue(charDataArray[i]);
				pointer++;
			}
		}
		ans = stack[0];
		return ans;
	}
}