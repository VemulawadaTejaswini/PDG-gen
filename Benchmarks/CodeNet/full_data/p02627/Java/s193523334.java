import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		if((a.charAt(0) - 'a' >= 0) && (a.charAt(0) < 26)) {
			System.out.println("a");
		}else {
			System.out.println("A");
		}
	}
}