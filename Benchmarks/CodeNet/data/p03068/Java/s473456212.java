import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		String s = sc1.next();
		int k = sc1.nextInt();

		char x = s.charAt(k-1);

		for ( int i = 0 ; i < n ; i++) {
			if ( s.charAt(i) != x && s.charAt(i) != '*' ) {
				s = s.replace(s.charAt(i), '*');
			}
		}

		System.out.println(s);

		sc1.close();

	}

}