import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESequenceDecomposing solver = new ESequenceDecomposing();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESequenceDecomposing {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int col = 0;
            // 塗れる大きさのうち最も大きいものを使う、存在しないのであれば新しい色を使えばよい。
            // 塗れるうち最も大きいものを探すには二分探索をすればいいことがわかる。
            // TreeMap.lowerKeyがいい感じであるのでこれを利用してみる。
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                if (tm.lowerKey(a) == null) {
                    col++;
                    tm.put(a, 1);
                } else {
                    tm.remove(tm.lowerKey(a));
                }
                tm.put(a, 1);
            }
            out.println(col);
        }

    }
}

