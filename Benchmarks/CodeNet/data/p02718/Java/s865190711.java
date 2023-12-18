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
        for (int i = 0; i < n; i++) {
            if (a[i] >= (v / (4 * m))) res++;
            if (res >= m) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }


}

// x * 3 <= 16