import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String strN = sc.next();

		//"7が含まれているかの判定"
		if(strN.contains("7")) {
			System.out.println("Yes");

		}
		//含まれていない
		else {
			System.out.println("No");
		}

		sc.close();
	}

}
