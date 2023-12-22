import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        
        final boolean[][] cannotDown = new boolean[H][W];
        
        for (int i = 0; i < H; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            
            for (int j = a; j <= b; j++) {
                cannotDown[i][j] = true;
            }
        }
        
        int[][] steps = new int[H][W];
        
        // 左上
        steps[0][0] = cannotDown[0][0] ? Integer.MAX_VALUE : 1;
        
        // 1行目
        for (int j = 1; j < W; j++) {
            int left = steps[0][j - 1];
            int upper = cannotDown[0][j] ? Integer.MAX_VALUE : 0;
            steps[0][j] = Math.min(left, upper);
            if (steps[0][j] < Integer.MAX_VALUE) {
                steps[0][j]++;
            }
        }
        
        // 2行目以降
        for (int i = 1; i < H; i++) {
            {
                int upper = cannotDown[i][0] ? Integer.MAX_VALUE : steps[i - 1][0];
                steps[i][0] = upper;
                if (steps[i][0] < Integer.MAX_VALUE) {
                    steps[i][0]++;
                }
            }
            
            for (int j = 1; j < W; j++) {
                int left = steps[i][j - 1];
                int upper = cannotDown[i][j] ? Integer.MAX_VALUE : steps[i - 1][j];
                steps[i][j] = Math.min(left, upper);
                if (steps[i][j] < Integer.MAX_VALUE) {
                    steps[i][j]++;
                }
            }
        }
        
        for (int i = 0; i < H; i++) {
            int min = min(steps[i]);
            System.out.println(min == Integer.MAX_VALUE ? -1 : min);
        }
    }
    
    private static int min(int[] vals) {
        int min = Integer.MAX_VALUE;
        for (int v : vals) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}
