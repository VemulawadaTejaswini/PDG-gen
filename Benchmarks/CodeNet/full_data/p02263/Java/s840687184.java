import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		Input stdIn = new Input();

		List<Character> inputline = stdIn.getLineChar();
		Deque<Integer> stack = new LinkedList<>();

		for(int i = 0; i <inputline.size(); i++) {
			if(Character.isDigit(inputline.get(i))) {
				stack.push(Character.digit(inputline.get(i), 10));
			} else {
				stack.push(calc(stack.pop(), stack.pop(), inputline.get(i)));
			}
			//System.out.println(stack);
		}
		System.out.println(stack.peek());
	}
	public static int calc(int y, int x, char op) {
		switch (op) {
		case '+':
			return x + y;
		case '-':
			return x - y;
		case '*':
			return x * y;
		default:
			return 0;
		}
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
	public List<Character> getLineChar() {
		List<Character> values = new ArrayList<>();
		try {
			String[] s = br.readLine().trim().split(" ");
			for(int i = 0; i < s.length; i++) {
				values.add(s[i].charAt(0));
			}
			return values;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}