import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		String message = "No";
		int a_b = a - b;
		int a_c = a - c;
		int b_c = b - c;
		if(a_b < 0) {
			a_b = a_b * (-1);
		}
		if(a_c < 0) {
			a_c = a_c * (-1);
		}
		if(b_c < 0) {
			b_c = b_c * (-1);
		}
		if(a_c <= d) {
			message = "Yes";
		} else if(a_b <= d && b_c <= d) {
			message = "Yes";
		}
		System.out.println(message);
	}
}