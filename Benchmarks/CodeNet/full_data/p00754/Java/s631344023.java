import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		String s2 = ".";
		boolean flag = true;
		while(true){
			String s = sc.nextLine();
			if(s.equals(".") && s2.charAt(s2.length()-1) == '.') break;
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == '['){
					stack.push("[");
				}else if(s.charAt(i) == ']'){
					if(stack.empty()){
						flag = false;
						continue;
					}
					String a = stack.pop();
					if(!a.equals("[")){
						flag = false;
					}
				}else if(s.charAt(i) == '('){
					stack.push("(");
				}else if(s.charAt(i) == ')'){
					if(stack.empty()){
						flag = false;
						continue;
					}
					String a = stack.pop();
					if(!a.equals("(")){
						flag = false;
					}
				}else if(s.charAt(i) == '.'){
					if(!stack.empty()) flag = false;
					if(flag) System.out.println("yes");
					else System.out.println("no");
					flag = true;
					stack.clear();
				}
			}
			s2 = s;
		}
	}
}