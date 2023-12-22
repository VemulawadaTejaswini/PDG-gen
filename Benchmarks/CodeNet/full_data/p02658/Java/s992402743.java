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
        long ans = 1;
        long A[] = new long[N];
        long max = (long)Math.pow(10, 18);

        for(int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
            if(A[i] == 0) {
                os.println(0);
                return;
            }
        }

        for(int i = 0; i < N; i++) {
            if(ans > max/A[i]) {
                os.println(-1);
                return;
            }
            ans *= A[i];
        }
        os.println(ans);

    }
}