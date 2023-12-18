
import java.util.Scanner;

public class Main {
	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		 arr = new int[h][w];
		//white == 0, black == 1
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			switch(a) {
			case 1:
				paint(0, h, 0, x);
				break;
			case 2:
				paint(0, h, x, w);
				break;
			case 3:
				paint(0, y, 0, w);
				break;
			case 4:
				paint(y, h, 0, w);
				break;
			}
		}
		int result = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(arr[i][j] == 0) result ++;
			}
		}
		System.out.println(result);
	}

	private static void paint(int ys, int ye, int xs, int xe) {
		for(int i = ys; i < ye; i++) {
			for(int j = xs; j < xe; j++) {
				arr[i][j] = 1;
			}
		}
	}
}
