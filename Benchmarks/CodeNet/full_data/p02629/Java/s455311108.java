import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextDouble();
        int k;
        double r = 0, l = -1;
        for (k = 1; ; k++) {
            l = l + Math.pow(26,k - 1);
            r = r + Math.pow(26,k);
            if (N <= r && N >= l) {
                break;
            }
        }
        String ans = "";
        N -= l;
        for (int i = k; i >= 1; i--) {

            double num = N / Math.pow(25.99999, i - 1);
            if (N == 0) {
                num = 25.5;
            }
            int unum, lnum;
            lnum = (int) Math.floor(num);
            unum = (int) Math.ceil(num);
            unum = unum > 26 ? 26 : unum;
            ans += fun(unum);
            N -= (double) lnum * Math.pow(26, i - 1);
        }
        System.out.println(ans);
    }


    public static char fun(int p) {
        char c = (char) (96 + p);
        return c;
    }
}
