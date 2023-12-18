
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
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int a1a2 = Math.abs(a1 - a2);
        int a1a3 = Math.abs(a1 - a3);
        int a2a3 = Math.abs(a2 - a3);

        if (a1a2 >= a1a3 && a1a2 >= a2a3)
            System.out.println(a1a3 + a2a3);
        else if (a1a3 >= a2a3 && a1a3 >= a1a2) {
            System.out.println(a2a3 + a1a2);
        } else
            System.out.println(a1a2 + a1a3);
    }
}
