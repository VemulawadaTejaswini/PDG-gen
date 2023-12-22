import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer> stack = new ArrayList<Integer>();
	static int top_index = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");

		for(int i = 0; i < input.length; i++) {
			if(isNumber(input[i])) {
				push(input[i]);
			}else {
				int b = pop();
				int a = pop();
				switch(input[i]) {
				case "+":
					push(a + b);
					break;
				case "-":
					push(a - b);
					break;
				case "*":
					push(a * b);
					break;
				case "/":
					push(a / b);
					break;
				default:
					System.out.println("予期せぬ値が含まれています。");
					break;
				}
			}
		}

		System.out.println(stack.get(0));
		sc.close();
	}

	public static void push(String num) {
		int n = Integer.parseInt(num);
		stack.add(n);
		top_index ++;
	}

	public static void push(int num) {
		stack.add(num);
		top_index ++;
	}

	public static int pop() {
		int n = stack.get(top_index);
		stack.remove(top_index);
		top_index --;
		return n;
	}

	// 文字列numが数値かどうか
	public static boolean isNumber(String num) {
		try {
			Integer.parseInt(num);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
}
