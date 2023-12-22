
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			if(str.equals("."))break;
			Stack<String> b = new Stack<String>();
			boolean can = true;
			String ans = "yes";
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<str.length();i++) {
				char a = str.charAt(i);
				if(a=='(' || a==')' || a=='[' || a==']') {
					sb.append(a);
				}
			}

			for(int i=0;i<sb.length();i++) {	
				String a = String.valueOf(sb.charAt(i));
				if(a.equals("(")) {
					if(!b.empty() && !b.peek().equals("(") && !b.peek().equals("[")){ 
						can = false;
						break;
					}
					b.push(a);
				}
				else if(a.equals(")")) {
					if(b.empty()) {
						can  = false;
						break;
					}
					else if(b.peek().equals("(") )
						b.pop();
					else{
						can = false;
						break;
					}
				}
				else if(a.equals("[")) {
					if(b.empty() || b.peek().equals("[") || b.peek().equals("("))
						b.push(a);
					else{
						can = false;
						break;
					}
				}
				else if(a.equals("[")) {
					if(b.empty()) {
						can = false;
						break;
					}
					else if(b.peek().equals("["))
						b.pop();
					else {
						can = false;
						break;
					}
				}
			}
			if(!can || !b.empty())ans="no";
			System.out.println(ans);
			b.clear();
		}
	}

}

