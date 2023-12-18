import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int n = scan.nextInt();
        int[][] c = new int[h][w];
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        int index = 0;
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    c[i][j] = index + 1;
                    if (--a[index] == 0)
                        index++;
                }
            } else {
                for (int j = w - 1; j >= 0; j--) {
                    c[i][j] = index + 1;
                    if (--a[index] == 0)
                        index++;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (j == 0)
                    System.out.print(c[i][j]);
                else {
                    System.out.print(" " + c[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
