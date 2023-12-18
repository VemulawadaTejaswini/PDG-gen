import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        int aidx = 0;
        long amax = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
            if (amax <= a[i]) {
                aidx = i;
                amax = a[i];
            }
        }
        System.out.println(amax + b[aidx]);
    }

}
