import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Main {

	public static void main(String[] args) {

		Input stdIn = new Input();
		int x, y;

		List<String> inputline = stdIn.getLineString();
		Deque<Integer> stack = new LinkedList<>();

		for (int i = 0; i < inputline.size(); i++) {
			switch (inputline.get(i)) {
			case "+":
				y = stack.pop();
				x = stack.pop();
				stack.push(x + y);
				break;
			case "-":
				y = stack.pop();
				x = stack.pop();
				stack.push(x - y);
				break;
			case "*":
				y = stack.pop();
				x = stack.pop();
				stack.push(x * y);
				break;
			default:
				stack.push(Integer.parseInt(inputline.get(i)));
			}
		}
		System.out.println(stack.peek());
	}
}
class Input {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Input() {
		super();
	}

	public Integer getValue() {
		try {
			String[] s = br.readLine().trim().split(" ");
			return Integer.parseInt(s[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Integer> getLine(int n) {
		List<Integer> values = new ArrayList<>();
		try {
			String[] s = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++) {
				values.add(Integer.parseInt(s[i]));
			}
			return values;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<String> getLineString() {
		try {
			String[] s = br.readLine().trim().split(" ");
			List<String> values = Arrays.asList(s);
			return values;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}