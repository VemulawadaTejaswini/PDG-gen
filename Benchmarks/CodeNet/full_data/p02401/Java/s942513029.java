import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int a;
		int b;
		String op;
		char ca;
		
		a = stdin.nextInt();
		b = stdin.nextInt();
		op = stdin.next();
		ca = op.charAt(0);
		
		switch(ca) {
		case '+':
			System.out.println(a + b);
			break;
		
		case '-':
			System.out.println(a - b);
			break;
			
		case '*':
			System.out.println(a * b);
			break;
		
		case '/':
			if (b != 0) {
				System.out.println(a / b);
				break;
			}	
		return;
		}
		
	}

}