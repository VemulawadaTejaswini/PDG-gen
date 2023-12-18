import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int v = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            v += a[i];
        }
        int res = 0;
        int t = (int)Math.ceil((v * 1.0) / (4 * m));
        for (int i = 0; i < n; i++) {
            if (a[i] >= t) res++;
        }
        if (res < m) System.out.println("No");
        else System.out.println("Yes");
    }
}

// x * 3 <= 16