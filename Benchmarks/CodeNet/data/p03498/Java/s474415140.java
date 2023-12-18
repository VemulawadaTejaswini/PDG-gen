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
 * @author hsy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            List<TaskB.Pair> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 1; i < n; i++) {
                if (a[i] >= a[i - 1]) {
                    continue;
                }
                int tempindexMin = getMin(a);
                int tempindexMax = getMax(a);
                int Max = (a[i - 1] - a[i]) / a[tempindexMax] + ((a[i - 1] - a[i]) % a[tempindexMax] == 0 ? 0 : 1);
                if (a[tempindexMin] < 0) {
                    int num = Math.abs(a[tempindexMin]);
                    int Min = (a[i - 1] - a[i]) / num + ((a[i - 1] - a[i]) % num == 0 ? 0 : 1);
                    if (Max <= Min) {
                        TaskB.Pair pair = new TaskB.Pair();
                        for (int j = 0; j < Max; j++) {
                            pair.a = tempindexMax;
                            pair.b = i;
                            list.add(pair);
                        }
                    } else {
                        TaskB.Pair pair = new TaskB.Pair();
                        for (int j = 0; j < Min; j++) {
                            pair.a = tempindexMin;
                            pair.b = i - 1;
                            list.add(pair);
                        }
                    }
                } else {
                    TaskB.Pair pair = new TaskB.Pair();
                    for (int j = 0; j < Max; j++) {
                        pair.a = tempindexMax;
                        pair.b = i;
                        list.add(pair);
                    }
                }
            }
            if (list.size() == 0) {
                out.println("0");
            } else {
                out.println(list.size());
                for (TaskB.Pair pair : list) {
                    out.println((pair.a + 1) + " " + (pair.b + 1));
                }
            }
        }

        private int getMin(int[] a) {
            int pos = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] < a[pos]) {
                    pos = i;
                }
            }
            return pos;
        }

        private int getMax(int[] a) {
            int pos = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] > a[pos]) {
                    pos = i;
                }
            }
            return pos;
        }

        static class Pair {
            int a;
            int b;

        }

    }
}

