
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String C1 = scan.nextLine();
		String C2 = scan.nextLine();
		if(C1.substring(0, 1).equals(C2.substring(2, 3)) && C1.substring(2, 3).equals(C2.substring(0, 1)) && C1.substring(1, 2).equals(C2.substring(1, 2))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scan.close();

	}

}
