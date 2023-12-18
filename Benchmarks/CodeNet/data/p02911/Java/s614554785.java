import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int N = in.nextInt();
        long K = in.nextInt();
        int Q = in.nextInt();
        long[] counts = new long[N];
        Arrays.fill(counts,0);
        for (int i = 0; i < Q; i++) counts[in.nextInt() - 1]++;
        for (int i = 0; i < N; i++) {
            if (K - ((long)Q - counts[i]) > 0L) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
