import java.util.*;

public class X_Cubic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int x = scan.nextInt();
			if ((x >= 100) || (x <= 0))
 				System.exit(0);
			x = x*x*x;
			System.out.println("" + x + "");
		} catch (InputMismatchException e) {
			System.out.println("??¨??????");
		}
	}
}