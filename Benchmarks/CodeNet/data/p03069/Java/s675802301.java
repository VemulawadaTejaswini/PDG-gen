import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int start = S.indexOf("#");
        int end = S.lastIndexOf(".");
        if (start < 0 || end < 0 || start > end) {
            out.println(0);
            out.close();
        } else {
            int blackAll = 0;
            for (int i = 0; i < N; i++) {
                if ('#' == S.charAt(i)) {
                    blackAll++;
                }
            }
            int ans = N;
            int black0ToI = 0;
            int whiteIplus1ToNminus1 = N - blackAll;
            for (int i = 0; i <= N; i++) {
                if (i == N) {
                    black0ToI = blackAll;
                    whiteIplus1ToNminus1 = 0;
                } else {
                    if ('#' == S.charAt(i)) {
                        black0ToI++;
                    } else {
                        whiteIplus1ToNminus1--;
                    }
                }
                ans = Math.min(ans, black0ToI + whiteIplus1ToNminus1);
            }
            out.println(ans);
            out.close();
        }
    }
}
