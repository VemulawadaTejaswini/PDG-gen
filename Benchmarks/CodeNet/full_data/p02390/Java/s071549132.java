import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int second = sc.nextInt();
		sc.close();

		int h = 0,m = 0,s = 0;

		// 開始
		h = second / (60 * 60);
		m = second % (60 * 60) / 60;
		s =second % (60 * 60) % 60;


		// 終了
		System.out.println(h + ":" + m + ":" + s);
	}
}
