import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		Stack<Stack<Integer>> st = new Stack<>();
		
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			st.add(new Stack<Integer>());
		}
		
		int count = scan.nextInt();
		
		for(int i=0; i<count; i++) {
			int query = scan.nextInt();
			int a = scan.nextInt();

			switch(query) {
			
			case 0:
				int b = scan.nextInt();
				st.get(a).push(b);
				break;
				
			case 1:
				if(!st.get(a).isEmpty())
				System.out.println(st.get(a).peek());
				
				break;
				
			case 2:
				if(!st.get(a).isEmpty())
				st.get(a).pop();
				
				break;
			}
		}
	}
}

