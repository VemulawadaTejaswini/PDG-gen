import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    public static int n, cnt = 0;
    public static String x;
    public static BigInteger bg;
    public static int a, b, c;
    public static int A, B, C;
    public static int pop(int x) {
        int cnt = 0;
        while (x > 0) {
            if (x % 2 == 1) {
                cnt++;
            }
            x /= 2;
        }
        return cnt;
    }
    public static int f(int x) {
        int cnt = 0;
        while (x > 0) {
            int p = pop(x);
            x %= p;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        n = Integer.parseInt(rd.readLine());
        x = rd.readLine();
        bg = new BigInteger(x, 2);
        for (int i = 0; i < n; i++) {
            if (x.charAt(i) == '1') {
                cnt++;
            }
        }
        if (cnt - 1 >= 1) {
            a = Integer.parseInt(bg.mod(new BigInteger(cnt + "").subtract(BigInteger.ONE)) + "");
        }
        if (cnt >= 1) {
            b = Integer.parseInt(bg.mod(new BigInteger(cnt + "")) + "");
        }
        c = Integer.parseInt(bg.mod(new BigInteger(cnt + "").add(BigInteger.ONE)) + "");
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                A = B = C = 1;
            } else {
                A *= 2;
                B *= 2;
                C *= 2;
                if (cnt - 1 >= 1) {
                    A %= (cnt - 1);
                }
                if (cnt >= 1) {
                    B %= cnt;
                }
                C %= (cnt + 1);
            }
            int katya = cnt;
            if (x.charAt(i) == '0') {
                katya++;
            } else {
                katya--;
            }
            if (katya == 0) {
                ans[i] = 0;
            } else {
                int init;
                if (katya == cnt - 1) {
                    init = (a - A + (cnt - 1)) % (cnt - 1);
                } else if (katya == cnt) {
                    init = 80085;
                } else {
                    init = (c + C) % (cnt + 1);
                }
                ans[i] = f(init) + 1;
            }
        }
        for (int x : ans) {
            System.out.print(x + " ");
        }
        pw.println();

        pw.flush();
        pw.close();
    }
}