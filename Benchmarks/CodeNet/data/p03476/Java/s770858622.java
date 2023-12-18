import java.util.Scanner;

class Solver {
    public void Solve() {
        System.out.println(isPrime(3));
        int q = sc.nextInt();
        int ruiseki[] = new int[200_000];
        ruiseki[0] = 0;
        for (int i = 1; i < ruiseki.length; i++) {
            if (isPrime(i) && isPrime((i + 1) / 2)) {
                ruiseki[i] = ruiseki[i - 1] + 1;
            } else {
                ruiseki[i] = ruiseki[i - 1];
            }
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = ruiseki[r] - ruiseki[l - 1];
            System.out.println(ans);
        }

    }

    boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n == 0 || n == 1) {
            return false;
        }
        if (n % 2 == 0) {
            return false;
        } else {
            int i = 3;
            while (true) {
                if (i * i > n) {
                    return true;
                }
                if (n % i == 0) {
                    return false;
                }
                i += 2;
            }
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
