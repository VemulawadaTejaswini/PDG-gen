import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//猫の数
		int A = scanner.nextInt();
		//猫と犬の数
		int B = scanner.nextInt();
		//A+B匹の中に、猫がちょうどX匹いる
		int X = scanner.nextInt();

		int total = A + B;
		//猫と犬の総数が猫の総数以上 かつ 分かっている猫の数が猫の総数以下
		if (total >= X  && A <= X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
