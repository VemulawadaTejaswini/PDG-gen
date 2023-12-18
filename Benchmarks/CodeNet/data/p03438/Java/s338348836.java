import java.util.*;

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

        long diffNum = 0;
        for (int i = 0; i < n; i++) {
            if (as[i] > bs[i]) {
                diffNum += (as[i] - bs[i]);
            } else if (as[i] < bs[i]) {
                diffNum += (bs[i] - as[i]) / 2;
            }
        }
        if (diffNum <= sumB - sumA) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}