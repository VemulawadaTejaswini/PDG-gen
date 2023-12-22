//package aoj0013;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deque<Integer> stack = new ArrayDeque<Integer>();
		while (scan.hasNext()) {
			int tmp = scan.nextInt();
			if (tmp == 0) {
				System.out.println(stack.pop());
			} else {
				stack.push(tmp);
			}
		}
	}
}