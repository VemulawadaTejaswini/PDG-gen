import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int [] [] arrayXY = new int [w] [h];
		int count = 0;

		//白い部分を0とする
		for (int i = 0; i < w; i++) {
			for(int j = 0; j < h; j++) {
				arrayXY[i][j] = 0;
			}
		}

		for (int k = 0; k < n; k++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int N = sc.nextInt();

			switch (N) { //塗りつぶしたときの値は１
			case 1 : //ｘょり左側を塗りつぶす
				for(int i = 0; i < x; i++) {
					for(int j = 0; j < h; j++) {
						arrayXY[i][j] = 1;
					}
				}
				break;
			case 2 : //xより右側を塗りつぶす
				for(int i = x ; i < w; i++) {
					for(int j = 0; j < h; j++) {
						arrayXY[i][j] = 1;
					}
				}
				break;
			case 3 : //yより下側を塗りつぶす
				for(int i = 0; i < w; i++) {
					for(int j = 0; j < y; j++) {
						arrayXY[i][j] = 1;
					}
				}
				break;
			case 4 : //yより上側を塗りつぶす
				for(int i = 0; i < w; i++) {
					for(int j = y; j < h; j++) {
						arrayXY[i][j] = 1;
					}
				}
			}
		}
		for (int i = 0; i < w; i++) {
			for(int j = 0; j < h; j++) {
				if (arrayXY[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
