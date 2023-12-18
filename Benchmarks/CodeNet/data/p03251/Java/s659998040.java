
import java.util.Arrays;
import java.util.Comparator;
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
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] xl = new int[n];
        int[] yl = new int[m];
        int maxx = 0;
        int miny = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            xl[i] = sc.nextInt();
            if (maxx < xl[i])
                maxx = xl[i];
        }
        for (int j = 0; j < m; j++) {
            yl[j] = sc.nextInt();
            if (miny > yl[j])
                miny = yl[j];
        }

        for (int z = x; z <= y; z++) {
            if (z > maxx && z <= miny) {
                System.out.println("No War");
                return;
            }
        }

        System.out.println("War");

    }
}
