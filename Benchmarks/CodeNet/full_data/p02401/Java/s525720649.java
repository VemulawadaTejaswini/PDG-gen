import java.util.Scanner;

public class Main {
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			String op = "";
			while( !(op.equals("?")) ){

				int a = sc.nextInt();
				op = sc.next();
				int b = sc.nextInt();
				if( op.equals("+")){
					System.out.println((a + b));
				}
				if( op.equals("-")){
					System.out.println((a - b));
				}
				if( op.equals("*")){
					System.out.println((a * b));
				}
				if( op.equals("/")){
					System.out.println((a / b));
				}

			}
	}

}


