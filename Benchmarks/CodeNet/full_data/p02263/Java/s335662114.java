import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int top = 0;
		String s;
		int stack[] = new int[101];
		
		while (scan.hasNext()) {
			s = scan.next();
			
			if (isNum(s)) {
				stack[top + 1] = Integer.parseInt(s);
				top++;
			} else if (top >= 2) {
				switch (s) {
				case "+":
					stack[top - 1] = stack[top - 1] + stack[top];
					top--;
					break;
				case "-":
					stack[top - 1] = stack[top - 1] - stack[top];
					top--;
					break;
				case "*":
					stack[top - 1] = stack[top - 1] * stack[top];
					top--;
					break;
				default:
					break;
				}
			}
		}
		scan.close();
		System.out.println(stack[top]);
		
	}
	
	public static boolean isNum( String str) {
		java.util.regex.Pattern pattern 
		= java.util.regex.Pattern.compile("^[0-9]*$");
		java.util.regex.Matcher matcher
		= pattern.matcher(str);
		
		return matcher.matches();
	}
}

