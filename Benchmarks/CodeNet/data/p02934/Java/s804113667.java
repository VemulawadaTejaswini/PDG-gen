import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i< n; i++) {
            a[i] = sc.nextInt();
        }
        double ans = 0;
        for (int i : a) {
            ans += (double) 1 / i;
        }
        System.out.println((double) 1/ ans);

    }
}
