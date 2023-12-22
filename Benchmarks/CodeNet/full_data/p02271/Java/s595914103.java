
import java.util.Scanner;

public class Main {
    static int A[], B[];
    static int n, q;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        A = new int [n];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        q = s.nextInt();
        for (int i = 0; i < q; i++) {
            int p = s.nextInt();
            if (solve(p, 0) ) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }

    static boolean solve(int rest, int i) {
        if (i >= n) {
            return false;
        }
        if (rest == 0) {
            return true;
        }
        return solve(rest, i + 1) || solve(rest - A[i], i + 1);
    }
}

