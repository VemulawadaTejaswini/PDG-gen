import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        
        final int[][] cannotDown = new int[H][2];
        
        for (int i = 0; i < H; i++) {
            cannotDown[i][0] = sc.nextInt() - 1;
            cannotDown[i][1] = sc.nextInt() - 1;
        }
        
        int[] from = IntStream.range(0, W).toArray();
        
        for (int i = 0; i < H; i++) {
            int left = cannotDown[i][0];
            int right = cannotDown[i][1];
            int r = -1;
            
            for (int j = left; j <= right; j++) {
                if (0 <= from[j]) {
                    r = from[j];
                    from[j] = -1;
                }
            }
            if (right < W - 1) {
                if (from[right + 1] < r) {
                    from[right + 1] = r;
                }
            }
            
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < W; j++) {
                if (from[j] < 0) {
                    continue;
                }
                int gap = j - from[j];
                if (gap < min) {
                    min = gap;
                }
            }
            
            System.out.println(min == Integer.MAX_VALUE ? -1 : min + i + 1);
        }
    }
}
