import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int maxi = n, maxi2 = n;
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] >= a[maxi]) {
                maxi2 = maxi;
                maxi = i;
            } else if (a[i] >= a[maxi2]) {
                maxi2 = i;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i == maxi ? a[maxi2] : a[maxi]);
        }
    }
}