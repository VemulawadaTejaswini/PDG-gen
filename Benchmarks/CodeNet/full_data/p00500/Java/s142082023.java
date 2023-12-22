import java.util.*;

public class Main {
    private static final int GAME = 3;
    private static final int MAX  = 200 + 1;

    public static void main(String[] args) {
        int[][] count = new int[MAX][GAME];

        try(Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int[][] nums = new int[n][GAME];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < GAME; j++) {
                    int num = scn.nextInt();
                    nums[i][j] = num;
                    count[num][j]++;
                }
            }

            int[] scores = new int[n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < GAME; j++) {
                    int num = nums[i][j];
                    if(count[num][j] < 2) {
                        scores[i] += num;
                    }
                }
            }

            for(int score : scores) {
                System.out.println(score);
            }
        }
    }
}