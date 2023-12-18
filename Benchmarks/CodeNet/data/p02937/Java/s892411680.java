import java.io.*;

/**
 * Created by Ayushi on 18/08/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        String t = r.readLine();
        r.close();
        char[] a = t.toCharArray();
        int sl = s.length();
        int tl = t.length();
        int x, c, ans;
        c = -1;
        ans = 0;
        for (int i = 0; i < tl; i++) {
            x = s.indexOf(a[i], c);
            if (x == -1) {
                ans += sl - c;
                c = 0;
                x = s.indexOf(a[i]);
                if (x == -1) {
                    ans = -1;
                    break;
                }
            }
            ans += x-c;
            c = x;
        }

        System.out.println(ans);
    }
}
