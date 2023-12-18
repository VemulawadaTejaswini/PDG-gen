import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力A(モンスター体力)
		int a = sc.nextInt();

		//入力B(サーバルの攻撃値)
		int b = sc.nextInt();

		//モンスターの体力を0以下にする
		for (int i = 1; a > 0; i++) {

			a = a - b;

			System.out.println(i + "回目の攻撃の後のモンスターの体力は" + a + "です。");
		}

	}
}
