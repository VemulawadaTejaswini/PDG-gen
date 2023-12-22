import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st;

		st = sc.nextLine();
		for (int i = 0; i < st.length(); i++) {
			if ('a' <= st.charAt(i) && st.charAt(i) <= 'z') {
				System.out.print((char)(st.charAt(i) + 'A' - 'a'));
			} else {
				System.out.print((char)(st.charAt(i)));
			}
		}
		System.out.println();
	}
}