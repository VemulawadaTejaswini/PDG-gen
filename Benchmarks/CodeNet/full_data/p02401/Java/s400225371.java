import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			
			if ("+".equals(op)) {
				System.out.println(a + b);
			} else if ("-".equals(op)) {
				System.out.println(a - b);
			} else if ("*".equals(op)) {
				System.out.println(a * b);
			} else if ("/".equals(op)) {
				System.out.println(a / b);
			} else {
				break;
			}
		}
	}
}
