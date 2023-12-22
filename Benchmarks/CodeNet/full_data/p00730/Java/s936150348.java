import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.AbstractMap.SimpleEntry;
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
        CutTheCake solver = new CutTheCake();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class CutTheCake {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            int d = in.nextInt();
            if (n == 0 && w == 0 && d == 0) throw new UnknownError();
            LinkedList<State> list = new LinkedList<>();
            list.add(new State(0, 0, w, d));
            for (int i = 0; i < n; i++) {
                int p = in.nextInt() - 1;
                int s = in.nextInt();
                State tar = list.get(p);
                list.remove(p);
                AbstractMap.SimpleEntry<State, State> kv = tar.cut(s);
                if (kv.getKey().height * kv.getKey().width < kv.getValue().height * kv.getValue().width) {
                    list.add(kv.getKey());
                    list.add(kv.getValue());
                } else {
                    list.add(kv.getValue());
                    list.add(kv.getKey());
                }
            }
            int[] ar = new int[list.size()];
            int cnt = 0;
            for (State e : list) {
                ar[cnt++] = e.width * e.height;
            }
            Arrays.sort(ar);
            ArrayList<String> ansList = new ArrayList<>();
            for (int e : ar) ansList.add(Integer.toString(e));
            out.println(String.join(" ", ansList));
        }

        public class State {
            int x;
            int y;
            int width;
            int height;

            public State(int x, int y, int width, int height) {
                this.x = x;
                this.y = y;
                this.width = width;
                this.height = height;
            }

            AbstractMap.SimpleEntry<State, State> cut(int s) {
                s = s % ((this.height + this.width) * 2);
                State s1 = null, s2 = null;
                if (s - this.width - this.height - this.width > 0) {//1
                    s = s - this.width - this.height - this.width;
                    s = this.height - s;
                    s1 = new State(x, y, this.width, s);
                    s2 = new State(x, y + s, this.width, this.height - s);
                } else if (s - this.width - this.height > 0) {//2
                    s = s - this.width - this.height;
                    s = this.width - s;
                    s1 = new State(x, y, s, this.height);
                    s2 = new State(x + s, y, this.width - s, this.height);
                } else if (s - this.width > 0) {//3
                    s = s - this.width;
                    s1 = new State(x, y, this.width, s);
                    s2 = new State(x, y + s, this.width, this.height - s);
                } else {//4
                    s1 = new State(x, y, s, this.height);
                    s2 = new State(x + s, y, this.width - s, this.height);
                }
                return new AbstractMap.SimpleEntry<>(s1, s2);
            }

        }

    }
}