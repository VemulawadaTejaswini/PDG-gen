import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		Stack<Integer> stack = new Stack<Integer>();
		
		while( true ) {
			n = scan.nextInt();
			
			if(n > 0) {
				stack.push(n);
			}
			
			if(n == 0) {
				System.out.println(stack.pop());
			}
			
			if( stack.empty() ) {
				break;
			}
			
		}
	}
}