import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B;
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		B = scan.nextInt();
		
		System.out.print((B % A == 0) ? (A+B) : (B-A));
	}

}
