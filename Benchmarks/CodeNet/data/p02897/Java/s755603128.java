
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
        double n = sc.nextDouble();

        if (n % 2 == 0)
            System.out.println(((double) 1 / n) * n / 2);
        else
            System.out.println(((double) 1 / n) * ((n / 2) + 0.5));

    }
}
