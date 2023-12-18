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
 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CExceptionHandling solver = new CExceptionHandling();
        solver.solve(1, in, out);
        out.close();
    }

    static class CExceptionHandling {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) list.add(in.nextInt());
            for (int i = 0; i < n; i++) {
                ArrayList list1 = new ArrayList<>(list);
                list1.remove(i);
                int max = (int) Collections.max(list1);
                out.println(max);
            }
        }

    }
}

