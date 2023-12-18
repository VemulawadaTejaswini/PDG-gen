// sort間に合うんですかね？

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (a[num-1] == 0)
                cnt++;
            a[num-1]++;
        }

        int ans = 0;
        if (cnt > k) {
            Arrays.sort(a);
            ans = n;

            for (int i = 1; i <= k; i++) {
                ans -= a[a.length-i];
            }
        }

        System.out.println(ans);
    }
}