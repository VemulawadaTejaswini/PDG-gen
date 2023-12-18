import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    static final char Q = '?';
    static final char A = 'a';

    public static void main(String[] args) throws IOException {
        final String S;
        final String T;

        StringBuilder sb = new StringBuilder();

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            S = reader.readLine();
            T = reader.readLine();
            sb.append(S);
        }

        PrintWriter out = new PrintWriter(System.out);

        int sl = sb.length();
        int tl = T.length();

        boolean flg = true;
        for (int i = sl - tl; 0 <= i; i--) {
            for (int j = 0; j < tl; j++) {
                char sat = sb.charAt(i + j);
                char tat = T.charAt(j);
                if ((Q != sat) && sat != tat) {
                    flg = false;
                    break;
                }
            }

            if (flg) {
                sb.replace(i, i + tl, T);
                break;
            }
        }

        for (int i = 0; i < sl; i++)
            if (Q == sb.charAt(i)) sb.setCharAt(i, A);

        out.println(flg ? sb : "UNRESTORABLE");

        out.flush();
    }
}
