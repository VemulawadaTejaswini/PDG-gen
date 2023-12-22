import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int nn = Integer.parseInt(n.substring(n.length() - 1, n.length()));
		String[] ans = {"pon", "pon", "hon", "bon", "hon", "hon", "pon", "hon", "pon", "hon"};
		System.out.println(ans[nn]);
	}
}