import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = 0;

		for (int i = a; i <= b; i++) {//a～b間で数字を増やす
			if (i < b && c % i != 0) {//iがb以下で約数でもない

			} else if ((c % i == 0)) {//cの約数
				x++;

			} else if (i == b) {//bまで行ったら脱出

			}

		}
		System.out.println(x);

	}

}

