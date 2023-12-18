
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);

		int ans = sc.nextInt();
		if(ans <= 81 && (ans%2 <= 9)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}