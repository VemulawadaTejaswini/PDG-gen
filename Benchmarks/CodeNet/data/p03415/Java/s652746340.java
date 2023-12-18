import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[] w = new int[100010];
    static int[] v = new int[100010];
    static int[][] dp = new int[110][100010];
    static int k;

    static int chmin(int a, int b) {
        if (a > b) {
            a = b;
            return a;
        }
        return a;
    }

    static int chmax(int a, int b) {
        if (a < b) {
            a = b;
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] s = new char[3][3];
        char[] ans = new char[3];
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s[i][j] = sc.nextInt();
                if (i == j) {
                    ans[c] = s[i][j];
                    c++;
                }

            }

        }
        for (int i = 0; i < 3; i++)
            System.out.println(ans[i]);
    }
}
