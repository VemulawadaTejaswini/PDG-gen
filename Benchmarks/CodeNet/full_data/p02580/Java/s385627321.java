import java.util.*;

public class Main {
    static int h;
    static int w;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        int m = sc.nextInt();
        long[][] array = new long[h][w];
        for (int i = 0; i < m; i++) {
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            array[row][col] = 1;
        }
        // for (long[] c : array) System.out.println(Arrays.toString(c));
        // System.out.println(231);
        
        // cumsum: 累積和
        long[][] cumsum = new long[h+1][w+1];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                cumsum[i][j] = array[i-1][j-1] + cumsum[i-1][j] + cumsum[i][j-1] - cumsum[i-1][j-1];
            }
        }
        // for (long[] c : cumsum) System.out.println(Arrays.toString(c));
        
        long ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                // if (array[i][j] == 0) continue;
                
                long res = calc(cumsum, i, j, array[i][j]);
                ans = Math.max(ans, res);
                // System.out.println(res);
            }
        }
        System.out.println(ans);
    }
    
    public static long calc(long[][] cumsum, int r, int c, long self) {
        // score: 右下 - 左下 - 右上 + 左上 (包除原理)
        // System.out.println(r + " " + c);
        long score = cumsum[h][c+1] + cumsum[r+1][w] - self;
        score -= cumsum[r][w];
        score -= cumsum[h][c];
        
        return score;
//   +maxr,nowc
//   +nowr,maxc
//   -nowr-1,maxc
//   -maxr,nowc-1
//   -nowr,nowc
    }
}