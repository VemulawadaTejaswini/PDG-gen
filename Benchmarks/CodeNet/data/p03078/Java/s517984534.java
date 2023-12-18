import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), k = sc.nextInt();
        long[] a = new long[x], b = new long[y], c = new long[z];
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextLong();
        }
        for (int i = 0; i < z; i++) {
            c[i] = sc.nextLong();
        }
        long[] ab = new long[(int)1e6];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[i + y * j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);
        PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < Math.min(x * y, k); i++) {
            for (int j = 0; j < z; j++) {
                pq.add(ab[(int)1e6-1-i] + c[j]);
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll());
        }
    }
}
