import java.util.*;

class Main {

    static void solve (int q) {
        double epsilon = (double)q;
        double before = (double)q;
        double after = (double)q;

        while (epsilon >= 0.00001 * q) {
            before = after;
            after = before - (before * before * before - q) / (3.0 * before * before);
            epsilon = Math.abs(after * after * after - q);
        }

        System.out.printf("%.6f\n", after);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int q = sc.nextInt();
            if(q == -1) break;
            solve(q);
        }

    }
}