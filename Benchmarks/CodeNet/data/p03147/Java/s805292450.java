
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println(minWateringMoves(heights));
    }

    static int minWateringMoves(int... heights) {
        int moves = heights[0];
        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - heights[i - 1];
            if (diff > 0) {
                moves += diff;
            }
        }
        return moves;
    }

}
