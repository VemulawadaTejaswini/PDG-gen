import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
				"u", "v", "w", "x", "y", "z" };
		Scanner kb = new Scanner(System.in);
		String p = kb.next();
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(p)) {
				System.out.println(s[i + 1]);
			}
		}
		kb.close();
	}

}
