import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deque<Integer> numbers = new ArrayDeque<>();
		String str;
		int a = 0;
		int b = 0;

		while(scan.hasNext()) {
			str = scan.next();
			switch(str) {
				case "+":
					a = numbers.pop();
					b = numbers.pop();
					numbers.push(a + b);
					break;
				case "-":
					b = numbers.pop();
					a = numbers.pop();
					numbers.push(a - b);
					break;
				case "*":
					a = numbers.pop();
					b = numbers.pop();
					numbers.push(a * b);
					break;
				default:
					numbers.push(Integer.parseInt(str));
			}

		}

		System.out.println(numbers.peek());

	}
}

