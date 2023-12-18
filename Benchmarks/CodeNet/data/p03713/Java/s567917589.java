import java.util.*;
import java.lang.*;


public class Main {
    static long samin = 1000000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        search(h, w);
        search(w, h);
        System.out.println(samin);
    }
    static void search(long h, long w) {
        for (int i = 1; i < h; i++) {
            long a = w * i;
            long b = (h - i) * (w / 2);
            long c = w * h - a - b;
            long sa = Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
            samin = Math.min(samin, sa);
            b = (h - i) / 2 * w;
            c = w * h - a - b;
            sa = Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
            samin = Math.min(samin, sa);
        }
    }
}