import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		scan.close();

		int A = num / 2;
		int B = num % 2 == 1 ? A + 1 : A;
		
		System.out.print(A * B);
	}
}
