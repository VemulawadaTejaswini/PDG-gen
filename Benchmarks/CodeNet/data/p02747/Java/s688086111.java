import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		S = S.replace("hi", "");
		int ans = S.length();

		if(ans==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}
}
