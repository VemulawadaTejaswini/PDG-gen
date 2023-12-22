import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter prnt = new PrintWriter(System.out);
        StringTokenizer st;
        String S = read.readLine();
        String T = read.readLine();
        prnt.println(getMinimumChange(S, T));


        prnt.close();
    }

    static int getMinimumChange(String S, String T) {
        int res = T.length();
        for (int i = 0; i < (S.length() - T.length() + 1); i++) {
            int count = 0;
            for (int j = 0; j < T.length(); j++) {
                // System.out.println(S.charAt(i+j) + " " + T.charAt(j));
                if (S.charAt(i + j) != T.charAt(j)) {
                    count++;
                }
            }
            res = Math.min(res, count);
        }
        return res;
    }
}