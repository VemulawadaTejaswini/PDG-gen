import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(true){
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();

			switch (op){
				case "+":
					System.out.println(a + b);
				case "-":
					System.out.println(a - b);
				case "*":
					System.out.println(a * b);
				case "/":
					System.out.println(a / b);
				case "%":
					System.out.println(a % b);
			}			
		}
	}
}