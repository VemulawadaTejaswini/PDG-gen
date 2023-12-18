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
        int d = sc.nextInt();
        int[][] x = new int[n][];
        for (int i = 0; i < n; i++) {
            int[] tmp = new int[d];
            for (int j = 0; j < d; j++) {
                tmp[j] = sc.nextInt();
            }
            x[i] = tmp;
        }
        int ans = 0;
        for (int i = 0; i < n-1; i++) {
            for (int k = i+1; k < n; k++) {
                int sum = 0;
                for (int j = 0; j < d; j++) {
                    int a = x[i][j];
                    int b = x[k][j];
                    sum += Math.abs(a-b)*Math.abs(a-b);
                }
                if (Math.sqrt(sum) == (int)Math.sqrt(sum)) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}
