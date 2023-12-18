import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
            int N = in.nextInt();
            Set<Long> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                long A = in.nextLong();
                set.add(A);
            }
            out.println(N == set.size() ? "YES" : "NO");
        }
    }
}