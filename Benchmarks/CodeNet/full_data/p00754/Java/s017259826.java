import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextLine()) {
				String str=sc.nextLine();
				if(str.equals(".")) {
					break;
				}
				Stack<Character>  stack=new Stack<>();
				boolean tf=true;
				for(int i=0; i<str.length(); i++) {
					char s=str.charAt(i);
					if(s=='.') {
						stack.isEmpty();
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
							tf=false;
							break;
						}
					}
				}
				if(tf) {
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}

			}
			

		}
	}
}
