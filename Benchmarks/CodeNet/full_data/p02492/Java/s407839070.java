import java.util.Scanner;



public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int x, y;

		String str;

		char op;

		double answer;

		boolean flag = true;

		while(flag){



			x = sc.nextInt();

			str = sc.next();

			op = str.charAt(0);

			y = sc.nextInt();



			switch(op){

			case '+':

				answer = x + y;

				System.out.println((int)answer);

				break;

			case '-':

				answer = x - y;

				System.out.println((int)answer);

				break;

			case '*':

				answer = x * y;

				System.out.println((int)answer);

				break;

			case '/':

				answer = (double)x / y;

				System.out.println(answer);

				break;

			case '?':

				flag = false;

				break;

			default:

				System.out.println("????????¬????????????+, -, *, /????????§???");

				break;

			}

		}

	}

}