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
        String s = sc.next();
        long n = sc.nextLong();
        if (s.charAt(0) == 1 && n == 1) {
            System.out.println(1);
        } else if (s.charAt(0) == '1' && n > 1) {
            System.out.println(s.charAt(1));
        } else {
            System.out.println(s.charAt(0));
        }

    }
}
