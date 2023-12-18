import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        long[] diff = new long[n-1];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }
        long s = 0;
        for (int i = 0; i < n-1; i++) {
            s += a[i];
            sum -= a[i];
//            System.out.println(sum + " " + s);
            diff[i] = Math.abs(sum - (s));
        }
        Arrays.sort(diff);
        System.out.println(diff[0]);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
