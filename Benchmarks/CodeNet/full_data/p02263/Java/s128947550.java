import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack {
	String[] stack;
	int index;
	public Stack(int size) {
		index = 0;
		stack = new String[size];
	}

	public void put(String target) {
		stack[index++] = target;
	}

	public void put(int target) {
		stack[index++] = String.valueOf(target);
	}

	public String get() {
		return stack[--index];
	}

	public int getNum() {
		return Integer.parseInt(get());

	}
}
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack stack = new Stack(200);
		String[] strs = br.readLine().split(" ");
		for (String target : strs) {
			if ("*".equals(target)) {
			stack.put(stack.getNum() * stack.getNum());
			} else if ("+".equals(target)) {
				stack.put(stack.getNum() + stack.getNum());
			} else if ("-".equals(target)) {
				int b = stack.getNum();
				int a = stack.getNum();
				stack.put(a - b);
			} else {
				stack.put(target);
			}
		}
		System.out.println(stack.get());
	}
}