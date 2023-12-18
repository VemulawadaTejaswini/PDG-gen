
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		double T = sc.nextDouble();

		int seconds = (int)((T + 0.5) / A);
		int ans = B * seconds;

		System.out.println(ans);
	}

}
