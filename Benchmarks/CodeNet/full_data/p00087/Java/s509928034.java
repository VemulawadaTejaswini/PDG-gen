import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			Stack<String> stack = new Stack<String>();
			double a, b;

			for (String s : line.split(" ")) {
				if (isNumeric(s)) {
					stack.push(s);
				} else {
					b = Double.parseDouble(stack.pop());
					a = Double.parseDouble(stack.pop());
					switch (s.toCharArray()[0]) {
					case '+':
						stack.push(String.valueOf(a + b));
						break;
					case '-':
						stack.push(String.valueOf(a - b));
						break;
					case '*':
						stack.push(String.valueOf(a * b));
						break;
					case '/':
						stack.push(String.valueOf(a / b));
						break;
					}
				}
			}
			System.out.println(stack.pop());
		}
	}

	static boolean isNumeric(String s) {
		boolean result = false;
		try {
			Double.parseDouble(s);
			result = true;
		} catch (NumberFormatException e) {
		}
		return result;
	}
}