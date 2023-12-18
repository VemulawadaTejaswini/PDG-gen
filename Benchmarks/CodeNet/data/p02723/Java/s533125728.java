import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
            String str = in.next();
            String[] ary = str.split("");
            boolean check1 = ary[2].equals(ary[3]);
            boolean check2 = ary[4].equals(ary[5]);
            out.print(check1 && check2 ? "Yes" : "No");
        }
    }
}