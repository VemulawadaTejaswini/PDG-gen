import java.util.Scanner;

class Solver {
    public void Solve() {
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int ruisekiwa[] = new int[n + 1];
        for (int i = 0; i < ruisekiwa.length - 2; i++) {
            String sub = s.substring(i, i + 2);
            if (sub.equals("AC")) {
                ruisekiwa[i + 2] = ruisekiwa[i + 1] + 1;
            } else {
                ruisekiwa[i + 2] = ruisekiwa[i + 1];
            }
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(ruisekiwa[r] - ruisekiwa[l]);
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
