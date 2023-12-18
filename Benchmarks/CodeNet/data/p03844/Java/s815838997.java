import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		String op = scan.next();
		int B = scan.nextInt();
		int result = 0;

		if(op.equals("+")){
			result = A + B;
			System.out.println(result);
		}else if(op.equals("-")){
			result = A - B;
			System.out.println(result);
		}

	}

}
