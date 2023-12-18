import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		a = b - a;
		a = (1 + a) / 2 * a;
		a = a -b;
		if (a>=1) {
			System.out.println(a);
		}
		else {
			System.out.println(1);
		}
		
		
	}
}
