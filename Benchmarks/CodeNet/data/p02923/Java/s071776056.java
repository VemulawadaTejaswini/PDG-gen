import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int[] move = new int[n-1];
        int tmp = 0;
        for (int i = 0; i < n-1; i++) {
            if (heights[i] >= heights[i+1]) {
                tmp++;
                move[i] = tmp;
            } else {
                tmp = 0;
                move[i] = tmp;
            }
        }

        int max = 0;
        for (int i = 0; i < move.length; i++) {
            max = Math.max(max, move[i]);
        }

        System.out.println(max);

    }
}
