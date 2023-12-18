import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int len = S.length();
		int win = 0;
		for (int i = 0; i < len; ++i) {
			if (S.charAt(i) == 'o') ++win;
		}
		if (win+15-len >= 8)System.out.println("YES");
		else System.out.println("NO");
	}
}