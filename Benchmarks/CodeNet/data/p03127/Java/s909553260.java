import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int curGcd = A[0];
        for (int i = 1; i < N; i++) {
            curGcd = calcGcd(A[i], curGcd);
            if (curGcd == 1) {
                System.out.print(1);
                return;
            }
        }
        System.out.print(curGcd);
    }

    // 最大公約数を求める。
    int calcGcd(int m, int n) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Arguments must be 1 and over.");
        }
        if(m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        int remainder = 0;
        while ((remainder = m % n) != 0) {
            m = n;
            n = remainder;
        }
        return n;
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}