import java.util.Scanner;
import java.util.Arrays;

class Solver {
    public void Solve() {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
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
