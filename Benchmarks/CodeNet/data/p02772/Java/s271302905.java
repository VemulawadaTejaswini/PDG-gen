import java.util.Scanner;

class Solver {
    public void Solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] % 3 == 0 || a[i] % 5 == 0) {
                    continue;
                } else {
                    System.out.println("DENIED");
                    return;
                }
            }
        }
        System.out.println("APPROVED");
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
