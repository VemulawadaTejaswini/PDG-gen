import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 処理対象個数の入力
		Scanner sc = new Scanner(System.in);
		int input_t = sc.nextInt();
		int input_x = sc.nextInt();
		int input_y = sc.nextInt();
		sc.close();

		if((input_t - (input_x + input_y)) % 2 == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}


	}

}
