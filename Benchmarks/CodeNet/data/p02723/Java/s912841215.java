import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String ans[] = { "Yes", "No" };
		String s = sc.next();
		int an = 0;
		sc.close();
		an = ((s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) ? 0 : 1);
		System.out.println(ans[an]);
	}
}
