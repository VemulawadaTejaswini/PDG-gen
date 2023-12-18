import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 猫
		int a = sc.nextInt();

		// 猫または犬
		int b = sc.nextInt();

		// 合計
		int c = sc.nextInt();

		if((a + b) < c) {
			System.out.println("NO");
		} else if((a + b) > c) {

			System.out.println("YES");
		}
	}
}