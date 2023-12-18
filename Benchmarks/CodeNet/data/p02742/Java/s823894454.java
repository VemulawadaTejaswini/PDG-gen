import java.util.Scanner;

class Solver {
    public void Solve() {
        long h = sc.nextLong();
        long w = sc.nextLong();
        long ans = ((h * w) + 1) / 2;
        if (h == 1 || w == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(ans);
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
