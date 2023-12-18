import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        String AC_STRING = "AC";

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int Q = in.nextInt();
            String S = in.next();
            int[] startArray = new int[Q];
            int[] endArray = new int[Q];
            for (int i = 0; i < Q; i++) {
                startArray[i] = in.nextInt();
                endArray[i] = in.nextInt();
            }

            List<Integer> acPos = new ArrayList<>();
            // make pos list

            String target = S;
            for (int j = 0; j < target.length() - AC_STRING.length() + 1; j++) {
                if (target.substring(j, j + 2).equals(AC_STRING)) {
                    acPos.add(j + 1);
                }
            }

            // count
            for (int i = 0; i < Q; i++) {
                int counter = 0;
                for (int j = 0; j < acPos.size(); j++) {
                    if (startArray[i] <= acPos.get(j) && acPos.get(j) + 1 <= endArray[i]) {
                        counter++;
                    }
                }
                out.println(counter);
            }
        }

    }
}

