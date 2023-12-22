
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		
		
		if(b * d < 0 && a * c < 0) {
			if(a * d > b * c) {
				System.out.println(a * d);
			} else {
				System.out.println(b * c);
			}
		}	else if(b * d >= a * c) {
			System.out.println(b * d);
		}   else {
			System.out.println(a * c);
		}
	}
}

