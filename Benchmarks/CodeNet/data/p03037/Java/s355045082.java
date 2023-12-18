import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] lr = new int[m][2];
        for (int i = 0; i < m; i++) {
            lr[i][0] = sc.nextInt();
            lr[i][1] = sc.nextInt();
        }
        int maxl = lr[0][0];
        int minr = lr[0][1];
        for (int i = 1; i < m; i++) {
            if (maxl < lr[i][0]) {
                maxl = lr[i][0];
            }
            if (minr > lr[i][1]) {
                minr = lr[i][1];
            }
        }
        if (minr - maxl > 0) {
            System.out.println(minr - maxl + 1);
        } else if (minr - maxl == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
