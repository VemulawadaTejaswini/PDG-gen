import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = "";
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if ('A' <= ch && ch <= 'Z')
				ans += (char)(ch - ('A' - 'a'));
			else if ('a' <= ch && ch <= 'z')
				ans += (char)(ch + ('A' - 'a'));
			else
				ans += ch;
		}
		System.out.println(ans);
	}
}
