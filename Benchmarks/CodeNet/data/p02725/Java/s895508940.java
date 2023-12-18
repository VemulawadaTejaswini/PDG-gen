import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class Solver {
        public void solve(Scanner in, PrintWriter out) {
            int K = in.nextInt();
            int N = in.nextInt();
            List<Integer> ary1 = new ArrayList<>();
            List<Integer> ary2 = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int A = in.nextInt();
                if (A < K / 2) {
                    ary1.add(A);
                }
                else {
                    ary2.add(A);
                }
            }
            Collections.sort(ary1);
            Collections.sort(ary2);
            int ary1min = -1;
            int ary1max = -1;
            int ary2min = -1;
            int ary2max = -1;
            if (ary1.size() > 0) {
                ary1min = ary1.get(0);
                if (ary1.size() > 1) {
                    ary1max = ary1.get(ary1.size() - 1);
                }
            }
            if (ary2.size() > 0) {
                ary2min = ary2.get(0);
                if (ary2.size() > 1) {
                    ary2max = ary2.get(ary2.size() - 1);
                }
            }
            // 半分以下しかない場合
            if (ary2.size() == 0) {
                out.print(ary1max - ary1min);
            }
            // 半分以上しかない場合
            if (ary1.size() == 0) {
                out.print(ary2max - ary2min);
            }
            // 1つずつの場合
            if (ary1.size() == 1 && ary2.size() == 1) {
                out.print(Math.min(ary2min - ary1min, ary1min + K - ary2min));
            }
            // 半分以下が1、半分以上が複数
            if (ary1.size() == 1 && ary2.size() > 1) {
                out.print(Math.min(ary2max - ary1min, ary1min + K - ary2min));
            }
            // 半分以下が複数、半分以上が1
            if (ary1.size() > 1 && ary2.size() == 1) {
                out.print(Math.min(ary2min - ary1min, ary1max + K - ary2min));
            }
            // 両方複数ある場合
            if (ary1.size() > 1 && ary2.size() > 1) {
                out.print(Math.min(ary2max - ary1min, ary1max + K - ary2min));
            }
        }
    }
}