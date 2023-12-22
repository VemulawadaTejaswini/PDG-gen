

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		String[] inputs = input.split(" ");
		Deque<Integer> stack = new ArrayDeque<>();
		for(String s : inputs) {
			if(s.equals("+")) {
				stack.push((stack.pop() + stack.pop()));
			}else if(s.equals("-")) {
				stack.push((-1 * stack.pop() + stack.pop()));
			}else if(s.equals("*")) {
				stack.push((stack.pop() * stack.pop()));
			} else {
				stack.push(Integer.parseInt(s));
			}
		}
		System.out.println(stack.pop());
	}

}

