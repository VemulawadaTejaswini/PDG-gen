import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		input:
		while(true){
			int a = sc.nextInt();
			Byte op = sc.nextByte();
			int b = sc.nextInt();

			switch(op){
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
				System.out.println(a / b);
				break;
			case '?':
				break input;
			default:
				break;
			}
		}
	}
}