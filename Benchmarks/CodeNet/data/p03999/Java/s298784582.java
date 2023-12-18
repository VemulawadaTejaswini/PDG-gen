import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String S = sc.next();

        long sumall = 0;
        for (int i = 0; i < Math.pow(2, S.length()-1); i++) {
            String ans = S.substring(0, 1);
            long sum = 0;
            for (int j = 0; j < S.length()-1; j++) {
                if ((1 & (i >> j)) == 1) {
                    sum += Long.parseLong(ans);
                    ans = "";
                }
                ans += S.substring(j+1, j+2);
            }
            sum += Long.parseLong(ans);
            sumall += sum;
        }
        out.printf("%d\n", sumall);
        out.flush();
    }
}