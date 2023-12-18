import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        long N = scan.nextInt();
        long answer = 0;
        if(N % 2 == 0) {
            answer = N / 2 * (N - 1);
        } else {
            answer = (N-1) / 2 * N;
        }
        os.println(answer);
    }
}