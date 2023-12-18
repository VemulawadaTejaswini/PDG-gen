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

		int sqa = (int)(Math.sqrt(a) *100);
		int sqb = (int)(Math.sqrt(b) *100);
		int sqc = (int)(Math.sqrt(c) *100);
		if(sqa + sqb < sqc)
			ans = "Yes";

		System.out.println(ans);

	}

}