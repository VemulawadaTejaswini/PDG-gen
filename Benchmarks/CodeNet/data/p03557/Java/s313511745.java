import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(c);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int pointA = (Arrays.binarySearch(a, b[i]) >= 0) ? Arrays.binarySearch(a, b[i])
                    : ~Arrays.binarySearch(a, b[i]);
            int pointB = (Arrays.binarySearch(c, b[i]) >= 0) ? Arrays.binarySearch(c, b[i])
                    : ~Arrays.binarySearch(c, b[i]);
            pointB = n - pointB;
            ans += pointA * pointB;
        }
        System.out.println(ans);
    }
}
