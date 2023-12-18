import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private void mark(int[][] card, int v) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (card[i][j] == v) {
                    card[i][j] = 0;
                }
            }
        }
    }

    private void bingo() {
        System.out.println("Yes");
        System.exit(0);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int[][] card = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                card[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt();
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
            mark(card, b[i]);
        }

        // horizontal check
        for (int i = 0; i < 3; i++) {
            if (card[i][0] == 0 && card[i][1] == 0 && card[i][2] == 0) bingo();
        }

        // vertical check
        for (int j = 0; j < 3; j++) {
            if (card[0][j] == 0 && card[1][j] == 0 && card[2][j] == 0) bingo();
        }

        if (card[0][0] == 0 && card[1][1] == 0 && card[2][2] == 0) bingo();
        if (card[0][2] == 0 && card[1][1] == 0 && card[2][0] == 0) bingo();

        System.out.println("No");

        return;
    }

}
o