import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.max(A+B,Math.max(A-B,A*B)));
    }
}