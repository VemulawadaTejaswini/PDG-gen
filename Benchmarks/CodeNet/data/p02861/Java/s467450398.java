import java.text.DecimalFormat;
import java.io.*;
import java.util.*;
import java.util.function.BiFunction;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        DecimalFormat df = new DecimalFormat("0.0000000000");
        
        final int N = Integer.parseInt(sc.next());
        int[] x = new int[N];
        int[] y = new int[N];
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < N; i++) p[i] = i;
        double len = 0.0;
        double lap = 0.0; 
        BiFunction<Integer, Integer, Double> dist = (i, j) -> {
            double dx = x[i] - x[j];
            double dy = y[i] - y[j];
            return Math.sqrt(dx * dx + dy * dy);
        };
        
        do {
            ++lap;
            for (int i = 0; i < N - 1; i++) {
                len += dist.apply(p[i], p[i+1]);
            }
        } while (nextPermutation(p));
        
        out.println(df.format(len / lap));
        
        out.flush();
    }

    public static boolean nextPermutation(int[] a) {
        for (int i = a.length - 1; 0 < i; i--) {
            if (a[i - 1] < a[i]) {
                int index = find(a[i - 1], a, i, a.length - 1);
                int temp = a[index];
                a[index] = a[i - 1];
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