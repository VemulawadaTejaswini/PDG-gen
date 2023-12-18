import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String r = "AAA";
		String z = "BBB";
		if (s.equals(r) || s.contentEquals(z)) {
			System.out.println("NO");

		}else {
			System.out.println("YES");
		}
	}
}
