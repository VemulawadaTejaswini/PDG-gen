import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int T = 0;
		int X = 0;
		int Y = 0;
		boolean check = false;
		for (int i = 0; i < S; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			t -= T;
			for (int j = 0; j <= t; j++) {
				int tempX = X + t - j;
				int tempY = Y + j;
				
				if (tempX == x && tempY == y) {
					X = tempX;
					Y = tempY;
					T = t;
					check = true;
					break;
				}
				tempX = tempX % 2 == 0 ? tempX / 2 : tempX;
				tempY = tempY % 2 == 0 ? tempY / 2 : tempY;
				
				if (tempX == x && tempY == y) {
					X = tempX;
					Y = tempY;
					T = t;
					check = true;
					break;
				}
			}
			if (!check) {
				break;
			}
		}
		if (check) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}