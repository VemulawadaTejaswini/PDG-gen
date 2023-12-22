import java.util.*;
public class Main {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        String[][] c = new String[h][w];

        for (int row = 0; row < h; row++) {
            for (int col = 0; col < w; col++) {
                c[row][col] = sc.next();
            }
        }
        sc.close();
        for (int i = 0; i < h; h++) {
            for (int j = 0; j < w; j++) {
                sum = sum + equalK(c, h, w, k, i, j);
            }
        }
        System.out.println(String.valueOf(sum));
    }

    public static int equalK (String[][] c, int h, int w, int k, int i,int j) {
        int sum = 0;
        //列を赤く塗る
        for (int col = 0; col < h; col++) {
            c[col][j] = "red";
        }
        //行を赤く塗る
        for (int row = 0; row < w; row++) {
            c[i][row] = "red";

        }

        //黒を数える
        for (int row = 0; row < h; row++) {
            for (int col = 0; col < w; col++) {
                if (c[row][col] == "#") sum = sum + 1;
            }
        }
        if (sum == k){
            return 1;
        } else {
            return 0;
    }
    }
}