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
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        List<Pair> pairs = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (Math.abs(a[i]) > Math.abs(a[max])) {
                max = i;
            }
        }
        if (a[max] > 0) {
            for (int i = max + 1; i < N; i++) {
                while (a[i - 1] > a[i]) {
                    a[i] += a[max];
                    pairs.add(new Pair(max + 1, i + 1));
                }
            }
            int min = 0;
            for (int i = 0; i < max; i++) {
                if (a[i] < a[min]) {
                    min = i;
                }
            }
            for (int i = max - 1; i > 0; i--) {
                while (a[i - 1] > a[i]) {
                    a[i - 1] += a[min];
                    pairs.add(new Pair(min + 1, i));
                }
            }
        } else {
            for (int i = max; i >= 1; i--) {
                while (a[i - 1] > a[i]) {
                    a[i - 1] += a[max];
                    pairs.add(new Pair(max + 1, i));
                }
            }
            int min = max + 1;
            for (int i = max + 1; i < N; i++) {
                if (a[i] > a[min]) {
                    min = i;
                }
            }
            for (int i = max + 1; i < N; i++) {
                while (a[i - 1] > a[i]) {
                    a[i] += a[min];
                    pairs.add(new Pair(min + 1, i + 1));
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