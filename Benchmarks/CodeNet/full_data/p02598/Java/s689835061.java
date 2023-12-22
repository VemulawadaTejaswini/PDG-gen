//Created by Aminul on 8/2/2020.

import org.omg.CORBA.WrongTransaction;

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        pw.println(binarySearch(n, k, arr));

        pw.close();
    }

    static boolean check(int n, int k, int[] arr, int lim) {
        long cnt = 0;
        for (int i : arr) {
            if(i > lim) cnt += (i - 1) / lim;
        }
        return cnt <= k;
    }

    static int binarySearch(int n, int k, int[] arr) {
        int l = 1, r = (int) 1e9 + 5, res = r;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (check(n, k, arr, mid)) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}