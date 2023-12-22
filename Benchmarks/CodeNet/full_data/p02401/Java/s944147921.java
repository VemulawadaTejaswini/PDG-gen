import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		for(;;){
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();

			if(op.equals("?"))
				break;

			System.out.println(!op.equals("+") ? !op.equals("-") ? !op.equals("*") ? a/b : a*b : a-b : a+b);
		}
	}
}

