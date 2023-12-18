import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        MonstersBattleRoyale solver = new MonstersBattleRoyale();
        solver.solve(1, in, out);
        out.close();
    }

    static class MonstersBattleRoyale {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());

            }

            while (list.size() != 1) {
                Collections.sort(list);
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(list.get(0));
                for (int i = 1; i < list.size(); i++) {
                    Integer min = list.get(0);
                    if (list.get(i) % min == 0) {
                    } else {
                        tmp.add(list.get(i) % min);
                    }
                }
                list = tmp;
            }
            out.println(list.get(0));
        }

    }
}

