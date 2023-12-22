import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		String S = a.next();
		String T = a.next();
		String str = S + "[a-z]";
		
		if(T.matches(S + "[a-z]")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}