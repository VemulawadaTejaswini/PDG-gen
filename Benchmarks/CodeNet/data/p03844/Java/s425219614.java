import java.util.Scanner;

public class AddSubtract {
	
	public static void main(String[] args) {
		// scanner to read
		final Scanner scan = new Scanner(System.in);
		// variables
		int A = scan.nextInt();
		int B = scan.nextInt();
		String op = scan.next();
		
		//the works baby
		if (op.equals("-")){
			System.out.println(A-B);
		}
		System.out.println(A+B);
	}

}
