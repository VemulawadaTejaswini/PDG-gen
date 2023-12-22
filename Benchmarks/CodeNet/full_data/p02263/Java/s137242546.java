import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StackSub createDataArr = new StackSub(in.readLine().split(" "));
		System.out.println(createDataArr.calcData());
	}
}

class StackSub {
	private String[] readData;
	private int[] stack = new int[100];
	private int ans;

	StackSub(String[] readData) {
		this.readData = readData;
	}

	void createData(String[] criateDataArr) {
		readData = new String[criateDataArr.length];
	}

	int calcData() {
		int stackNum = 0;
		for (int i = 0; i < readData.length; i++) {
			if (readData[i].charAt(0) == '+') {
				stack[stackNum - 2] = stack[stackNum - 2] + stack[stackNum - 1];
				stackNum -= 1;
			} else if (readData[i].charAt(0) == '-') {
				stack[stackNum - 2] = stack[stackNum - 2] - stack[stackNum - 1];
				stackNum -= 1;
			} else if (readData[i].charAt(0) == '*') {
				stack[stackNum - 2] = stack[stackNum - 2] * stack[stackNum - 1];
				stackNum -= 1;
			} else {
				stack[stackNum] = Integer.parseInt(readData[i]);
				stackNum++;
			}
		}
		ans = stack[0];
		return ans;
	}
}