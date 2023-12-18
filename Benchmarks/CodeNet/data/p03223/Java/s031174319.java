import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        if (n == 2) {
            so.println(a[1] - a[0]);
            return;
        }
        
        int mid = a.length/2;
        long ans1 = calc(a, mid, true);
        long ans2 = calc(a, mid, false);
        
        so.println(Math.max(ans1, ans2));
    }
    
    static long calc(int[] a, int mid, boolean leftFirst) {
        long sum = 0;
        int l = 0;
        int r = a.length-1;
        int tail = a[mid];
        while (l < mid || r > mid) {
            if (l == mid) {
                sum += Math.abs(tail - a[r]);
                tail = a[r];
                r--;
            } else if (r == mid) {
                sum += Math.abs(tail - a[l]);
                tail = a[l];
                l++;
            } else if (leftFirst) {
                sum += Math.abs(tail - a[l]);
                tail = a[l];
                l++;
                leftFirst = false;
            } else {
                sum += Math.abs(tail - a[r]);
                tail = a[r];
                r--;
                leftFirst = true;
            }
        }
        return sum;
    }
}
