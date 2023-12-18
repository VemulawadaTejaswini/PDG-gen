import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Collections;

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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            StringBuilder[] s = new StringBuilder[N];
            for (int i = 0; i < N; i++) {
                s[i] = new StringBuilder(in.next());
            }
            long counter = 0;
            sortAll(s);
            Map<String, Integer> mp = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if (!mp.containsKey(s[i].toString())) {
                    mp.put(s[i].toString(), 0);
                } else {
                    System.out.println(mp.keySet() + ":" + s[i]);
                    mp.put(s[i].toString(), mp.get(s[i].toString()) + 1);
                }
            }

            for (String key : mp.keySet()) {
                if (mp.get(key) > 0) {
                    int setNum = mp.get(key);
                    counter += setNum * (setNum + 1) / 2;
                }
            }
            out.println(counter);
        }

        static void sortAll(StringBuilder[] strArray) {
            for (int i = 0; i < strArray.length; i++) {
                List<String> s1List = new ArrayList<>();
                StringBuilder s1 = strArray[i];
                for (int j = 0; j < s1.length(); j++) {
                    s1List.add(String.valueOf(s1.charAt(j)));
                }
                Collections.sort((s1List));
                for (int j = 0; j < s1List.size(); j++) {
                    s1.setCharAt(j, s1List.get(j).toCharArray()[0]);
                }

            }
        }

    }
}

