import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int k = sc1.nextInt();
		String s = sc1.next();
		String str;

		if (k == 1) {
			str = s.toLowerCase().charAt(k-1) + s.substring(k, n);
		}
		else if ( k == n ) {
			str = s.substring(0, k-1) + s.toLowerCase().charAt(k-1);
		}
		else {
			str = s.substring(0, k-1) + s.toLowerCase().charAt(k-1) + s.substring(k, n);
		}

		System.out.println(str);

		sc1.close();

	}

}