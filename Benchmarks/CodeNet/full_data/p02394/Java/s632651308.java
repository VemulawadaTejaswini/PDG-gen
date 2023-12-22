import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

            // 空白で分割して変数を定義

			// 長方形の変数
            int W = scanner.nextInt();

            int H = scanner.nextInt();

            // 円の変数（座標、半径）
            int x = scanner.nextInt();

            int y = scanner.nextInt();

            int r = scanner.nextInt();

            // 円の座標と半径の計算
            int xr1 = x + r;
            int xr2 = x - r;
            int yr1 = y + r;
            int yr2 = y - r;

            if (W < xr1 || xr2 < 0) {
            	System.out.println("No");
            } else if (H < yr1 || yr2 < 0) {
            	System.out.println("No");
            } else {
            	System.out.println("Yes");
            }
	}
}

