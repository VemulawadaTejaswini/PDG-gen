import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int xs, xg, ys, yg;
	void run() {
		Scanner sc = new Scanner(System.in);
		xs = ys = 0;
		xg = sc.nextInt();
		yg = sc.nextInt();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			switch(sc.nextInt()) {
			case 1 :
				xg = x;
				break;
			case 2 :
				xs = x;
				break;
			case 3 :
				yg = y;
				break;
			case 4 :
				ys = y;
			}
		}
		int area = (xg - xs) * (yg - ys);
		System.out.println(area);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}