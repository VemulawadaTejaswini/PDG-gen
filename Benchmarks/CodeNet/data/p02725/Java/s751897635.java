import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        int n = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        sc.close();
        Arrays.sort(a);

        long dif = k;
        for (int i = 0; i < a.length; i++) {
            long b = a[i] - a[0];
            long c = a[n - 1] - a[i];

            long d = k;
            if (b >= c) {
                d = b;
            } else {
                d = c;
            }
            if (dif > d) {
                dif = d;
            }
        }

        System.out.println(dif);
    }
}
