
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n;
		
		if (a <= b) {
			n = a;
		} else {
			n = a - 1;
		}
		
		System.out.println(n);
	}
}
