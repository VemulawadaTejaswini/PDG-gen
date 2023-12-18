import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        double v[] = new double[N];
        for(int i = 0; i < N; i++) {
            v[i] = (double)scan.nextInt();
        }
        Arrays.sort(v);

        for(int i = 0; i < N-1; i++) {
            v[i+1] = (v[i+1] + v[i]) / 2.0;
        }

        os.println(v[N-1]);
    }
}