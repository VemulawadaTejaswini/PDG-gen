import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//        int t = scr.nextInt();
//        while (t-- > 0)
        solve(scr);
    }


    static void solve(Scanner scr) {
        int n = scr.nextInt();
        int[] a = new int[n];
        int[] b = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = scr.nextInt();
            b[a[i]]++;
        }
        int s = 0;
        for (int i = 0; i < n+1; i++) {
            s += b[i] * (b[i] - 1) / 2;
        }

        for (int i = 0; i < n; i++) {
            int c = (b[a[i]] - 1) * (b[a[i]] - 2) / 2;
            int d = (b[a[i]]) * (b[a[i]] - 1) / 2;
            System.out.println(s - d + c);
        }


    }



}



