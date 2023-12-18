import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long[] as, bs;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        as = new long[n];
        bs = new long[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextLong();
        for (int i = 0; i < n; i++)
            bs[i] = sc.nextLong();
        long sumA = Arrays.stream(as).sum();
        long sumB = Arrays.stream(bs).sum();
        if (sumA > sumB) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i <= sumB - sumA; i++) {
            System.out.println();
            if (Arrays.equals(as, bs)) {
                System.out.println("Yes");
                return;
            }
            if (i == sumB - sumA) break;
            boolean flaga = false;
            boolean flagb = false;
            for (int j = 0; j < n; j++) {
                if (flaga && flagb) break;
                if (!flaga && as[j] < bs[j]) {
                    flaga = true;
                    as[j] += 2;
                }
                if (!flagb && as[j] > bs[j]) {
                    flagb = true;
                    bs[j] += 1;
                }
            }
        }
        System.out.println("No");
    }
}
