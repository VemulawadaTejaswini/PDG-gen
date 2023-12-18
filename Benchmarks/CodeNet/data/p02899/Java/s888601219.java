import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGoToScool solver = new CGoToScool();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGoToScool {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Student> studentList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int ord = in.nextInt();
                studentList.add(new Student(i + 1, ord));
            }
            Collections.sort(studentList, Comparator.comparing(x -> x.order));

            for (int i = 0; i < studentList.size(); i++) {
                out.print(studentList.get(i).index + " ");
            }
        }

        class Student {
            int index;
            int order;

            public Student(int index, int order) {
                this.order = order;
                this.index = index;
            }

        }

    }
}

