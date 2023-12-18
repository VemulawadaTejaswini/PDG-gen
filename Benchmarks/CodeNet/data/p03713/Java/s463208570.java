import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());
        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
        } else {
            long diff = 0;
            if (h < w) {
                diff = getDiff(h, w);
            } else {
                diff = getDiff(w, h);
            }
            System.out.println(diff);
        }
    }

    private static long getDiff(long h, long w) {
        long L = 0;
        long R = w;
        long temp = 0;
        long diff = Long.MAX_VALUE;
        while (L < R) {
            temp = (L + R) / 2;
            long LL = h * temp;
            long RR = (h / 2) * (w - temp);
            if (h % 2 != 0) {
                if (LL < RR) {
                    RR = ((h / 2) + 1) * (w - temp);
                }
            }
            diff = Math.min(diff, Math.abs(LL - RR));
            if (LL > RR) {
                R = temp;
            } else {
                L = temp;
                if (R - L == 1) {
                    break;
                }
            }
        }
        return diff;
    }
}