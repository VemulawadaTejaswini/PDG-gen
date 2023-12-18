import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		if (s.length() % 2 == 0) {
			System.out.println("No");
		} else {
			String p = "";
			String q = "";
			for (int i = 0; i < s.length() / 2; i++) {
				p += s.charAt(i);
				q += s.charAt(s.length() - i - 1);
			}
			String r = "";
			for (int i = 0; i < q.length(); i++) {
				r += q.charAt(q.length() - i -1);
			}
			if (p.equals(r)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		kb.close();
	}

}
