import java.util.Scanner;

public class Main {

    int n;

    Main(int n) {
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
        double p = new Main(n).solve();

        // display
        System.out.println(p);
    }