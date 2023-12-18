import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        ArrayList<Pair> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            l.add(new Pair(a[i], b[i]));
        }
        Collections.sort(l);
        long dp[][] = new long[n][h + 200000];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < h + 200000; j++) {
                dp[i][j] = 10000000000000l;
            }
        }
        for (int k = 0; k < n; k++) {
            int s = l.get(k).key;
            int v = l.get(k).value;
            for (int i = 0; i * s < h + 200000; i++) {
                dp[k][i * s] = v * i;
            }
        }
        for (int i = 1; i < n; i++) {
            Pair newP = l.get(i);
            for (int j = 0; j < h + 200000; j++) {
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
                if (j - newP.key < 0) {
                    continue;
                }
                if (dp[i - 1][j - newP.key] + newP.value < dp[i][j]) {
                    dp[i][j] = dp[i - 1][j - newP.key] + newP.value;
                } else {
                }
            }
        }
        long min = 10000000000000l;
        for (int i = h; i < h + 200000; i++) {
            min = Math.min(min, dp[n - 1][i]);
        }
        System.out.println(min);
        sc.close();

    }
}

class Pair implements Comparable<Pair> {
    // key , value 昇順ソート
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair other) {
        if (this.key == other.key) {
            return this.value - other.value;
        }
        // return this.value - other.value;
        return this.key - other.key;
    }
}
