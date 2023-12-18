import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        PriorityQueue<Integer> A = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < N; i++) {
            A.add(scan.nextInt());
        }

        for(int i = 0; i < M; i++) {
            int temp = A.poll();
            A.add((int)Math.floor((double)temp / 2.0));
        }

        long sum = 0;
        for(int i = 0; i < N; i++) {
            sum += A.poll();
        }
        os.println(sum);
    }
}