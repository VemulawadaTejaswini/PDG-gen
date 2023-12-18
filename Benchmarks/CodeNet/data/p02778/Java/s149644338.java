import java.util.Scanner;

class Solver {
    public void Solve() {
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }
        System.out.println();
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