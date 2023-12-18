import java.util.Scanner;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = Integer.parseInt(in.next());
        int A = Integer.parseInt(in.next());
        int B = Integer.parseInt(in.next());

        int sum = 0;
        for (int i=1; i<=N; i++) {
            int n = i;
            int digSum = 0;
            while (n > 0) {
                digSum += n % 10;
                n /= 10;
            }
            if (digSum >= A && digSum <= B)
                sum += i;
        }
        out.println(sum);
    }
}
