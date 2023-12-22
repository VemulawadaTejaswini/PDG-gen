import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = Integer.parseInt(sc.next());
            int[] a = new int[N];
            long sum = 0;
            for (int i = 0; i < N; i++) {
                a[i] = Integer.parseInt(sc.next());
                sum += a[i];
            }
            int Q = Integer.parseInt(sc.next());
            for (int i = 0; i < Q; i++) {
                Arrays.sort(a);
                int b = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());
                int cnt = 0;
                for (int j = 0; j < N; j++) {
                    if (a[j] > b) break;
                    if (a[j] == b) {
                        a[j] = c;
                        cnt++;
                    }
                }
                if (cnt > 0) {
                    sum += (c - b) * cnt;
                }
                System.out.println(sum);
            }
        }
    }
}