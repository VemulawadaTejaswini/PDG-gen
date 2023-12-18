import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String S = keyboard.next();
		String T = keyboard.next();
		
		String ans = "Yes"; 
		for(int x=0; x<S.length(); x++) {
			if(S.charAt(x) != T.charAt(x))
			ans = "No";
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
