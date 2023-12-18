
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		String[] tmp = new String[s.length];
		// System.out.println(s);
		boolean Ncount = false;
		boolean Wcount = false;
		boolean Scount = false;
		boolean Ecount = false;
		for (int i = 0; i < s.length; i++) {
			// System.out.println(Arrays.toString(tmp));
			if (s[i] == 'N') {
				Ncount = true;
			}
			if (s[i] == 'W') {
				Wcount = true;
			}
			if (s[i] == 'S') {
				Scount = true;
			}
			if (s[i] == 'E') {
				Ecount = true;
			}
		}
		// System.out.println(Arrays.toString(tmp));
		// System.out.println("N:"+Ncount+" W:"+Wcount+" S:"+Scount+"
		// E:"+Ecount);
		if ((Wcount == Ecount) && (Ncount == Scount)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
