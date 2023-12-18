import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int ai = 0;
        int ci = n - 1;
        long total = 0;
        for (int i = 0; i < n; i++) {
            while (ai < n && a[ai] < b[i]) {
                ai++;
            }
            ai--;
            while (ci >= 0 && c[ci] > b[i]) {
                ci--;
            }
            ci++;
            long num = ai + 1;
            num *= (n - ci);
            total += num;
        }

        System.out.println(total);
    }
}