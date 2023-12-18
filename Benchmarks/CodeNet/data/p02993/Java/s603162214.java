import static java.lang.System.*;
import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	String s = sc.next();
		int count =0;
		for (int i = 1; i < 4; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				System.out.println("Bad");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Good");
		}

	}

}
