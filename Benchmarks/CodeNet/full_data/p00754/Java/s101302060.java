import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	static boolean check(String str) {
		Stack<Character>  stack=new Stack<>();
		for(int i=0; i<str.length(); i++) {
			char s=str.charAt(i);
			if(s=='.') {
				break;
			}
			if(s=='(') {
				stack.push(')');
			}
			if(s=='[') {
				stack.push(']');
			}
			if(s==')'|| s==']') {
				if(stack.isEmpty() || stack.pop()!=s) {
					return false;
				}
			}
		}
		return stack.isEmpty();
		
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextLine()) {
				String str=sc.nextLine();
				if(str.equals(".")) {
					break;
				}
				if(check(str)) {
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}

			}
			

		}
	}
}
