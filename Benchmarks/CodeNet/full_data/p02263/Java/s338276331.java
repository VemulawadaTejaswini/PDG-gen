import java.util.*;

public class Main {
	
	public static int computePolish(String in) {
		Stack<Integer> polishStack= new Stack<Integer>();
		Scanner scan = new Scanner(in);
		
		while(scan.hasNext()) {
			String current = scan.next();
			
			switch(current) {
			case "*":
				
				int mult1 = polishStack.pop();
				int mult2 = polishStack.pop();
				polishStack.push(mult1*mult2);
				break;
			case "+":
				
				int plus1 = polishStack.pop();
				int plus2 = polishStack.pop();
				polishStack.push(plus1+plus2);
				break;
			case "-":
				
				int subt1 = polishStack.pop();
				int subt2 = polishStack.pop();
				polishStack.push(subt2-subt1);
				break;
			default:
				polishStack.push(Integer.parseInt(current));
				break;
			}
		}
		
		return polishStack.pop();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(computePolish(scan.nextLine()));
		
		
	}
}
