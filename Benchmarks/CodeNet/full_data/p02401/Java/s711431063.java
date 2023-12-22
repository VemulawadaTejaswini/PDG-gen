import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		boolean flg = true;

		while(flg){

			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

			int ans = 0;

			switch(op){
				case "+":
				ans = a + b;
				System.out.println(ans);
				break;
				case "-":
				ans = a - b;
				System.out.println(ans);
				break;
				case "*":
				ans = a * b;
				System.out.println(ans);
				break;
				case "/":
				ans = a / b;
				System.out.println(ans);
				break;
				default:
				flg = false;
			}
		}
	}
}
