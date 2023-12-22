import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		String S = in.next();
		String T = in.next();
		
		if (T.substring(0,T.length()-1).equals(S)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
