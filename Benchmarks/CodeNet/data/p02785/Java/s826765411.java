import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

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
            int K = in.nextInt();

            long count = 0;

            List<Integer> hList = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int H = in.nextInt();
                hList.add(H);
                count += H;
            }
            hList.sort(Comparator.reverseOrder());

            for (int i = 0; i < K; i++) {
                if (i >= hList.size()) {
                    break;
                }
                count -= hList.get(i);
            }

            out.println(count);
        }
    }
}