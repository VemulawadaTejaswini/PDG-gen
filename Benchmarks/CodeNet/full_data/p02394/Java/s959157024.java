import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		sc.close();


		// はみ出しフラグ
		Boolean isOver = false;
		// 円の左チェック
		if(x-r < 0) isOver = true;
		// 円の下チェック
		if(y-r < 0) isOver = true;
		// 円の右チェック
		if(x+r > w) isOver = true;
		// 円の上チェック
		if(y+r > h) isOver = true;

		if(isOver) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}



	}

}
