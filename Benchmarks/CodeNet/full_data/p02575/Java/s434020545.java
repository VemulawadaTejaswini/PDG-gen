import java.util.Scanner;

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
        
        int[] prevSteps = new int[W];
        for (int i = 0; i < H; i++) {
            int[] steps = new int[W];
            int min = Integer.MAX_VALUE;
            
            for (int j = 0; j < W; j++) {
                int upper = (cannotDown[i][0] <= j && j <= cannotDown[i][1])
                        ? Integer.MAX_VALUE
                        : prevSteps[j];
                int left = j == 0 ? Integer.MAX_VALUE : steps[j - 1];
                
                steps[j] = Math.min(upper, left);
                if (steps[j] < Integer.MAX_VALUE) {
                    steps[j]++;
                }
                if (steps[j] < min) {
                    min = steps[j];
                }
            }
            
            System.out.println(min == Integer.MAX_VALUE ? -1 : min);
            prevSteps = steps;
        }
    }
}
