package antbook.p0;

import java.util.Scanner;

public class P142a {

    int n;

    P142a(int n) {
        this.n = n;
    }

    /**
     * 
     * @return greeting message
     */
    public double solve() {

        if (n % 2 == 0) {
            return 0.5;
        } else {
            return 1.0 * (n + 1) / 2 / n;
        }
    }

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // solve
        double p = new P142a(n).solve();

        // display
        System.out.println(p);
    }

}
