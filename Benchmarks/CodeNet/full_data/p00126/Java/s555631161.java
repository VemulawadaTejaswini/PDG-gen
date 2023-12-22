import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int[][] p = new int[9][9];
            boolean[][] m = new boolean[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    p[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 9; i++) {
                int c[] = new int[10];
                for (int j = 0; j < 9; j++) {
                    c[p[i][j]]++;
                }
                for (int j = 0; j < 9; j++) {
                    if (c[p[i][j]] > 1) {
                        m[i][j] = true;
                    }
                }
            }

            for (int i = 0; i < 9; i++) {
                int c[] = new int[10];
                for (int j = 0; j < 9; j++) {
                    c[p[j][i]]++;
                }
                for (int j = 0; j < 9; j++) {
                    if (c[p[j][i]] > 1) {
                        m[j][i] = true;
                    }
                }
            }
            for (int l = 0; l < 9; l += 3) {
                for (int i = 0; i < 9; i += 3) {
                    int c[] = new int[10];
                    for (int j = i; j < i + 3; j++) {
                        for (int k = l; k < l + 3; k++) {
                            c[p[j][k]]++;
                        }
                    }
                    for (int j = i; j < i + 3; j++) {
                        for (int k = l; k < l + 3; k++) {
                            if (c[p[j][k]] > 1)
                                m[j][k] = true;
                        }
                    }
                }
            }
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(m[i][j] ? "*" : " ");
                    System.out.print(p[i][j]);
                }
                System.out.println();
            }
            n--;
            if (n != 0)
                System.out.println();
        }
    }
}