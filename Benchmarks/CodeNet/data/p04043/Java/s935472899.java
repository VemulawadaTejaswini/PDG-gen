import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		String result = " ";

		if (A == 5 && B == 7 && C == 5 ) {
			result = "YES" ;
		} else if (A == 5 && B == 5 && C == 7) {
			result = "YES" ;
		}else if (A == 7 && B == 5 && C == 5) {
			result = "YES" ;
		}else {
			result = "NO" ;
		}

		System.out.println(result);
	}
}