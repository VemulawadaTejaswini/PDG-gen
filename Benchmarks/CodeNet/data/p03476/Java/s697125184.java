import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int[][] lr = new int[Q][2];
        boolean[] A = new boolean[1000000];
        boolean[] check = new boolean[1000000];
        Arrays.fill(A, false);
        Arrays.fill(check, false);
        int ans = 0;
        int Ans = 0;
        for (int i = 0; i < Q; i++) {
            lr[i][0] = sc.nextInt();
            lr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            for (int j = lr[i][0]; j <= lr[i][1]; j = j + 2) {
                if (check[j]) {
                    if (A[j]) {
                        ans++;
                    }
                } else {
                    check[j] = true;
                    A[j] = isPrime(j);
                    if (A[j]) {
                        ans++;
                    }
                }
                int a = (j + 1) / 2;
                if (check[a]) {
                    if (A[a]) {
                        ans++;
                    }
                } else {
                    check[a] = true;
                    A[a] = isPrime(a);
                    if (A[a]) {
                        ans++;
                    }
                }
                if (ans == 2) {
                    Ans++;
                }
                ans = 0;
            }
            System.out.println(Ans);
            Ans = 0;
        }

    }

    boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}