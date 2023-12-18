import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static int[][] a;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = in.nextInt(), x = in.nextInt() - 1, y = in.nextInt() - 1, b[] = new int[n + 1];
        a = new int[n][n];
        int mid = (x + y) / 2;
        for (int k = 0; k < n; k++)
            for (int i = k + 1; i < n; i++) {
                if (k <= x && i >= y) {
                    a[k][i] = i - y + x - k + 1;
                } else if (k > x && k < mid && i >= y) {
                    a[k][i] = k - x + 1 + i - y;
                } else if (k <= x && i < y && i > mid) {
                    a[k][i] = -k + x + 1 - i + y;
                } else if (k > x && i < y) {
                    a[k][i] = Math.min(k - x + y - k + 1, i - k);
                } else {
                    a[k][i] = i - k;
                }
            }
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                b[a[i][j]]++;
            }
        for (int i = 1; i < n; i++)
            out.println(b[i]);
        out.flush();

    }
}
