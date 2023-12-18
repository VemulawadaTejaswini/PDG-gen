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
            String s = S.substring(start, end + 1);
            int ans1 = 0;
            int ans2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if ('.' == s.charAt(i)) {
                    ans1++;
                } else {
                    ans2++;
                }
            }
            out.println("ans1 = " + ans1 + ", ans2 = " + ans2);
            out.println(Math.min(ans1, ans2));
            out.close();
        }
    }
}
