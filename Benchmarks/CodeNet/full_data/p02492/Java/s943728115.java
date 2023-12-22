import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int x = scan.nextInt();
			String z = scan.next();
			int y = scan.nextInt();
			if(z.equals("?")) break;
			
			switch (z) {
			case "+":
				System.out.println((x + y));
				break;
			case "-":
				System.out.println((x - y));
				break;
			case "*":
				System.out.println((x * y));
				break;
			case "/":
				System.out.println((x / y));
				break;
			default:
				break;
			}
		}
	}
}