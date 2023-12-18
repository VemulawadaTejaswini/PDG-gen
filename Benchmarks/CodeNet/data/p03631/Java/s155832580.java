
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		boolean judge = true;
		for(int i = 0; i < N.length(); i++) {
			if(N.substring(i, i + 1).equals(N.substring(N.length() - i - 1, N.length() - i))) {
				
			} else {
				judge = false;
				break;
			}
		}
		if(judge) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();

	}

}
