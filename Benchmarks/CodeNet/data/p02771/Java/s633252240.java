import java.util.Scanner;

class Solver {
    public void Solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b) {
            if (b == c) {
                System.out.println("No");
                return;
            } else {
                // cちがう
                System.out.println("Yes");
                return;
            }

        } else {
            if (b == c) {
                System.out.println("Yes");
                return;
            }
            if (a == c) {
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
            return;
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
