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
                    n += 10;
                }
                System.out.println(n);
                cnt++;
            }
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