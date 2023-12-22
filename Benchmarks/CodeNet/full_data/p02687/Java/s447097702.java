import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String S = keyboard.next();
		String ans = "ABC";
		if(S.equals("ABC")){
			ans = "ARC";
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
