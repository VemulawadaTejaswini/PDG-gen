import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int a = scane.nextInt();
		String str = scane.next();
		int b = scane.nextInt();
		boolean judge =true;

		while (judge) {
		switch (str) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println((int)(a/b));
			break;
		case "?":
			judge = false;
			break;

		}
		}


	}
}