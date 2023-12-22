import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;


public class Main{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			String str = s.nextLine();
			if(".".equals(str))
				break;
			solve(str);
		}
	}

	public static void solve(String str) {
		Stack<String> stack = new Stack<String>();
//		Stack round = new Stack();
		for(int i=0 ; i<str.length() ; i++) {
			String c = str.substring(i, i+1);
			if("(".equals(c)) {
				stack.push("(");
			}else if(")".equals(c)) {
				Object o = null;
				try{
					o = stack.pop();
				}catch(EmptyStackException e) {
					System.out.println("no");
					return;
				}
				if(o == null || !"(".equals(o)) {
					System.out.println("no");
					return;
				}
			}else if("[".equals(c)) {
				stack.push("[");
			}else if("]".equals(c)) {
				Object so = null;
				try{
					so = stack.pop();
				}
				catch(EmptyStackException e) {
					System.out.println("no");
					return;
				}
				if(so == null || !"[".equals(so)) {
					System.out.println("no");
					return;
				}
			}
		}
		if(! stack.isEmpty()) {
			System.out.println("no");
			return;
		}
		if(! stack.isEmpty()) {
			System.out.println("no");
			return;
		}
		System.out.println("yes");
	}
}