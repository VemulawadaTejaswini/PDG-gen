import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		String s = scan.next();

		if((s.charAt(2) == s.charAt(3)) && (s.charAt(4) == s.charAt(5))) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}
