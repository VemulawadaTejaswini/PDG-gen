import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * https://abc113.contest.atcoder.jp/tasks/abc113_c
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        int M = in.nextInt();
        List<Data> data = new ArrayList<>(M);
        for (int i = 0; i < M; i++) {
            data.add(i, new Data(in.nextInt(), in.nextInt(), 1, i));
        }
        Collections.sort(data, Data.BY_Y);
        Collections.sort(data, Data.BY_P);
        for (int i = 1; i < M; i++) {
            if (data.get(i).p == data.get(i - 1).p) {
                data.get(i).id = data.get(i - 1).id + 1;
            }
        }
        Collections.sort(data, Data.BY_ORIG);
        for (int i = 0; i < M; i++) {
            System.out.println(data.get(i).getAns());
        }
    }

    private static class Data {
        private int p, y, id, orig;
        private static final Comparator<Data> BY_P = (o1, o2) -> Integer.compare(o1.p, o2.p);
        private static final Comparator<Data> BY_Y = (o1, o2) -> Integer.compare(o1.y, o2.y);
        private static final Comparator<Data> BY_ORIG = (o1, o2) -> Integer.compare(o1.orig, o2.orig);

        private Data(int p, int y, int id, int orig) {
            this.p = p;
            this.y = y;
            this.id = id;
            this.orig = orig;
        }

        private String getAns() {
            return String.format("%06d%06d", p, id);
        }
    }
}
