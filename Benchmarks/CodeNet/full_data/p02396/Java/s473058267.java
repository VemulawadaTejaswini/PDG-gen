import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//入力される整数x

		for (int i = 1; i <= 10000; i++) {//データセットの個数
			int x = sc.nextInt();

			if (x != 0) {
				System.out.println("Case " + i + ": " + x);
			} else {
				break;

			}
			
		}

	}

}

