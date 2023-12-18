import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[5];
        long p = sc.nextLong();
        for (int i = 0; i<5; i++) {
            a[i] = sc.nextInt();
        }

        long min = a[0];
        for (int i = 0; i<5; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }

        long result = 4 + roundUp(p, min);

        System.out.println(result);
        sc.close();
    }

    public static long roundUp(long num, long divisor) {
    return (num + divisor - 1) / divisor;
}
}