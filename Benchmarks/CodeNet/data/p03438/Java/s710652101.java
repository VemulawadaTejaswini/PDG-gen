import java.io.*;
import java.util.*;

public class main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long diff = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            diff -= a[i];
        }
        for (int i = 0; i < n; ++i) {
            b[i] = in.nextInt();
            diff += b[i];
        }
        int num = 0;
        for (int i = 0; i < n; ++i) if (a[i] < b[i]) {
            num += (b[i] - a[i] + 1) / 2;
        }
        System.out.println((num <= diff) ? "Yes" : "No");
    }
}