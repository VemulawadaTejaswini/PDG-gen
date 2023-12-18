import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        long min = Integer.MAX_VALUE;
        for (int i = 1 ; i < h ; i++) {
            long a = (long) i * w;
            if ((h - i) % 2 == 0) {
                long b = (long) (h - i) * w / 2;
                min = Math.min(min, Math.abs(a - b));
            } else {
                long b = (long) (h - i  - 1) * w / 2;
                long c = (long) ((h - i + 1) / 2 ) * w ;
                min = Math.min(min, Math.max(a, c) - Math.min(a, b));
            }
            if (w % 2 == 0) {
                long b = (long) (h - i) * w / 2;
                min = Math.min(min, Math.abs(a - b));
            } else {
                long b = (long) (h - i) * (w - 1) / 2;
                long c = (long) (w + 1)* (h - i) / 2;
                min = Math.min(min, Math.max(a, c) - Math.min(a, b));
            }
        }

        for (int i = 1 ; i < w ; i++) {
            long a = (long) i * h;
            if ((w- i) % 2 == 0) {
                long b = (long) (w - i) * h / 2;
                min = Math.min(min, Math.abs(a - b));
            } else {
                long b = (long) (w - i - 1) * h / 2;
                long c = (long) ((w - i + 1) / 2) * h;
                min = Math.min(min, Math.max(a, c) - Math.min(a, b));
            }
            if ( h % 2 == 0) {
                long b = (long) (w - i) * h / 2;
                min = Math.min(min, Math.abs(a - b));
            } else {
                long b = (long) (w - i) * (h - 1 ) / 2;
                long c = (long) (w - i) * (h+ 1) / 2;
                min = Math.min(min, Math.max(a, c) - Math.min(a, b));
            }
        }
        System.out.println(min);
    }
}