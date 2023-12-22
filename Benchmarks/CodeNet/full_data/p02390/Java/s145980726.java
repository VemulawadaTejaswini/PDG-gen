import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 秒単位の時間 S が与えられるので、h:m:s の形式へ変換して出力してください。ここで、h は時間、m は 60 未満の分、s は 60 未満の秒とします。
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int m = 0;
		int h = 0;
		while (s < 60) {
			if (m == 60) {
				h++;
			} else {
				m++;
				s -= 60;
			}
		}
		System.out.println(h + ":" + m + ":" + s);
	}
}