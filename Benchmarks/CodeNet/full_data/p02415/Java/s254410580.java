import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				if (Character.isUpperCase(s.charAt(i)))
					System.out.print(Character.toLowerCase(s.charAt(i)));
				else if (Character.isLowerCase(s.charAt(i)))
					System.out.print(Character.toUpperCase(s.charAt(i)));
				else
					System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
		System.out.println("");
	}

}