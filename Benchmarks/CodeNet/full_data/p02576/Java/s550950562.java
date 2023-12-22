import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;

    public static void solve(int n, int x, int t) {
        if (n % x == 0) sb.append(n / x * t);
        else sb.append((n / x + 1) * t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        sb = new StringBuilder();

        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();

        solve(n, x, t);

        pw.print(sb);
        pw.flush();
        sc.close();
    }
}