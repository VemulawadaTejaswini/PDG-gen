
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    char[] s1, s2;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine().toCharArray();
        s2 = sc.nextLine().toCharArray();
    }

    void solve() {
        int[][] dp = new int[s1.length+1][s2.length+1];
        for (int i = 0; i < s1.length + 1; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][0] = i;
        }
        for (int j = 0; j < s2.length + 1; j++)
            dp[0][j] = j;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int del, ins, match, rep;
                ins = dp[i-1][j] + 1;
                del = dp[i][j-1] + 1;
                rep = dp[i-1][j-1] + 1;
                if (s1[i-1] == s2[j-1])
                    match = dp[i-1][j-1];
                else
                    match = Integer.MAX_VALUE;
                int next = Math.min(Math.min(ins, del), Math.min(rep, match));
                dp[i][j] = Math.min(dp[i][j], next);
               // printArray(dp);
            }
            //printArray(dp);
        }
        System.out.println(dp[s1.length][s2.length]);
    }

    private void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == Integer.MAX_VALUE)
                    System.out.printf("INF ");
                else
                    System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}