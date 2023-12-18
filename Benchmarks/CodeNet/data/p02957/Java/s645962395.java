import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int k = scan.nextInt();

		while(0 <= a || b <= (int)Math.pow(10,9)){
		if(a-k == b-k) {
			System.out.println(k);

		}
		}
			System.out.println("IMPOSSIBLE");


	}
}