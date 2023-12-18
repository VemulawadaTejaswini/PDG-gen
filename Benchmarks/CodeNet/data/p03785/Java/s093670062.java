import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int c = in.nextInt();
        int k = in.nextInt();
        int []t = new int[n];
        for (int i = 0; i < n; ++i) {
            t[i] = in.nextInt();
        }
        Arrays.sort(t);
        int people = 0;
        int start = 0;
        int res = 0;
        for (int tt : t) {
            if (people > 0 && tt - start > k) {
                ++res;
                people = 0;
            }
            if (people == 0) {
                start = tt;
            }
            ++people;
            if (people == c) {
                ++res;
                people = 0;
            }
        }
        if (people > 0) {
            ++res;
        }
        out.println(res);
    }
}
