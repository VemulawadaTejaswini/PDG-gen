import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for (int i= 0;i<n+1;i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0;i<n;i++) {
            b[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = n - 1; i >=0; i--) {
            ans += Math.min(a[i+1], b[i]);
            int dis = b[i] - a[i+1];
            if (dis > 0) {
              if (a[i] > dis) {
                int dis2 = a[i] - dis;
                a[i] -= dis2;
                ans += dis2;
              } else {
                ans+=a[i];
                a[i] = 0;
              }
            }
        }
        System.out.println(ans);
    }
}
