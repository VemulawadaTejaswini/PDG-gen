
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int s;
    static int t;
    static int[][] grapht;
    static int[][] graphf;
    static long[] tmemo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt() - 1;
        t = sc.nextInt() - 1;

        grapht = new int[n][n];
        graphf = new int[n][n];
        tmemo = new long[n];


    }
}
