import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();
        boolean t = sub(K, A, B, C);
        if (t) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
    private boolean sub(int K, int A, int B, int C) {
        for (int i = 0; i < 3; i++) {
            boolean t = dfs(K, A, B, C, i, 0);
            if (t) {
                return true;
            }
        }
        return false;
    }
    private boolean dfs(int K, int A, int B, int C, int choice, int turn) {
        if (K <= turn) {
            return false;
        }
        if (choice == 0) {
            A *= 2;
        }
        if (choice == 1) {
            B *= 2;
        }
        if (choice == 2) {
            C *= 2;
        }
        if (A < B && B < C) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            boolean t = dfs(K, A, B, C, i, turn + 1);
            if (t) {
                return true;
            }
        }
        return false;
    }
}
