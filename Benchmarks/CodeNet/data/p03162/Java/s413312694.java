import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] happiness = new int[n][3];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 3; ++j) {
                happiness[i][j] = scan.nextInt();
            }
        }

        int ans = 0, previous = -1;
        for (int i = 0; i < n; ++i) {
            if (previous == 0) {
                if (happiness[i][1] >= happiness[i][2]) {
                    ans += happiness[i][1];
                    previous = 1;
                } else {
                    ans += happiness[i][2];
                    previous = 2;
                }
            } else if (previous == 1) {
                if (happiness[i][0] >= happiness[i][2]) {
                    ans += happiness[i][0];
                    previous = 0;
                } else {
                    ans += happiness[i][2];
                    previous = 2;
                }
            } else if (previous == 2) {
                if (happiness[i][0] >= happiness[i][1]) {
                    ans += happiness[i][0];
                    previous = 0;
                } else {
                    ans += happiness[i][1];
                    previous = 1;
                }
            } else {
                ans = Math.max(happiness[i][0], Math.max(happiness[i][1], happiness[i][2]));
                if (ans == happiness[i][0]) previous = 0;
                if (ans == happiness[i][1]) previous = 1;
                if (ans == happiness[i][2]) previous = 2;
            }
        }

        System.out.println(ans);
    }
}
