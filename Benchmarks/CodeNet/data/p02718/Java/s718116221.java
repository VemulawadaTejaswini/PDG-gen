import java.util.Arrays;
import java.util.Scanner;

class Solver {
    public void Solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        long wa = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            wa += a[i];
        }
        Arrays.sort(a);
        double dd = wa * 1.0 / (4.0 * m);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= dd) {
                cnt++;
            } else {

            }
        }
        if (cnt >= m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
