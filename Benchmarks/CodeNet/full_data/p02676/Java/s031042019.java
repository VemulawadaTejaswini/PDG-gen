import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int K = scanner.nextInt();
		String S = scanner.next();
		int num = S.length();
		
		String x ="";
		
		if (num <= K) {
			
			System.out.println(S);
			
		} else {
			System.out.println(S.substring(0, K) + "...");
		}

	}

}