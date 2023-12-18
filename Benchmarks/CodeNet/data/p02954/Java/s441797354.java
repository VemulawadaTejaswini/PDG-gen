import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        String s = in.next();

        boolean toRight = true;
        int l = 0;
        int mid = 0;
        int r = 0;
        int[] ans = new int[s.length()];
        char[] ch = s.toCharArray();
        for (int i=0; i < s.length(); i++) {
            if (toRight && ch[i] == 'L') {
                mid = i - 1;
                toRight = false;
            } else if (!toRight && ch[i] == 'R') {
                r = i - 1;
                toRight = true;
                ans[mid] += (r - mid) / 2 + 1;
                ans[mid+1] += (r - mid + 1) / 2;

                ans[mid] += (mid - l) / 2;
                ans[mid+1] += (mid - l + 1) / 2;

                l = i;
            }
        }

        r = s.length() - 1;
        ans[mid] += (r - mid) / 2 + 1;
        ans[mid+1] += (r - mid + 1) / 2;

        ans[mid] += (mid - l) / 2;
        ans[mid+1] += (mid - l + 1) / 2;

        StringBuilder a = new StringBuilder();
        for (int i=0; i < s.length() - 1; i++) {
            a.append(ans[i]).append(" ");
        }
        a.append(ans[s.length()-1]);
        out.println(a);
    }

}
