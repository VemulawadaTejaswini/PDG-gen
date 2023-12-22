import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int finalresult = 0;

		for(int i = 1;i <= n;i++) {
			int result = (a * i / b) - (a * (i / b));
			finalresult = Math.max(finalresult, result);
		}
		System.out.println(finalresult);
	}

}
