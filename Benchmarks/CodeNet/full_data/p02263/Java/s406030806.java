import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static int Oper(ArrayList<String> in) {
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < in.size(); i++) {
			if (!operators.contains(in.get(i))) {
				stack.push(in.get(i));
			} else {
				int y = Integer.parseInt(stack.pop());
				int x= Integer.parseInt(stack.pop());
				int action = operators.indexOf(in.get(i));
				if (action == 0) {
					stack.push(String.valueOf(x+y));
				} else if (action == 1) {
					stack.push(String.valueOf(x-y));
				} else if (action == 2) {
					stack.push(String.valueOf(x*y));
				} else if (action == 3) {
					stack.push(String.valueOf(x/y));
				}
			}
		}
		return Integer.parseInt(stack.pop());
		
	
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		ArrayList<String> ARRRAY = new ArrayList<>();
		while (scan.hasNext()) {
			ARRRAY.add(scan.next().trim());
		}
		
		System.out.println(Oper(ARRRAY));
		scan.close();
	}

}
