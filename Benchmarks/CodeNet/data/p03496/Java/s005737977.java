import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N + 1];
        boolean allNegative = true, allPositive = true;
        int maxIdx = 1;
        boolean isMaxPositive = false;
        boolean isSorted = true;
        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextInt();
            if (a[i] > 0) {
                allNegative = false;
            }
            if (a[i] < 0) {
                allPositive = false;
            }
            if (Math.abs(a[i]) >= Math.abs(a[maxIdx])) {
                isMaxPositive = a[i] > 0;
                maxIdx = i;
            }
            if (i != 1 && a[i - 1] > a[i]) {
                isSorted = false;
            }
        }

        List<Pair> pairs = new ArrayList<>();
        if (!allNegative && !allPositive) {
            for (int i = 1; i <= N; i++) {
                pairs.add(new Pair(maxIdx, i));
                a[i] += a[maxIdx];
            }
        }

        if (!isSorted) {
            if (isMaxPositive) {
                for (int i = 1; i <= N - 1; i++) {
                    pairs.add(new Pair(i, i + 1));
                    a[i + 1] += a[i];
                }
            } else {
                for (int i = N; i >= 1 + 1; i--) {
                    pairs.add(new Pair(i, i - 1));
                    a[i - 1] += a[i];
                }
            }
        }

        System.out.println(pairs.size());
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs.get(i).x + " " + pairs.get(i).y);
        }
    }

    class Pair {

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;
    }
}