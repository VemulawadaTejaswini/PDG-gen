import java.util.*;
import java.io.*;
public class Main {
	
	void doIt() {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader din = new BufferedReader(read);
		
		try {
		while(true) {
			Stack<Character> stack = new Stack<Character>();
			Stack<Character> check = new Stack<Character>();
			boolean ans = true;
			String str = din.readLine();
			
			if(str.charAt(0) == '.') break;
			char ch = '.';
			for(int r = 0; r < str.length(); r++) {
				if(str.charAt(r) == ' ') continue;
				if(str.charAt(r) == '(' || str.charAt(r) == '[') {
					stack.add(str.charAt(r));
					if(str.charAt(r) == '(') {
						check.add(')');
					} else if(str.charAt(r) == '[') {
						check.add(']');
					}
				} else if(str.charAt(r) == ')' || str.charAt(r) == ']') {
					if(!stack.isEmpty()) ch = check.pop();
					if(str.charAt(r) != ch || stack.empty()) {
						continue;
					}
					stack.pop();
				}
			}
			if(!stack.isEmpty()) ans = false;
			System.out.println((ans) ? "yes" : "no");
		}
		}catch(IOException e) {}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}