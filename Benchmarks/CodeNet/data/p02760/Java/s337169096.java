import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] bingoPosList = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8},
                {0, 4, 8},
                {2, 4, 6}
        };

        int[] board = new int[9];
        for (int i = 0; i < 9; i++) {
            board[i] = in.nextInt();
        }
        boolean[] checked = new boolean[9];
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            for (int j = 0; j < 9; j++) {
                if (x == board[j]) checked[j] = true;
            }
        }
        boolean res = false;
        for (int[] triple : bingoPosList) {
            boolean ok = true;
            for (int num : triple) {
                if (!checked[num]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                res = true;
                break;
            }
        }

        System.out.println(res ? "Yes" : "No");
    }
}
