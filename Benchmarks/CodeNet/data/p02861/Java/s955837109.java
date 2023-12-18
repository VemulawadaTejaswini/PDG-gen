import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    int[] x;
    int[] y;
    int n;

    private void run() {
        n = sc.nextInt();
        x = new int[n];
        y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        double sum = 0;
        int count = 0;
        sum += calcDistance(a);
        count++;

        while (nextPermutation(a)) {
            sum += calcDistance(a);
            count++;
        }

        System.out.println(sum/(double)count);
    }

    private double calcDistance(int[] a) {
        double sum = 0;
        double distance = 0;
        for (int i = 1; i < n; i++) {
            distance = Math.sqrt(Math.pow(x[a[i-1]]-x[a[i]],2)+Math.pow(y[a[i-1]]-y[a[i]],2));
            sum += distance;
        }
        return sum;
    }

    public static boolean nextPermutation(int[] a) {
        for (int i = a.length - 1; i > 0; --i) {
            if (a[i - 1] < a[i]) {
                int swapIndex = find(a[i - 1], a, i, a.length - 1);
                int temp = a[swapIndex];
                a[swapIndex] = a[i - 1];
                a[i - 1] = temp;
                Arrays.sort(a, i, a.length);
                return true;
            }
        }
        return false;
    }

    // destより大きい要素の中で最小のもののインデックスを二分探索で探す
    private static int find(int dest, int[] a, int s, int e) {
        if (s == e) {
            return s;
        }
        int m = (s + e + 1) / 2;
        return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
    }
}

