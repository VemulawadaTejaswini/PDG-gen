import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        String S = sc.next();
        int[] t = new int[N];
        int l = 0;
        int r = 0;
        int result = 0;
        int count = 0;

        t[0] = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.substring(i, i + 2).equals("AC")) {
                count++;
            }
            t[i + 1] = count;
        }

        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            l = Integer.parseInt(sc.next());
            r = Integer.parseInt(sc.next());
            result = t[r - 1] - t[l - 1];
            out.println(result);
            out.flush();
        }
        sc.close();
    }
}