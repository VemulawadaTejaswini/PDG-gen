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
        if (start < 0 || end < 0) {
            out.println(0);
            out.close();
        } else {
            int ans1 = 0;
            int ans2 = 0;
            for (int i = start; i < N; i++) {
                if ('.' == S.charAt(i)) {
                    ans1++;
                }
            }
            for (int i = 0; i < end; i++) {
                if ('#' == S.charAt(i)) {
                    ans2++;
                }
            }
            out.println(Math.min(ans1, ans2));
            out.close();
        }
    }
}
