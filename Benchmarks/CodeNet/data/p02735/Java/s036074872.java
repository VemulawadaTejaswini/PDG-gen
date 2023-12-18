import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();

        int[][] kinds = new int[H][W];
        int[][] costs = new int[H][W];
        String row = sc.next();
        for (int j = 0; j < W; j++) {
            kinds[0][j] = '.' == row.charAt(j) ? 0 : 1;
            if (j == 0) {
                costs[0][0] = kinds[0][0];
            } else {
                if (kinds[0][j] == 0 || kinds[0][j] == kinds[0][j - 1]) {
                    costs[0][j] = costs[0][j - 1];
                } else {
                    costs[0][j] = costs[0][j - 1] + 1;
                }
            }
        }
        for (int i = 1; i < H; i++) {
            row = sc.next();
            for (int j = 0; j < W; j++) {
                kinds[i][j] = '.' == row.charAt(j) ? 0 : 1;
                if (j == 0) {
                    costs[i][j] = costs[i - 1][j] + (kinds[i][j] == 0 || kinds[i][j] == kinds[i - 1][j] ? 0 : 1);
                } else {
                    int rCost = costs[i - 1][j] + (kinds[i - 1][j] == kinds[i][j] || kinds[i][j] == 0 ? 0 : 1);
                    int cCost = costs[i][j - 1] + (kinds[i][j - 1] == kinds[i][j] || kinds[i][j] == 0 ? 0 : 1);
                    costs[i][j] = rCost < cCost ? rCost : cCost;
                }
            }
        }
        System.out.println(costs[H - 1][W - 1]);
    }
}