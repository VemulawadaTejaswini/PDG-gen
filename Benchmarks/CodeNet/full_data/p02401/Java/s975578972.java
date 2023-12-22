import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc=null;
		boolean con = true;
		while (con) {
			sc = new Scanner(System.in);
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			switch (op) {
			case "+": {
				System.out.println(a + b);
				break;
			}
			case "-": {
				System.out.println(a - b);
				break;
			}
			case "*": {
				System.out.println(a * b);
				break;
			}
			case "/": {
				System.out.println(a / b);
				break;
			}
			case "?":
				{
				con = false;break;}
			default:
				continue;
			}
		}sc.close();

	}
}