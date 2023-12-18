
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		if(N.substring(0, 1).equals(N.substring(1, 2)) && N.substring(1, 2).equals(N.substring(2, 3))) {
			System.out.println("Yes");
		} else if(N.substring(1, 2).equals(N.substring(2, 3)) && N.substring(2, 3).equals(N.substring(3, 4))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();

	}

}
