import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

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
        EYutori solver = new EYutori();
        solver.solve(1, in, out);
        out.close();
    }

    static class EYutori {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int k = in.nextInt();
            int c = in.nextInt();
            char[] s = in.next().toCharArray();
            ArrayList<Integer> saisoku = new ArrayList<>();
            ArrayList<Integer> saichi = new ArrayList<>();
            int time = -1;
            for (int i = 0; i < n; i++) {
                if (s[i] == 'o' && time < i) {
                    time = i + c;
                    saisoku.add(i + 1);
                }
                if (saisoku.size() == k) {
                    break;
                }
            }

            time = 10000000;
            for (int i = n - 1; i >= 0; i--) {
                if (s[i] == 'o' && i + c < time) {
                    time = i;
                    saichi.add(i + 1);
                }
                if (saichi.size() == k) {
                    break;
                }
            }

            //out.println(saisoku);
            saichi.sort(Comparator.naturalOrder());

            for (int i = 0; i < saisoku.size(); i++) {
                int x = saisoku.get(i);
                int y = saichi.get(i);
                if (x == y) {
                    out.println(x);
                }
            }
            //out.println(saichi);

        }

    }
}

