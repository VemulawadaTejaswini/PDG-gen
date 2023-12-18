import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String o = s.nextLine();
		String e = s.nextLine();
		int o1 = o.length();
		int e1 = e.length();
		int i = 0;

		String ki = "";
		String gu = "";
		String ans = "";

		for (i = 0; i < e1; i++) {

			ki = o.charAt(i) + "";

			gu = e.charAt(i) + "";

			ans = ans + ki + gu;
		}
		if (o1 - e1 == 1) {
			System.out.println(ans + o.charAt(o1 - 1));
		} else {
			System.out.println(ans);
		}

	}

}