import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            Integer[] map = new Integer[200000];
            Arrays.fill(map, 0);
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();

                map[a]++;
            }

            Arrays.sort(map, Comparator.reverseOrder());
            int index = 1;
            int cnt = 0;
            for (int element : map) {
                if (element != 0) {
                    if (index <= k) {
                        index++;
                    } else {
                        cnt += element;
                    }
                }
            }

            out.print(cnt);

        }

    }
}

