import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

class Solve{
	final Scanner in = new Scanner(System.in);
	char[] s;
	String curl = "()[]";
	boolean solve(){
		char[] tmp = in.nextLine().toCharArray();
		if(tmp[0] == '.') return false;
		int n = 0;
		for(int i=0; i<tmp.length; i++) if(curl.indexOf(tmp[i]) != -1) n++;
		s = new char[n];
		int idx = 0;
		for(int i=0; i<tmp.length; i++) if(curl.indexOf(tmp[i]) != -1) s[idx++] = tmp[i];
		Stack<Character> stack = new Stack<Character>();
		boolean ok = true;
		out: for(int i=0; i<s.length; i++){
			switch(s[i]){
			case '(':
				stack.push(s[i]);
				break;
			case ')':
				if(stack.isEmpty() || stack.pop() != '('){
					ok = false;
					break out;
				}
				break;
			case '[':
				stack.push(s[i]);
				break;
			case ']':
				if(stack.isEmpty() || stack.pop() != '['){
					ok = false;
					break out;
				}
				break;
			}
		}
		if(!stack.isEmpty()) ok = false;
		System.out.println(ok ? "yes" : "no");
		return true;
	}
	
}

public class Main{
	public static void main(String[] args) throws IOException{
		Solve solve = new Solve();
		while(solve.solve());
	}
}