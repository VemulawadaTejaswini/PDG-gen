import java.io.*; 
import java.util.*; 
public class Main {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		while (in.hasNext()) {
			if (in.hasNextInt()) {
				s.push(in.nextInt());
			}
			else {
				String str = in.next();
			
				if(str.equals("+")) {
					int a = s.pop();
					int b = s.pop();
					s.push(a + b);
				}
				else if(str.equals("*")) {
					int a = s.pop();
					int b = s.pop();
					s.push(a * b);
				}
				else if(str.equals("-")) {
					int a = s.pop();
					int b = s.pop();
					s.push(b - a);
				}
			}
		}
		int result = s.pop();
		System.out.println(result);
	}
}

