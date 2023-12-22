import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;

    public static void solve(int n, int[] arr) {
        int highest = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < highest) sum += highest - arr[i];
            else highest = arr[i];
        }
        sb.append(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        sb = new StringBuilder();

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solve(n, arr);

        pw.print(sb);
        pw.flush();
        sc.close();
    }
}