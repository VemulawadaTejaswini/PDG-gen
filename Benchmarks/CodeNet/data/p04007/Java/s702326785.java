import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] redField = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                redField[i][0] = true;
            } else {
                for (int j = 0; j < w - 1; j++) {
                    redField[i][j] = true;
                }
            }
        }
        boolean[][] blueField = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            if (i % 2 == 1) {
                blueField[i][w - 1] = true;
            } else {
                for (int j = 1; j < w; j++) {
                    blueField[i][j] = true;
                }
            }
        }
        StringBuilder blueOut = new StringBuilder();
        StringBuilder redOut = new StringBuilder();
        for (int i = 0; i < h; i++) {
            char[] arr = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (arr[j] == '#') {
                    redField[i][j] = true;
                    blueField[i][j] = true;
                }
                if (redField[i][j]) { 
                    redOut.append("#");
                } else {
                    redOut.append(".");
                }
                 if (blueField[i][j]) { 
                    blueOut.append("#");
                } else {
                    blueOut.append(".");
                }
            }
            redOut.append("\n");
            blueOut.append("\n");
        }
        System.out.println(redOut);
        System.out.print(blueOut);
    }
}
