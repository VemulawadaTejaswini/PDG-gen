import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int h = 0;
    static int w = 0;
    static int k = 0;
    static int[][] c = null; // 各マスの色。0は黒。1は白or赤
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        h = in.nextInt();
        w = in.nextInt();
        k = in.nextInt();
        c = new int[h][w];
        for(int i=0; i<h; i++) {
            String line = in.next();
            for(int j=0; j<w; j++) {
                int color = 0;
                if(line.charAt(j) == '.') {
                    color = 1;
                }
                c[i][j] = color;
            }
        }
        int max = 1<<(h+w);
        int ans = 0;
        for(int i=0; i<max; i++) {
            if(equalsToK(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
    private static boolean equalsToK(int pattern) {
        // patternのビットの低い方から順に、列の右側から左側へ、そして行の下から上へと並んでいる。
        // ビットが1なら「操作」をする
        int[][] c2 = copyC();
        for(int i=0; i<(h+w); i++) {
            int doIt = pattern & (1<<i);
            if(doIt > 0) {
                if(i<w) {
                    // 列の塗り潰し
                    int col = i;
                    for(int row=0; row<h; row++) {
                        c2[row][col] = 1;
                    }
                }
                else {
                    // 行の塗り潰し
                    int row = i-w;
                    for(int col=0; col<w; col++) {
                        c2[row][col] = 1;
                    }
                }
            }
        }
        int count = 0;
        for(int row=0; row<h; row++) {
            for(int col=0; col<w; col++) {
                if(c2[row][col]==0) {
                    count++;
                }
            }
        }
        return (count==k);
    }
    private static int[][] copyC() {
        int[][] result = new int[h][w];
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                result[i][j] = c[i][j];
            }
        }
        return result;
    }
}
