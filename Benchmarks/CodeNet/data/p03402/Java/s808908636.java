import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        A--;
        B--;
        int t = 1, y = 1;
        String S[][] = new String[100][100];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                S[i][j] = "#";
            }
        }
        for (int i = 50; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                S[i][j] = ".";
            }
        }
        while (A-- > 0) {
            S[t][y] = ".";
            y += 2;
            if (y > 100) {
                t += 2;
                y = 1;
            }
        }
        t = 51;
        y = 1;
        while (B-- > 0) {
            S[t][y] = "#";
            y += 2;
            if (y > 100) {
                t += 2;
                y = 1;
            }
        }
        System.out.println("100 100");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(S[i][j]);
            }
            System.out.println();
        }
    }

}