import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int a = scanner.nextInt();
			char op = scanner.next().charAt(0);
			int b = scanner.nextInt();
			
			if (op == '?') break;
			
			int ans;
			
			switch (op) {
			case '+':
				ans = a + b;
				break;
				
			case '-':
				ans = a - b;
				break;
			case '*':
				ans = a * b;
				break;
			case '/':
				ans = a / b;
				break;
			default:
				ans = 0;
				break;
			}
			
			System.out.println(ans);
		}

	}

}

