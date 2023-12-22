import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();

		// 時間
		int hour = time / 60 / 60;
		// 分
		int minutes = time / 60 % 60;
		// 秒
		int sec = time % 60;

		System.out.println(hour + ":" + minutes + ":" + sec);

	}

}

