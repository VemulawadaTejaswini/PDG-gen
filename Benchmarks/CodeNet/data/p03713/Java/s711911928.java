import java.util.Scanner;

public class Main {

    private static long max(long a, long b, long c) {
        return Math.max(a, Math.max(b, c));
    }

    private static long min(long a, long b, long c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long h = s.nextLong();
        long w = s.nextLong();
        long min = Long.MAX_VALUE;
        for (int i = 1; i < h; i++) {
            long sa = i * w;
            long sbv = ((h - i) / 2) * w;
            long scv = (h - i - (h - i) / 2) * w;
            long sbh = (h - i) * (w / 2);
            long sch = (h - i) * (w - (w / 2));
            min = Math.min(max(sa, sbv, scv) - min(sa, sbv, scv), min);
            min = Math.min(max(sa, sbh, sch) - min(sa, sbh, sch), min);
        }
        for (int i = 1; i < w; i++) {
            long sa = h * i;
            long sbv = h * ((w - i) / 2);
            long scv = h * (w - i - (w - i) / 2);
            long sbh = (h / 2) * (w - i);
            long sch = (h - (h / 2)) * (w - i);
            min = Math.min(max(sa, sbv, scv) - min(sa, sbv, scv), min);
            min = Math.min(max(sa, sbh, sch) - min(sa, sbh, sch), min);
        }
        System.out.println(min);
    }

}
