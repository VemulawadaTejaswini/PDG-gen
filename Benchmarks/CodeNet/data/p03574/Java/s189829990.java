import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
        int[][] counts = new int[h][w];
      
        for(int i = 0; i < h; i++) {
          // 文字列の入力
		  String[] s = sc.next().split("");
          for(int i2 = 0; i2 < w; i2++) {
            if (s[i2].equals("#")) {
              // 本体
              counts[i][i2] = -9;
              // 前
              if (i != 0) {
                counts[i - 1][i2]++;
              }
              // 後
              if (i != h - 1) {
                counts[i + 1][i2]++;
              }
              // 左
              if (i2 != 0) {
                counts[i][i2 - 1]++;
                // 前
                if (i != 0) {
                  counts[i - 1][i2 - 1]++;
                }
                // 後
                if (i != h - 1) {
                  counts[i + 1][i2 - 1]++;
                }
              }
              // 右
              if (i2 != w - 1) {
                counts[i][i2 + 1]++;
                // 前
                if (i != 0) {
                  counts[i - 1][i2 + 1]++;
                }
                // 後
                if (i != h - 1) {
                  counts[i + 1][i2 + 1]++;
                }
              }
            }
          }
        }
        for (int i = 0; i < h; i++) {
          String ans = "";
          StringBuilder builder = new StringBuilder();
          for (int i2 = 0; i2 < w; i2++) {
            int value = counts[i][i2];
            builder.append(value >= 0 ? value : "#");
          }
          // 出力
		  System.out.println(new String(builder));
        }
	}
}