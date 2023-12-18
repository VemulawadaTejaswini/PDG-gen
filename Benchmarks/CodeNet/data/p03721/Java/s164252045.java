import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            TaskC.array[] arr = new TaskC.array[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = new TaskC.array();
                int a = in.nextInt();
                int b = in.nextInt();
                arr[i].data = a;
                arr[i].reps = b;
            }
            Arrays.sort(arr, new Comparator<TaskC.array>() {

                public int compare(TaskC.array o1, TaskC.array o2) {
                    return Integer.compare(o1.data, o2.data);
                }
            });
            for (int i = 0; i < n; ++i) {
                if (k > arr[i].reps)
                    k -= arr[i].reps;
                else {
                    out.println(arr[i].data);
                    break;
                }
            }
        }

        static class array {
            int data;
            int reps;

        }

    }
}

