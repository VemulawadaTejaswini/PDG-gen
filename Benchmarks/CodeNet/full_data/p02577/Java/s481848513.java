import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;

    public static void solve(String n) {
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }
        if (sum % 9 == 0) sb.append("Yes");
        else sb.append("No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        sb = new StringBuilder();

        String n = sc.next();

        solve(n);

        pw.print(sb);
        pw.flush();
        sc.close();
    }
}