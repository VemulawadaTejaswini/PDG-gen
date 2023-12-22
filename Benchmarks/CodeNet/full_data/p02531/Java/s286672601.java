import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		
		Stack<String> stack = new Stack<String>();
		
		String s;
		
		while (true){
			s = scan.next();
			
			if (s.equals("quit")) {
				break;
			}
			
			if (s.equals("push")){
				String c = scan.next();
				stack.push(c);
			}
			else if (s.equals("pop")){
				System.out.println(stack.pop());
			}
		}
	}
}