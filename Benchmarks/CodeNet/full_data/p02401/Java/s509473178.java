import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean judge = true;

		do{
			int num1 = sc.nextInt();
			String op = sc.next();
			int num2 = sc.nextInt();

			if(op.equals("+")){
				System.out.println(num1 + num2);
			}else if(op.equals("-")){
				System.out.println(num1 - num2);
			}else if(op.equals("*")){
				System.out.println(num1 * num2);
			}else if(op.equals("/")){
				System.out.println((int)num1 / num2);
			}else {
				judge = false;
			}
		}while(judge);

	}
}
