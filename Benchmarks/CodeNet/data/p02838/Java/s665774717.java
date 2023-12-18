import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        long A[] = new long[N];
        for(int i = 0; i < N ; i++) {
            A[i] = scan.nextLong();
        }

        long ans = 0;
        for(int i = 0; i < N ; i++) {
            for(int j = i+1; j < N; j++) {
                ans += A[i]^A[j];
                ans %= 1000000007;
            }
        }

        os.println(ans);
    }

}