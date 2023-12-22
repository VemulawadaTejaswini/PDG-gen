import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		simpleCalculator();

	}
	
	public static void simpleCalculator() {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			int a = Integer.parseInt(sc.next());
			char[] op = (sc.next()).toCharArray();
			int b = Integer.parseInt(sc.next());

			if (op[0] == '+') {
				System.out.println(a + b);
			} else if (op[0] == '-') {
				System.out.println(a - b);
			} else if (op[0] == '*') {
				System.out.println(a * b);
			} else if (op[0] == '/') {
				System.out.println(a / b);
			} else if (op[0] == '?') {
				break;
			}
		}
	}
	
}
