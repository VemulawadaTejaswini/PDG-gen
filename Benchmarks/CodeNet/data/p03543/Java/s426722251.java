import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		boolean good = false;
		
		if ( s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) )
			good = true;
		else if ( s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3) )
			good = true;
		else
			good = false;
		
		if (good)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}