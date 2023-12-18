
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] reqs = new int[m][2];

        for (int i = 0; i < m; i++) {
            reqs[i] = new int[]{sc.nextInt(), sc.nextInt()};
        }

        Arrays.sort(reqs, (a1, a2) -> a1[1] - a2[1]);
//        debug(reqs);

        int count = 0;
        int max = 0;
        for (int i = 0; i < m; i++) {
            int[] req = reqs[i];
            if (max <= req[0]) {
                max = req[1];
                count++;
            }
        }
        System.out.println(count);

        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
