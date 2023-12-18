import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2= sc.nextInt();

		int ippen = 0;
		int x3 = 0;
		int x4 = 0;
		int y3 = 0;
		int y4 = 0;

		if (x1 == x2) {
			if (y1 > y2) {
				ippen = y1 - y2;
				x3 = x1 + ippen;
				y3 = y2;
				x4 = x3;
				y4 = y1;
			} else {
				ippen = y2 - y1;
				x3 = x1 - ippen;
				y3 = y2;
				x4 = x3;
				y4 = y1;
			}
		} else {
			if (x1 > x2){
				ippen = x1 - x2;
				x3 = x2;
				y3 = y1 - ippen;
				x4 = x1;
				y4 = y3;
			} else {
				ippen = x2 - x1;
				x3 = x2;
				y3 = y1 + ippen;
				x4 = x2;
				y4 = y3;
			}
		}

		String ans = x3 + " " + y3 + " " + x4 + " " + y4;
		// 出力
		System.out.println(ans);
	}
}