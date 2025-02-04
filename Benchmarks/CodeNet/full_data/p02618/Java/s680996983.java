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
    private IntSet[] typeToDays;

    private int bestScore;
    private int[] bestDayToType;
    private int[] sum;

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
            typeToDays = new IntSet[numTypes];
            for (int type = 0; type < numTypes; type++) {
                typeToDays[type] = new IntSet(D + 2);
            }

            sum = new int[D + 2];
            for (int day = 0; day < D + 1; day++) {
                sum[day + 1] += sum[day] + (day + 1);
            }

            dayToType = new int[D];
            for (int day = 0; day < D; day++) {
                dayToType[day] = day % numTypes;
                typeToDays[dayToType[day]].add(day);
            }

            score = calculateScore();

            bestDayToType = new int[D];
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void solve() {
        SA();
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

    private void SA() {
        double second = (int) watch.getSecond();
        sa.init();
        for (;; ++sa.numIterations) {
            if ((sa.numIterations & ((1 << 10) - 1)) == 0) {
                sa.update();

                if (sa.isTLE()) {
                    loadBest();
                    Utils.debug(sa.numIterations, String.format("%.2f%%", 100.0 * sa.validIterations / sa.numIterations), String.format("%.2f%%", 100.0 * sa.acceptIterations / sa.validIterations), String.format("%5d", score), String.format("%5d", bestScore), String.format("%.6f", 1.0 / sa.inverseTemperature), String.format("%.6f", 1.0 / sa.lastAcceptTemperature), "time", watch.getSecondString());
                    break;
                }

                if (watch.getSecond() > second) {
                    second++;
                    Utils.debug(sa.numIterations, String.format("%.2f%%", 100.0 * sa.validIterations / sa.numIterations), String.format("%.2f%%", 100.0 * sa.acceptIterations / sa.validIterations), String.format("%5d", score), String.format("%5d", bestScore), String.format("%.6f", 1.0 / sa.inverseTemperature), String.format("%.6f", 1.0 / sa.lastAcceptTemperature), "time", watch.getSecondString());
                }
            }

            mutate();
        }
        Utils.debug("SA", "score", 50 * (1000000 + score), 50 * (1000000 + calculateScore()), "time", watch.getSecondString());
    }

    private void mutate() {
        double random = 2 * rng.nextDouble();
        if (random < 1) {
            change();
        } else if (random < 2) {
            swap();
        }
    }

    private void change() {
        int day = (int) (D * rng.nextDouble());
        int type2 = (int) (numTypes * rng.nextDouble());

        int type1 = dayToType[day];
        if (type2 == type1) {
            return;
        }

        int index1 = typeToDays[type1].indexOf(day);
        int indexNext1 = index1 + 1;
        int dayNext1 = indexNext1 < typeToDays[type1].size() ? typeToDays[type1].get(indexNext1) : D - 0;

        int indexPrev1 = index1 - 1;
        int dayPrev1 = indexPrev1 >= 0 ? typeToDays[type1].get(indexPrev1) : -1;

        typeToDays[type2].add(day);
        int index2 = typeToDays[type2].indexOf(day);
        int indexNext2 = index2 + 1;
        int dayNext2 = indexNext2 < typeToDays[type2].size() ? typeToDays[type2].get(indexNext2) : D - 0;

        int indexPrev2 = index2 - 1;
        int dayPrev2 = indexPrev2 >= 0 ? typeToDays[type2].get(indexPrev2) : -1;

        int before2 = s[day][type1];
        before2 -= c[type1] * (sum[dayNext1 - day] + sum[(day - 0) - dayPrev1]);
        before2 -= c[type2] * (sum[dayNext2 - dayPrev2]);

        int after2 = s[day][type2];
        after2 -= c[type1] * (sum[dayNext1 - dayPrev1]);
        after2 -= c[type2] * (sum[dayNext2 - day] + sum[(day - 0) - dayPrev2]);

        int deltaScore = after2 - before2;

        if (sa.acceptB(deltaScore)) {
            score += deltaScore;

            typeToDays[type1].remove(day);
            dayToType[day] = type2;
            saveBest();
        } else {
            typeToDays[type2].remove(day);
        }
    }

    private void swap() {
        int day1 = (int) (D * rng.nextDouble());
        int day2 = (int) (D * rng.nextDouble());

        int type1 = dayToType[day1];
        int type2 = dayToType[day2];
        if (type1 == type2) {
            return;
        }

        int index1 = typeToDays[type1].indexOf(day1);
        int indexNext1 = index1 + 1;
        int dayNext1 = indexNext1 < typeToDays[type1].size() ? typeToDays[type1].get(indexNext1) : D - 0;

        int index2 = typeToDays[type2].indexOf(day2);
        int indexNext2 = index2 + 1;
        int dayNext2 = indexNext2 < typeToDays[type2].size() ? typeToDays[type2].get(indexNext2) : D - 0;

        int indexPrev1 = index1 - 1;
        int dayPrev1 = indexPrev1 >= 0 ? typeToDays[type1].get(indexPrev1) : -1;

        int indexPrev2 = index2 - 1;
        int dayPrev2 = indexPrev2 >= 0 ? typeToDays[type2].get(indexPrev2) : -1;

        if (day2 < dayPrev1 || day2 > dayNext1) {
            return;
        }
        if (day1 < dayPrev2 || day1 > dayNext2) {
            return;
        }

        int before2 = s[day1][type1] + s[day2][type2];
        before2 -= c[type1] * sum[day1 - dayPrev1];
        before2 -= c[type1] * sum[dayNext1 - day1];
        before2 -= c[type2] * sum[day2 - dayPrev2];
        before2 -= c[type2] * sum[dayNext2 - day2];

        int after2 = s[day1][type2] + s[day2][type1];
        after2 -= c[type1] * sum[day2 - dayPrev1];
        after2 -= c[type1] * sum[dayNext1 - day2];
        after2 -= c[type2] * sum[day1 - dayPrev2];
        after2 -= c[type2] * sum[dayNext2 - day1];

        int deltaScore = after2 - before2;

        if (sa.acceptB(deltaScore)) {
            score += deltaScore;

            typeToDays[type1].remove(day1);
            typeToDays[type2].remove(day2);
            dayToType[day1] = type2;
            dayToType[day2] = type1;
            typeToDays[type1].add(day2);
            typeToDays[type2].add(day1);

            saveBest();
        } else {
        }
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

class CollectionsUtils {
    private CollectionsUtils() {
    }

    public static final <T> void shuffle(ArrayList<T> list, Random rng) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * rng.nextDouble());
            CollectionsUtils.swap(list, i, j);
        }
    }

    public static final <T> void shuffle(ArrayList<T> list, XorShift rng) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * rng.nextDouble());
            CollectionsUtils.swap(list, i, j);
        }
    }

    public static final <T> void select0(ArrayList<T> a, int l, int r, int k, Comparator<T> comparator) {
        while (l < r) {
            int i = CollectionsUtils.partition3(a, l, r, comparator);
            if (i >= k)
                r = i - 1;
            if (i <= k)
                l = i + 1;
        }
    }

    public static final <T> void select(ArrayList<T> a, int startInclusive, int endExclusive, int k, Comparator<T> comparator) {
        select0(a, startInclusive, endExclusive - 1, k, comparator);
    }

    public static final <T extends Comparable<T>> void select0(ArrayList<T> a, int l, int r, int k) {
        while (l < r) {
            int i = CollectionsUtils.partition3(a, l, r);
            if (i >= k)
                r = i - 1;
            if (i <= k)
                l = i + 1;
        }
    }

    public static final <T extends Comparable<T>> void select(ArrayList<T> a, int startInclusive, int endExclusive, int k) {
        select0(a, startInclusive, endExclusive - 1, k);
    }

    public static final <T> void swap(ArrayList<T> a, int i, int j) {
        T swap = a.set(i, a.get(j));
        a.set(j, swap);
    }

    public static final <T> void sort3(ArrayList<T> a, int i, int j, int k, Comparator<T> comparator) {
        if (comparator.compare(a.get(i), a.get(j)) > 0) {
            swap(a, i, j);
        }
        if (comparator.compare(a.get(i), a.get(k)) > 0) {
            swap(a, i, k);
        }
        if (comparator.compare(a.get(j), a.get(k)) > 0) {
            swap(a, j, k);
        }
    }

    public static final <T extends Comparable<T>> void sort3(ArrayList<T> a, int i, int j, int k) {
        if (a.get(i).compareTo(a.get(j)) > 0) {
            swap(a, i, j);
        }
        if (a.get(i).compareTo(a.get(k)) > 0) {
            swap(a, i, k);
        }
        if (a.get(j).compareTo(a.get(k)) > 0) {
            swap(a, j, k);
        }
    }

    public static final <T> int partition3(ArrayList<T> a, int l, int r, Comparator<T> comparator) {
        int center = (l + r) >>> 1;
        sort3(a, l, center, r, comparator);
        swap(a, center, r - 1);
        if (r - l < 3) {
            return l;
        }
        int r1 = r - 1;
        T v = a.get(r1);
        int i = l - 1;
        int j = r1;
        for (;;) {
            for (; comparator.compare(a.get(++i), v) < 0;) {
            }
            for (; comparator.compare(a.get(--j), v) > 0;) {
            }
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, i, r1);
        return i;
    }

    public static final <T extends Comparable<T>> int partition3(ArrayList<T> a, int l, int r) {
        int center = (l + r) >>> 1;
        sort3(a, l, center, r);
        swap(a, center, r - 1);
        if (r - l < 3) {
            return l;
        }
        int r1 = r - 1;
        T v = a.get(r1);
        int i = l - 1;
        int j = r1;
        for (;;) {
            for (; a.get(++i).compareTo(v) < 0;) {
            }
            for (; a.get(--j).compareTo(v) > 0;) {
            }
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, i, r1);
        return i;
    }

    public static final <T extends Comparable<T>> int partition(ArrayList<T> a, int l, int r) {
        int i = l - 1, j = r;
        T v = a.get(r);
        for (;;) {
            while (a.get(++i).compareTo(v) < 0)
                ;
            while (v.compareTo(a.get(--j)) < 0)
                if (j == l)
                    break;
            if (i >= j)
                break;
            swap(a, i, j);
        }
        swap(a, i, r);
        return i;
    }

    public static final <T> void sort(ArrayList<T> a, int lInclusive, int rInclusive, Comparator<T> comparator) {
        if (lInclusive >= rInclusive) {
            return;
        }
        int k = partition3(a, lInclusive, rInclusive, comparator);
        sort(a, lInclusive, k - 1, comparator);
        sort(a, k + 1, rInclusive, comparator);
    }

    public static final <T extends Comparable<T>> void sort(ArrayList<T> a, int lInclusive, int rInclusive) {
        if (lInclusive >= rInclusive) {
            return;
        }
        int k = partition3(a, lInclusive, rInclusive);
        sort(a, lInclusive, k - 1);
        sort(a, k + 1, rInclusive);
    }

    public static final <T> ArrayList<T> reverse(ArrayList<T> list) {
        for (int l = 0, r = list.size() - 1; l < r; l++, r--) {
            list.set(r, list.set(l, list.get(r)));
        }
        return list;
    }

    public static final <T> ArrayList<T> newReverse(ArrayList<T> list) {
        ArrayList<T> res = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i));
        }
        return res;
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

    private static final double[] log = new double[32768];
    static {
        for (int i = 0; i < log.length; i++) {
            log[i] = Math.log((i + 0.5) / log.length);
        }
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
        if (log[Main.rng.nextInt() & 32767] < d) {
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

class IntListSortedBIT {
    private static final int EMPTY = -1;
    int[] sum;
    int size;

    public IntListSortedBIT(int n) {
        if (n <= 1)
            n = 2;
        n = Integer.highestOneBit(n - 1) << 1;
        sum = new int[n + 1];
    }

    public void clear() {
        Arrays.fill(sum, 0);
        size = 0;
    }

    public void add(int value) {
        add(value, 1);
    }

    private void add(int value, int number) {
        for (int j = value + 1; j < sum.length; j += j & -j) {
            sum[j] += number;
        }
        size += number;
    }

    public void remove(int value) {
        remove(value, 1);
    }

    private void remove(int value, int number) {
        number = Math.min(number, size(value));
        for (int j = value + 1; j < sum.length; j += j & -j) {
            sum[j] -= number;
        }
        size -= number;
    }

    public int get(int index) {
        int s = 0;
        for (int i = sum.length >>> 1; i > 0; i >>>= 1) {
            if (sum[s | i] <= index) {
                s |= i;
                index -= sum[s];
            }
        }
        return s;
    }

    public int indexOf(int value) {
        int s = sum(value + 1);
        int s2 = sum(value);
        if (s == s2) {
            return EMPTY;
        }
        return s2;
    }

    public int indexOf2(int value) {
        int s2 = sum(value);
        return s2;
    }

    public int sum(int indexExclusive) {
        return sum1(1 + indexExclusive - 1);
    }

    private int sum1(int indexInclusive) {
        int ret = 0;
        for (int x = indexInclusive; x > 0; x -= x & -x) {
            ret += sum[x];
        }
        return ret;
    }

    public boolean contains(int value) {
        return indexOf(value) != EMPTY;
    }

    public int size() {
        return size;
    }

    public int size(int value) {
        return sum(value + 1) - sum(value);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(get(i));
        }
        sb.append("}");
        return sb.toString();
    }
}

class IntSet {
    private static final int EMPTY = -1;
    private int size;
    private int[] indexToValue;
    private int[] valueToIndex;

    public IntSet(int capacity) {
        this.size = 0;
        indexToValue = new int[capacity];
        valueToIndex = new int[capacity];
        Arrays.fill(valueToIndex, EMPTY);
    }

    public boolean add(int value) {
        if (valueToIndex[value] != EMPTY) {
            return false;
        }
        indexToValue[size] = value;
        valueToIndex[value] = size;
        size++;

        for (int i = size - 2; i >= 0; i--) {
            if (indexToValue[i] < indexToValue[i + 1]) {
                break;
            }
            swap(i, i + 1);
        }

        for (int i = 1; i < size; i++) {
            if (get(i - 1) > get(i)) {
                Utils.debug(get(i - 1), get(i));
                System.exit(0);
            }
        }

        return true;
    }

    public boolean remove(int value) {
        int index = indexOf(value);
        if (index == EMPTY) {
            return false;
        }
        removeByIndex(index);
        for (int i = 1; i < size; i++) {
            if (get(i - 1) > get(i)) {
                Utils.debug(get(i - 1), get(i));
                System.exit(0);
            }
        }
        return true;
    }

    private boolean removeByIndex(int index) {
        if (size == 0) {
            return false;
        }
        assert index < size;

        for (int i = index; i + 1 < size; i++) {
            swap(i, i + 1);
        }
        int value = indexToValue[size - 1];
        valueToIndex[value] = EMPTY;
        size--;
        return true;
    }

    public void swap(int index, int index2) {
        assert index < size;
        assert index2 < size;

        int swap = indexToValue[index];
        indexToValue[index] = indexToValue[index2];
        indexToValue[index2] = swap;

        valueToIndex[indexToValue[index]] = index;
        valueToIndex[indexToValue[index2]] = index2;

    }

    public void swapValue(int value, int value2) {
        assert value < size;
        assert value2 < size;

        int swap = valueToIndex[value];
        valueToIndex[value] = valueToIndex[value2];
        valueToIndex[value2] = swap;

        indexToValue[valueToIndex[value]] = value;
        indexToValue[valueToIndex[value2]] = value2;

    }

    public int get(int index) {
        assert index < size;
        return indexToValue[index];
    }

    public int indexOf(int value) {
        return valueToIndex[value];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() <= 0;
    }

    public void clear() {
        for (; size() > 0;) {
            removeByIndex(0);
        }
    }

    public boolean contains(int value) {
        return indexOf(value) != EMPTY;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(indexToValue, size()));
    }
}
