import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();
        while (!".".equals(s)) {
            String t = in.next();
           // System.out.println("T* " + t);
            int res;
            int[] p = new int[4];
            for (int i = 0; i < 4; i++) {
                p[i] = t.charAt(i) - '0';
            }
            out.print(res = solve(s, p));

            int cnt = 0;
            for (int i = 0; i < 10000; i++) {
                int k = i;
                for (int j = 0; j < 4; j++) {
                    p[j] = k % 10;
                    k /= 10;
                }
                if (solve(s, p) == res) cnt++;
            }
            out.println(" " + cnt);

            s = in.next();
        }
        out.flush();
    }

    private static int solve(String s, int[] p) {
        if (s.length() == 1) {
            return p[s.charAt(0) - 'a'];
        }

        char op = s.charAt(1);
        int v0, v1, last = -1;

        if (s.charAt(2) != '[') {
            v0 = p[s.charAt(2) - 'a'];
            last = 2;
        } else {
            int depth = 1;
            for (int i = 3;; i++) {
                if (s.charAt(i) == '[') {
                    depth++;
                } else if (s.charAt(i) == ']') {
                    depth--;
                }
                if (depth == 0) {
                    last = i;
                    break;
                }
            }
            v0 = solve(s.substring(2, last + 1), p);
        }

        if (s.charAt(last + 1) != '[') {
            v1 = p[s.charAt(last + 1) - 'a'];
        } else {
            int depth = 1, last2 = -1;
            for (int i = last + 2;; i++) {
                if (s.charAt(i) == '[') {
                    depth++;
                } else if (s.charAt(i) == ']') {
                    depth--;
                }
                if (depth == 0) {
                    last2 = i;
                    break;
                }
            }
            v1 = solve(s.substring(last + 1, last2 + 1), p);
        }

        if (op == '+') {
            return v0 | v1;
        } else if (op == '*') {
            return v0 & v1;
        } else if (op == '^') {
            return v0 ^ v1;
        } else {
            throw new RuntimeException();
        }
    }
}

