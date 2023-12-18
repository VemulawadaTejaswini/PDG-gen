import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        long w = sc.nextLong();
        long h = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long total = w * h;

        List<Double> mins = new ArrayList<>();

        // x軸と平行
        double s1 = (h - y) * w;
        mins.add(Math.min(s1, total - s1));

        // y軸と平行
        double s2 = h * (w - x);
        mins.add(Math.min(s2, total - s2));

        if (x * h != y * w) {
            // 右上通る
            double s3 = h * h * (w - x) / ((double) h - y) / 2;
            mins.add(Math.min(s3, total - s3));
        }
        if (w * (h - y) != h * x) {
            // 左上通る
            double s4 = h * h * x / ((double) h - y) / 2;
            mins.add(Math.min(s4, total - s4));
        }

        // 右下通る
        double s5 = h * h * (w - x) / ((double) y) / 2;
        mins.add(Math.min(s5, total - s5));

        // 左下通る
        double s6 = h * h * x / ((double) y) / 2;
        mins.add(Math.min(s6, total - s6));

        double max = Long.MIN_VALUE;

        for (double m : mins) {
            max = Math.max(m, max);
        }

        int count = 0;
        for (double m : mins) {
            if (max == m) count++;
        }

        System.out.println(max);
        System.out.println((count > 1 && x != y) ? 1 : 0);



    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
