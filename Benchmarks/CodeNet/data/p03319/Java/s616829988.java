import java.util.Scanner;

public class Main {
    public static class Solver {
        int n;
        int k;
        public Solver() {
            Scanner sc = new Scanner(System.in);

            n = sc.nextInt();
            k = sc.nextInt();

            for (int i = 0 ; i < n ; i ++) {
                sc.nextInt();
            }

            if (k >= n) {
                System.out.println(1);
            } else {
                int r = (int) Math.ceil(((n - k) / (double) (k - 1)) + 1);
                System.out.println(r);
            }
        }
    }

    public static void main(String[] args) {
        new Solver();
    }
}