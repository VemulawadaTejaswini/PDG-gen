import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

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
        PowerfulDiscountTickets solver = new PowerfulDiscountTickets();
        solver.solve(1, in, out);
        out.close();
    }

    static class PowerfulDiscountTickets {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>(n, (o1, o2) -> Integer.compare(o2, o1));
            for (int i = 0; i < n; i++) {
                pq.add(in.nextInt());
            }
            while (m > 0) {
                Integer max = pq.poll();
                max /= 2;
                m--;
                pq.add(max);
            }
            long result = 0;
            for (Integer integer : pq) {
                result += integer;
            }
            out.println(result);
        }

    }
}

