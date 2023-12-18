import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String ans = "No";

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c))
			ans = "Yes";

		System.out.println(ans);

	}

}
