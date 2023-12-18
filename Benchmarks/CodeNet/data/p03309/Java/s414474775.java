

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = Integer.parseInt(in.nextLine());
        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.nextLine();
//        for (int i = -30; i < 30; i++) {
//            System.out.println(f(arr, i) + " " + i);
//        }
        int lo = lowerBound(arr, true);
        int lo2 = lowerBound(arr, false);
        System.out.println(Math.min(f(arr, lo), f(arr, lo2)));
    }

    private static int lowerBound(int[] arr, boolean positive) {
        int lo = positive ? 0 : -(int) 1e9;
        int hi = positive ? (int) 1e9 : 0;
        while (lo + 1 < hi) {
            int mid = lo + hi >> 1;
            if (positive) {
                if (f(arr, mid) > f(arr, mid + 1)) {
                    lo = mid - 1;
                } else {
                    hi = mid;
                }
            } else {
                if (f(arr, mid) < f(arr, mid - 1)) {
                    lo = mid;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return hi;
    }

    private static int f(int[] arr, int b) {
        int res = 0;
        for (int value : arr) {
            res += Math.abs(value - ++b);
        }
        return res;
    }
}
