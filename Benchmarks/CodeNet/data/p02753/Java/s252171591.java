
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();

		if(S.equals("AAA") || S.equals("BBB")) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		scan.close();
	}
}
