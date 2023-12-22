import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack<Character> s = new  Stack<>();
		while(true){
			String in = sc.nextLine();
			String pr = "yes";
			if(in.charAt(0) == '.') break;
			for(int i = 0; ; i++){
				char c = in.charAt(i);
				if(c == '.') 
					break;
				else if(c == '(' || c =='[') 
					s.push(c);
				else if(c == ')' || c == ']'){
					if(s.empty()) {pr = "no"; break;}
					else if ((c == ')' &&  s.peek() == '(') 
						|| (c == ']' &&  s.peek() == '[')){
						s.pop();
					}else{
						pr = "no"; break;
					}
				else continue;	
				}
			}
			if (!(s.empty())) pr = "no"; 
			System.out.println(pr);
			s.clear();
		}
	}
}