import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		while(true){
			int a		= sc.nextInt();
			String op	= sc.nextLine();
			int b		= sc.nextInt();
			
			if ( op == "?" ) {
				break;
			}

			int calcRes = 0;
			if ( op == "+" ) {
				calcRes = a+b;

			} else if ( op == "-" ) {
				calcRes = a-b;

			} else if ( op == "*" ) {
				calcRes = a*b;

			} else if ( op == "/" ) {
				calcRes = a/b;

			}

			System.out.println( calcRes );
		}
		
	}
}