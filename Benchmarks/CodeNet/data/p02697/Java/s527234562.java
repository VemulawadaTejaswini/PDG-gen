import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        boolean[] used = new boolean[N];
        boolean subOne = false;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int left = i;
            if (used[N - 1 - i - i] || used[i + N - (N - 1 - i)]) {
                subOne = true;
            }
            int right = N - 1 - i - (subOne ? 1 : 0);
            res.append((left + 1));
            res.append(" ");
            res.append(right + 1);
            res.append("\n");
            used[right - left] = true;
            used[left + N - right] = true;
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(res);
        out.flush();
    }
}