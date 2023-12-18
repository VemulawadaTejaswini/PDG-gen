import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
        int[][] loc = new int[m][2];
        int[][] ques = new int[q][2];
        int[][] count2 = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            loc[i][0] = sc.nextInt();
            loc[i][1] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            ques[i][0] = sc.nextInt();
            ques[i][1] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            count2[loc[i][0]][loc[i][1]]++;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                count2[i][j] = count2[i][j] + count2[i][j - 1] + count2[i - 1][j] - count2[i - 1][j - 1];
            }
        }
        for (int i = 0; i < q; i++) {
            int ans = count2[ques[i][1]][ques[i][1]]
                      - count2[ques[i][1]][ques[i][0] - 1] - count2[ques[i][0] - 1][ques[i][1]]
                      + count2[ques[i][0] - 1][ques[i][0] - 1];
            System.out.println(ans);
        }
    }
}
