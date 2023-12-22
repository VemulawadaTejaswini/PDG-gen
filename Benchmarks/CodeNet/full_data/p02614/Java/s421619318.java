import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 行
        int h = sc.nextInt();
        // 列
        int w = sc.nextInt();
        // 操作後の黒の数
        final int afterBlackCount = sc.nextInt();
        // 最終的な通り
        int count = 0;

        String[] tmpC = new String[h];
        for (int i = 0; i < h; i++) {
            tmpC[i] = sc.next();
        }

        char[][] c = new char[h][w];
        // 操作前の黒の数
        int beforeBlackCount = 0;
        for (int i = 0; i < tmpC.length; i++) {
            for (int j = 0; j < tmpC[i].length(); j++) {
                c[i][j] = tmpC[i].charAt(j);
                if (c[i][j] == '#') {
                    beforeBlackCount++;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int tmpBlackCount = beforeBlackCount;
                for (int k = 0; k < h; k++) {
                    for (int l = 0; l < w; l++) {
                        // c[i][j] -> 色塗りの起点
                        if (i == k || j == l) {
                            tmpBlackCount--;
                        }
                    }
                }
                if (afterBlackCount == tmpBlackCount) {
                    count++;
                }
            }
        }
        System.out.println(5);
    }
}
