import java.util.Scanner;

/**
 * The Number of Even Pairs
 * 
 * https://atcoder.jp/contests/abc159/tasks/abc159_a
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int M = sc.nextInt();

        int ans = N * (N - 1) / 2 + M * (M - 1) / 2;

        System.out.println(ans);
    }

}
