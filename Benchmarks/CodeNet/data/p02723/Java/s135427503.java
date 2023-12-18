import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String a = str.substring(2, 3);
		String b = str.substring(3, 4);
		String c = str.substring(4, 5);
		String d = str.substring(5, 6);
		if(a.equals(b) && c.equals(d)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
