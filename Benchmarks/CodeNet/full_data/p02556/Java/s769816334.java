//package Test;

import java.util.*;

public class Main {

    static class Solution {

        void solve(int s){

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        for(int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            a[i] = x + y;
            b[i] = x - y;
            c[i] = y - x;
            d[i] = -y - x;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        Arrays.sort(d);
        System.out.println(Math.max(Math.max(a[n-1] - a[0], b[n-1] - b[0]), Math.max(c[n-1] - c[0], d[n-1] - d[0])));
        // Solution solution = new Solution();
        // solution.solve(s);

    }
}
