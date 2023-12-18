import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;


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

            int h = in.nextInt();
            int w = in.nextInt();

            String[] strs = new String[h];

            in.nextLine();
            for (int i = 0; i < strs.length; ++i) {
                strs[i] = in.nextLine();
            }


            String border = "";
            for (int j = 0; j < w + 2; ++j) {
                border += "#";
            }

            out.println(border);

            for (int i = 0; i < h; ++i) {
                out.println("#" + strs[i] + "#");
            }

            out.println(border);


        }

    }
}

