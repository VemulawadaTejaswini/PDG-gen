import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] num = new int[200010];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            num[a[i]]++;
        }

        long ans = 0;
        for (int i = 0; i < 200010; i++) {
            if (num[i] <= 1) {
                continue;
            }
            ans += num[i] * (num[i] - 1) / 2;
        }
// System.out.println(ans);
        for (int i = 0; i < n; i++) {
            System.out.println(ans - ((num[a[i]] - 1)));
        }

        

        sc.close();
    }
}