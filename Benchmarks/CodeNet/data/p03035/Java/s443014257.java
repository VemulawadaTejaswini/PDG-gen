import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		if(A >= 13) {
			System.out.println(B);
		}else if(A >= 6 && A <= 12) {
			System.out.println(B/2);
		}else {
			System.out.println(0);
		}
	}
}