import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int X = scan.nextInt();
        List<Book> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int C = scan.nextInt();
            int[] m = new int[M];
            for (int j = 0; j < M; j++) {
                m[j] = scan.nextInt();
            }
            list.add(new Book(C, m));
        }
        long ans = Long.MAX_VALUE;
        long limit = pow(2, N);
        for (int i = 0; i < limit; i++) {
            int[] p = new int[M];
            int index = 0;
            int current = i;
            long cost = 0;
            while (0 < current) {
                if (current % 2 == 1) {
                    Book b = list.get(index);
                    int[] m = b.m;
                    cost += b.C;
                    for (int j = 0; j < M; j++) {
                        p[j] += m[j];
                    }
                }
                index += 1;
                current /= 2;
            }
            boolean found = false;
            for (int j = 0; j < M && !found; j++) {
                if (p[j] < X) {
                    found = true;
                }
            }
            if (!found) {
                ans = Math.min(ans, cost);
            }
        }
        if (ans == Long.MAX_VALUE) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }
    private long pow(int base, int count) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            return base * pow(base, count-1);
        }
        long x = pow(base, count/2);
        return x * x;
    }
    class Book {
        int C;
        int[] m;
        Book(int C, int[] m) {
            this.C = C;
            this.m = m;
        }
    }
}

