import java.util.Scanner;

public class Main {
    public static class Solver {
        int n;
        int k;
        public Solver() {
            Scanner sc = new Scanner(System.in);
            long cnt = 0;
            long k = sc.nextLong();
            long n = 0;
            while (cnt < k) {
                if (cnt < 9) {
                    n++;
                } else {
                    int jmp;
                    jmp = 10;
                    if (n > 1000) {
                        jmp = 10;
                    }
                    n += jmp;

                    while (f(n) > f(n + 10) || f(n) > f(n + 100) || f(n) > f(n + 1000) || f(n) > f(n + 10000)) {
                        n += jmp;
                    }
                }
                System.out.println(n);
                cnt++;
            }
        }

        double f (long digit) {
            return digit / (double) S(digit);
        }

        double S(long digit) {
            long cp = digit;
            int sum = 0;
            while (cp >= 10) {
                sum += cp % 10;
                cp /= 10;
            }

            sum += cp;
            return sum;
        }
    }

    public static void main(String[] args) {

        new Solver();
    }
}