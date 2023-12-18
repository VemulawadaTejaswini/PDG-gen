import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=0; i<n; ++i) {
            a[i] = sc.nextInt();
        }
        int Max = a[0];
        int ans = 1;
        for (int i=1; i<n; ++i) {
            if (a[i]>=Max) {
                ++ans;
            }
            Max = Math.max(Max, a[i]);
        }
        System.out.println(ans);
    }
}
