import java.io.*;
import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);
    void solve() {
        int N = sc.nextInt();
        long[] a = new long[N * 3];
        for (int i = 0; i < N * 3; i++) a[i] = sc.nextLong();
        Arrays.sort(a);
        int back = N * 3 - 1;
        long ans = 0L;
        for (int i = 0; i < N; i++) {
            back--;
            ans += a[back--];
        }
        System.out.println(ans);
    }
}