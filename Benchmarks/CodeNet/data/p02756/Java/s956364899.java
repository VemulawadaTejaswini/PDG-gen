import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        StringFormation solver = new StringFormation();
        solver.solve(1, in, out);
        out.close();
    }

    static class StringFormation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();

            List<String> result = new ArrayList<>();
            result.add(s);

            int q = in.nextInt();
            boolean reverse = false;
            for (int i = 0; i < q; i++) {
                int type = in.nextInt();
                if (type == 1) {
                    reverse = !reverse;
                } else {
                    int ope = in.nextInt();
                    String f = in.next();

                    if (ope == 1) {
                        if (!reverse) {
                            // add prefix
                            result.add(0, f);
                        } else {
                            // add suffix
                            result.add(f);
                        }
                    } else {
                        if (!reverse) {
                            // add suffix
                            result.add(f);
                        } else {
                            // add prefix
                            result.add(0, f);
                        }
                    }
                }
            }
            if (reverse) {
                Collections.sort(result);
            }
            out.append(String.join("", result));
        }

    }
}

