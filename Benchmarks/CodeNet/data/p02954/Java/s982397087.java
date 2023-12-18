import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S = sc.next();
        sc.close();

        int N = S.length();
        char[] s = new char[N];
        s = S.toCharArray();
        long[] num = new long[N];
        for (int i = 0; i < N; i++) {
            num[i] = 1;
        }

        long[] list = new long[N];
        long[] sum = new long[2];
        int rStart = 0;
        int rEnd = 0;
        int lStart = 0;
        for (int i = 0; i < N; i++) {
            sum[(i - rStart) % 2] += num[i];
            if (s[i] == 'L') {
                if (i > 0 && s[i-1] == 'R') {
                    rEnd = i - 1;
                    lStart = i;
                }
                if (i + 1 == N || s[i+1] == 'R') {
                    if ((rEnd - rStart) % 2 == 0) {
                        list[rEnd] = sum[0];
                        list[lStart] = sum[1];
                    } else {
                        list[rEnd] = sum[1];
                        list[lStart] = sum[0];
                    }
                    sum[0] = 0;
                    sum[1] = 0;
                    rStart = i + 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (i != 0) {
                out.printf(" ");
            }
            out.printf("%d", list[i]);
        }
        out.printf("\n");
        out.flush();
    }
}
