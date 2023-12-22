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
        
        int[][] steps = new int[H + 1][W];
        
        for (int i = 1; i <= H; i++) {
            if (cannotDown[i - 1][0]) {
                steps[i][0] = Integer.MAX_VALUE;
            } else if (steps[i - 1][0] == Integer.MAX_VALUE) {
                steps[i][0] = Integer.MAX_VALUE;
            } else {
                steps[i][0] = steps[i - 1][0] + 1;
            }
            
            for (int j = 1; j < W; j++) {
                int left = steps[i][j - 1];
                int upper = cannotDown[i - 1][j] ? Integer.MAX_VALUE : steps[i - 1][j];
                steps[i][j] = Math.min(left, upper);
                if (steps[i][j] < Integer.MAX_VALUE) {
                    steps[i][j]++;
                }
            }
        }
        
        for (int i = 1; i <= H; i++) {
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
