import java.util.Scanner;
import java.util.Stack;

public class Main {
	
//	public static void main(String[] args) {
//		try(Scanner sc = new Scanner(System.in)){
//			int N = sc.nextInt();
//			int[] d = new int[100010];
//			for(int i=0; i<N; i++) {
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//				for(int j = a; j <= b; j++) {
//					d[j]++;
//				}
//			}
//			int p;
//			for(p = d.length-1; d[p] < p-1; p--) {
//			}
//			System.out.println(p-1);
//		}
//	}
	
	static boolean check(String s) {
		Stack<Character> stack = new Stack<>(); //
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '.') {
				break;
			}
			if(c == '(') {
				stack.push(')');
			}
			if(c == '[') {
				stack.push(']');
			}
			if(c == ')' || c == ']') {
				if(stack.isEmpty() || stack.pop() != c) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(sc.hasNextLine()){
				String s = sc.nextLine();
				if(s.equals(".")) {
					break;
				}
				if(check(s)) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
		}
	}
}

