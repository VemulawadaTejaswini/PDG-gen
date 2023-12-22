import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			boolean flag = true;
			if(s.equals(".")) break;
			Stack<String> stack = new Stack<String>();
			while(true){
				for(int i = 0; i < s.length(); i++){
					if(s.charAt(i) == '['){
						stack.push("[");
					}else if(s.charAt(i) == ']'){
						if(stack.empty()){
							flag = false;
							break;
						}
						String a = stack.pop();
						if(!a.equals("[")){
							flag = false;
							break;
						}
					}else if(s.charAt(i) == '('){
						stack.push("(");
					}else if(s.charAt(i) == ')'){
						if(stack.empty()){
							flag = false;
							break;
						}
						String a = stack.pop();
						if(!a.equals("(")){
							flag = false;
							break;
						}
					}
				}
				if(s.charAt(s.length()-1) == '.') break;
				s = sc.nextLine();
			}
			if(flag) System.out.println("yes");
			else System.out.println("no");
		}
	}
}