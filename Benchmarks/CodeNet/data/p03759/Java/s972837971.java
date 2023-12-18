import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String str1 = s.next();
		String ans = "";
		ans = ans + " ";
		int i = 0;

		// StringBuilder sb= new StringBuilder();
		for (i = 0; i < Math.max(str.length(), str1.length()) - 1; i++) {
			char cc = str.charAt(i);
			char cf = str1.charAt(i);

			ans = ans + cc + cf;
		}
		if (str.length() > str1.length()) {
			ans = ans + str1.charAt(i - 1);
		}
		if (str.length() < str1.length()) {
			ans = ans + str.charAt(i - 1);
		}
		System.out.println(ans);
	}

}