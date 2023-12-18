import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        int result = 1;
        if (x >= 4) {
            for (int r = x; r > 3; r--) {
                if (isPow(r)) {
                    result = r;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    static boolean isPow(int n) {
        if (n <= 1) return false;
        double logn = Math.log((double)n);
        for (int b = 2; b < n; b++) {
            double logbn = logn / Math.log((double)b);
            if (Math.abs(Math.floor(logbn) - logbn) < 0.00001) {
                return true;
            } else if (logbn < 1.0) {
                return false;
            }
        }
        return false;
    }
}
