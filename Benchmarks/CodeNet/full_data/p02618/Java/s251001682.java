import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    final static XorShift rng = new XorShift(System.nanoTime());
    final static Watch watch = new Watch();
    private SAState sa = new SAState();

    private int numTypes = 26;
    private int D;
    private int[] c;
    private int[][] s;
    private int[] dayToType;
    private int score;

    private int bestScore;
    private int[] bestDayToType;

    private int[] cumsum;

    private int[][] prev;
    private int[][] next;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        read();
//        watch.init();
        solve();
        write();
    }

    private void read() {
        try (Scanner sc = new Scanner(System.in)) {
//        try (Scanner sc = new Scanner(new File("./tester/example/sample2.in"))) {
            D = sc.nextInt();

            c = new int[numTypes];
            for (int i = 0; i < numTypes; i++) {
                c[i] = sc.nextInt();
            }

            s = new int[D][numTypes];
            for (int i = 0; i < D; i++) {
                for (int j = 0; j < numTypes; j++) {
                    s[i][j] = sc.nextInt();
                }
            }

            cumsum = new int[D + 2];
            for (int day = 0; day < D + 1; day++) {
                cumsum[day + 1] += cumsum[day] + (day + 1);
            }

            dayToType = new int[D];
            for (int day = 0; day < D; day++) {
                dayToType[day] = day % numTypes;
            }

            score = calculateScore();

            bestDayToType = new int[D];

            prev = new int[numTypes][D];
            int[] pre = new int[numTypes];
            Arrays.fill(pre, -1);
            for (int day = 0; day < D; day++) {
                for (int type = 0; type < numTypes; type++) {
                    prev[type][day] = pre[type];
                }
                int type = dayToType[day];
                pre[type] = day;
            }

            next = new int[numTypes][D];
            int[] nex = new int[numTypes];
            Arrays.fill(nex, D);
            for (int day = D - 1; day >= 0; day--) {
                for (int type = 0; type < numTypes; type++) {
                    next[type][day] = nex[type];
                }
                int type = dayToType[day];
                nex[type] = day;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void solve() {
        SA();
    }

    private void SA() {
        sa.init();
        for (;; ++sa.numIterations) {
            if ((sa.numIterations & ((1 << 10) - 1)) == 0) {
                sa.update();

                if (sa.isTLE()) {
                    loadBest();
                    Utils.debug(sa.numIterations, String.format("%.2f%%", 100.0 * sa.validIterations / sa.numIterations), String.format("%.2f%%", 100.0 * sa.acceptIterations / sa.validIterations), String.format("%5d", score), String.format("%5d", bestScore), String.format("%.6f", 1.0 / sa.inverseTemperature), String.format("%.6f", 1.0 / sa.lastAcceptTemperature), "time", watch.getSecondString());
                    break;
                }
            }

            mutate();
        }
    }

    private void mutate() {
        final int a = 10;
        final double random = a * rng.nextDouble();
        if (random < 1) {
            change();
        } else if (random < a) {
            swap();
        }
    }

    private void change() {
        final int day = (int) (D * rng.nextDouble());
        final int type1 = dayToType[day];

        int type2 = (int) ((numTypes - 1) * rng.nextDouble());
        if (type2 >= type1) {
            type2++;
        }
        final int dayNext1 = next[type1][day];
        final int dayPrev1 = prev[type1][day];
        final int dayNext2 = next[type2][day];
        final int dayPrev2 = prev[type2][day];
        int before2 = s[day][type1];
        before2 -= c[type1] * (cumsum[dayNext1 - day] + cumsum[day - dayPrev1]);
        before2 -= c[type2] * (cumsum[dayNext2 - dayPrev2]);

        int after2 = s[day][type2];
        after2 -= c[type1] * (cumsum[dayNext1 - dayPrev1]);
        after2 -= c[type2] * (cumsum[dayNext2 - day] + cumsum[day - dayPrev2]);

        final int deltaScore = after2 - before2;

        if (sa.acceptB(deltaScore)) {
            score += deltaScore;
            dayToType[day] = type2;

            for (int day1 = dayPrev1 + 1; day1 <= Math.min(D - 1, dayNext1); day1++) {
                prev[type1][day1] = dayPrev1;
            }
            for (int day1 = Math.max(0, dayPrev1); day1 < dayNext1; day1++) {
                next[type1][day1] = dayNext1;
            }

            for (int day2 = dayPrev2 + 1; day2 <= day; day2++) {
                prev[type2][day2] = dayPrev2;
            }
            for (int day2 = day + 1; day2 <= Math.min(D - 1, dayNext2); day2++) {
                prev[type2][day2] = day;
            }

            for (int day2 = Math.max(0, dayPrev2); day2 < day; day2++) {
                next[type2][day2] = day;
            }
            for (int day2 = day; day2 < dayNext2; day2++) {
                next[type2][day2] = dayNext2;
            }
            saveBest();
        } else {
        }
    }

    private void swap() {
        final int day1 = (int) (D * rng.nextDouble());
        final int type1 = dayToType[day1];

        final int dayNext1 = next[type1][day1];
        final int dayPrev1 = prev[type1][day1];
        int day2 = day1 - 15 + (int) (30 * rng.nextDouble());
        while (day2 <= dayPrev1 || day2 >= dayNext1) {
            day2 = day1 - 15 + (int) (30 * rng.nextDouble());
        }
        final int type2 = dayToType[day2];
        if (type2 == type1) {
            return;
        }
        final int dayNext2 = next[type2][day2];
        final int dayPrev2 = prev[type2][day2];
        if (day1 < dayPrev2 || day1 > dayNext2) {
            return;
        }

        int before2 = s[day1][type1] + s[day2][type2];
        before2 -= c[type1] * (cumsum[dayNext1 - day1] + cumsum[day1 - dayPrev1]);
        before2 -= c[type2] * (cumsum[dayNext2 - day2] + cumsum[day2 - dayPrev2]);

        int after2 = s[day1][type2] + s[day2][type1];
        after2 -= c[type1] * (cumsum[dayNext1 - day2] + cumsum[day2 - dayPrev1]);
        after2 -= c[type2] * (cumsum[dayNext2 - day1] + cumsum[day1 - dayPrev2]);

        final int deltaScore = after2 - before2;

        if (sa.acceptB(deltaScore)) {
            score += deltaScore;
            dayToType[day1] = type2;
            dayToType[day2] = type1;
            for (int day = dayPrev1 + 1; day <= day2; day++) {
                prev[type1][day] = dayPrev1;
            }
            for (int day = day2 + 1; day <= Math.min(D - 1, dayNext1); day++) {
                prev[type1][day] = day2;
            }

            for (int day = Math.max(0, dayPrev1); day < day2; day++) {
                next[type1][day] = day2;
            }
            for (int day = day2; day < dayNext1; day++) {
                next[type1][day] = dayNext1;
            }

            for (int day = dayPrev2 + 1; day <= day1; day++) {
                prev[type2][day] = dayPrev2;
            }
            for (int day = day1 + 1; day <= Math.min(D - 1, dayNext2); day++) {
                prev[type2][day] = day1;
            }

            for (int day = Math.max(0, dayPrev2); day < day1; day++) {
                next[type2][day] = day1;
            }
            for (int day = day1; day < dayNext2; day++) {
                next[type2][day] = dayNext2;
            }

            saveBest();
        } else {
        }
    }

    private int calculateScore() {
        int score = 0;
        int[] prev = new int[numTypes];
        Arrays.fill(prev, -1);
        for (int day = 0; day < D; day++) {
            score += s[day][dayToType[day]];
            prev[dayToType[day]] = day;
            for (int type = 0; type < numTypes; type++) {
                score -= c[type] * (day - prev[type]);
            }
        }
        return score;
    }

    private void saveBest() {
        if (score > bestScore) {
            bestScore = score;
            for (int day = 0; day < D; day++) {
                bestDayToType[day] = dayToType[day];
            }
        }
    }

    private void loadBest() {
        score = bestScore;
        for (int day = 0; day < D; day++) {
            dayToType[day] = bestDayToType[day];
        }
    }

    private void write() {
        StringBuilder sb = new StringBuilder();
        for (int day = 0; day < D; day++) {
            sb.append((dayToType[day] + 1) + "\n");
        }
        System.out.print(sb.toString());
        System.out.flush();
    }

}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}

class Watch {
    private long start;

    public Watch() {
        init();
    }

    public double getSecond() {
        return (System.nanoTime() - start) * 1e-9;
    }

    public void init() {
        init(System.nanoTime());
    }

    private void init(long start) {
        this.start = start;
    }

    public String getSecondString() {
        return toString(getSecond());
    }

    public static final String toString(double second) {
        if (second < 60) {
            return String.format("%5.2fs", second);
        } else if (second < 60 * 60) {
            int minute = (int) (second / 60);
            return String.format("%2dm%2ds", minute, (int) (second % 60));
        } else {
            int hour = (int) (second / (60 * 60));
            int minute = (int) (second / 60);
            return String.format("%2dh%2dm%2ds", hour, minute % (60), (int) (second % 60));
        }
    }

}

class XorShift {
    private int w = 88675123;
    private int x = 123456789;
    private int y = 362436069;
    private int z = 521288629;

    public XorShift(long l) {
        x = (int) l;
    }

    public int nextInt() {
        final int t = x ^ (x << 11);
        x = y;
        y = z;
        z = w;
        w = w ^ (w >>> 19) ^ (t ^ (t >>> 8));
        return w;
    }

    public long nextLong() {
        return ((long) nextInt() << 32) ^ (long) nextInt();
    }

    public double nextDouble() {
        return (nextInt() >>> 1) * 4.6566128730773926E-10;
    }

    public int nextInt(int n) {
        return (int) (n * nextDouble());
    }

}

class SAState {

    public static final boolean useTime = true;

    public double startTime = 0;
    public double endTime = 1.8;
    public double time = startTime;
    public double startTemperature = 3000;
    public double endTemperature = 1e-9;
    public double inverseTemperature = 1.0 / startTemperature;
    public double lastAcceptTemperature = startTemperature;

    public double startRange = 700;
    public double endRange = 1;
    public double range = startRange;

    public int numIterations;
    public int validIterations;
    public int acceptIterations;

    private int index;

    private static final double[] log = new double[32768];
    static {
        for (int i = 0; i < log.length; i++) {
            log[i] = Math.log((i + 0.5) / log.length);
        }
        for (int i = log.length - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * Main.rng.nextDouble());
            swap(log, i, j);
        }
    }

    public static final void swap(double[] a, int i, int j) {
        double swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public void init() {
        numIterations = 0;
        validIterations = 0;
        acceptIterations = 0;

        startTime = useTime ? Main.watch.getSecond() : numIterations;

        update();
        lastAcceptTemperature = inverseTemperature;
    }

    public void update() {
        updateTime();
        updateTemperature();
        updateRange();
    }

    public void updateTemperature() {
        double time0to1 = elapsedPercentage(startTime, endTime, time);
        double startY = startTemperature;
        double endY = endTemperature;
        double temperature = interpolate(startY, endY, time0to1);
        inverseTemperature = 1.0 / temperature;
    }

    private double elapsedPercentage(double min, double max, double v) {
        return (v - min) / (max - min);
    }

    private double interpolate(double v0, double v1, double d0to1) {
        return v0 + (v1 - v0) * d0to1;
    }

    public void updateRange() {
        range = endRange + (startRange - endRange) * Math.pow((endTime - time) / (endTime - startTime), 1.0);
    }

    public void updateTime() {
        time = useTime ? Main.watch.getSecond() : numIterations;
    }

    public boolean isTLE() {
        return time >= endTime;
    }

    public boolean accept(double deltaScore) {
        return acceptB(deltaScore);
    }

    public boolean acceptB(double deltaScore) {
        validIterations++;

        if (deltaScore > -1e-9) {
            acceptIterations++;
            return true;
        }

        assert deltaScore < 0 : Utils.toString(deltaScore);
        assert 1.0 / inverseTemperature >= 0;

        double d = deltaScore * inverseTemperature;
        if (d < -10) {
            return false;
        }
        index = (index - 1) & 32767;
        if (log[index] < d) {
            acceptIterations++;
            lastAcceptTemperature = inverseTemperature;
            return true;
        }
        return false;
    }

    public boolean acceptS(double deltaScore) {
        validIterations++;

        if (deltaScore < 1e-9) {
            acceptIterations++;
            return true;
        }

        assert deltaScore > 0;
        assert 1.0 / inverseTemperature >= 0;

        double d = -deltaScore * inverseTemperature;
        if (d < -10) {
            return false;
        }
        if (log[Main.rng.nextInt() & 32767] < d) {
            acceptIterations++;
            lastAcceptTemperature = inverseTemperature;
            return true;
        }
        return false;
    }

}
