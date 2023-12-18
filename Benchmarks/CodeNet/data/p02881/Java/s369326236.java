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
        long N = scan.nextLong();

        long answer = 1000000000000l;

        for(long i = 1; i <= Math.sqrt((double) N); i++) {
            if(N % i == 0) {
                long j = N / i;
                long tempAns = i + j - 2;
                if(tempAns < answer) {
                    answer = tempAns;
                }
            }
        }

        os.println(answer);

    }
}