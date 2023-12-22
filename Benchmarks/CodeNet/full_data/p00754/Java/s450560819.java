
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
			for(int i=0;i<str.length();i++) {
				char a = str.charAt(i);
				String aa = String.valueOf(a);
				if(a=='(') {
					if(b.empty() || b.peek().equals("(") || b.peek().equals("["))
						b.push(aa);
					else { 
						can = false;
						break;
					}
				}
				else if(a==')') {
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
				else if(a=='[') {
					if(b.empty() || b.peek().equals("[") || b.peek().equals("("))
						b.push(aa);
					else{
						can = false;
						break;
					}
				}
				else if(a==']') {
					if(b.peek().equals("["))
						b.pop();
					else {
						can = false;
						break;
					}
				}
			}
			if(!can)ans="no";
			System.out.println(ans);
			b.clear();
		}


	}

}

