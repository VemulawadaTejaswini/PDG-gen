import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int Q = scan.nextInt();
        long[] s = new long[A+1];
        for (int i = 0; i < A; i++) {
            s[i] = scan.nextLong();
        }
        s[A] = 10000000010L;
        long[] t = new long[B+1];
        for (int i = 0; i < B; i++) {
            t[i] = scan.nextLong();
        }
        t[B] = 10000000010L;
        for (int i = 0; i < Q; i++) {
            long start = scan.nextLong();
            long distance = Long.MAX_VALUE;
            distance = Math.min(distance, first_move(start, s, A, t, B));
            distance = Math.min(distance, first_move(start, t, B, s, A));
            System.out.println(distance);
        }
    }
    private long first_move(long start, long[] s, long A, long[] t, long B) {
        int result = Arrays.binarySearch(s, start);
        int index = 0 <= result ? result : ~result;
        long distance = Long.MAX_VALUE;
        for (int j = Math.max(index - 1, 0); j < Math.min(index + 2, A); j++) {
            distance = Math.min(distance, second_move(start, s, j, t, B));
        }
        return distance;
    }
    private long second_move(long start, long[] s, int position, long[] t, long N) {
        int result = Arrays.binarySearch(t, s[position]);
        int index = 0 <= result ? result : ~result;
        long distance = Long.MAX_VALUE;
        long from_start = Math.abs(start - s[position]);
        for (int i = Math.max(index - 1, 0); i < Math.min(index + 2, N); i++) {
            long temp = from_start + Math.abs(s[position]-t[i]);
            distance = Math.min(distance, temp);
        }
        return distance;
    }
}
