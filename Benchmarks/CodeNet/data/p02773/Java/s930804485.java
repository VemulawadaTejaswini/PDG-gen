import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CPoll solver = new CPoll();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPoll {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<String> list = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();

            in.nextLine();
            int max = 0;
            for (int i = 1; i <= n; i++) {
                String s = in.nextLine();
                if (!map.containsKey(s)) {
                    map.put(s, 0);
                }
                int count = map.get(s) + 1;
                max = Math.max(count, max);
                map.put(s, map.get(s) + 1);
            }

            for (String s : map.keySet()) {
                if (map.get(s) == max) {
                    list.add(s);
                }
            }

            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                out.println(list.get(i));
            }
        }

    }
}

