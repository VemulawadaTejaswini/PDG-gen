import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {		
		
		/*input*/
		
		String input = cin.nextLine();
		
		/*start*/
		
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < input.length(); i ++) {
			
			char ch = input.charAt(i);
			
			if (ch == 'B') {
				if (!st.isEmpty()) {
					st.pop();
				}
			}
			
			else {
				st.push(ch);
			}				
		}
		
		
		/*finish*/
		for (char ch: st) {
			System.out.print(ch);
		}
	}
}

