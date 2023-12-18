import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }

        long ts = 1;
        long as = 1;
        for (int i = 0; i < n; i++) {
            long nn = Math.max((ts + t[i] - 1) / t[i], (as + a[i] - 1) / a[i]);
            ts = nn * t[i];
            as = nn * a[i];
        }
        System.out.println(ts + as);
    }

}
