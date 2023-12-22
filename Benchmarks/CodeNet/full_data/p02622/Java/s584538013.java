import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();
		char[] s = new char[S.length()];
		char[] t = new char[T.length()];
		int a = 0;

		for(int i = 0;i<S.length();i++) {
			s[i] = S.charAt(i);
			t[i] = T.charAt(i);
			if(s[i]!=t[i]) {
				a++;
			}
		}
		System.out.println(a);
	}

}
