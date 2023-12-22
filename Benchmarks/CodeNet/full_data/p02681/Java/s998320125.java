import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String S = stdIn.nextLine();
		String T = stdIn.nextLine();
		
		if(S.length() + 1 == T.length() && S.equals(T.substring(0, S.length()))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}