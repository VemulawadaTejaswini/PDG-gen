import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int[][] bingo = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for (int k = 0; k < N; k++) {
            int num = sc.nextInt();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (num == bingo[i][j]) {
                        bingo[i][j] = -1;
                    }
                }
            }
        }
        boolean ok = false;
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += bingo[i][j];
            }
            if (sum == -3) {
                ok = true;
            }
        }
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += bingo[j][i];
            }
            if (sum == -3) {
                ok = true;
            }
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < 3; j++) {
            sum1 += bingo[j][j];
            sum2 += bingo[j][2 - j];
        }
        if (sum1 == -3) {
            ok = true;
        }
        if (sum2 == -3) {
            ok = true;
        }
        System.out.println(ok ? "Yes" : "No");
    }

    public static void main(String[] args) {
        new Main();
    }
}
