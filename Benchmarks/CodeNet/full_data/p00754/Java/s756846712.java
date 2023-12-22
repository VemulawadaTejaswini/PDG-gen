import java.util.*;
public class Main {
	static String str;
	static List<Character> stack;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			str = sc.nextLine();
			if(str.equals("."))break;
			boolean flg = true;
			stack = new ArrayList<Character>();
			for(int i=0;i<str.length();i++){
				char c = str.charAt(i);
				if(c == '(' || c == '['){
					stack.add(c);
				}else if(c == ')'){
					if(stack.size()==0){
						flg = false;break;
					}
					else if(stack.get(stack.size()-1)=='('){
						stack.remove(stack.size()-1);
					}else{
						flg = false;break;
					}
				}else if(c == ']'){
					if(stack.size()==0){
						flg = false;break;
					}
					else if(stack.get(stack.size()-1)=='['){
						stack.remove(stack.size()-1);
					}else{
						flg = false;break;
					}						
				}
			}
			if(!flg){
				System.out.println("no");
			}else if(flg)
				System.out.println("yes");
		}
	}
}