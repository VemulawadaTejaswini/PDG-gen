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
        int N = scan.nextInt();
        int K = scan.nextInt();
        int p[] = new int[N];
        for(int i = 0; i < N ; i++)
            p[i] = scan.nextInt();

        int i = 0;
        double ans = 0;
        double window = 0;
        for(i = 0; i < K; i++) {
            window += prob(p[i]);
        }

        ans = window;

        for(; i < N; i++) {
            window -= prob(p[i-K]);
            window += prob(p[i]);
            ans = Math.max(window, ans);
        }

        os.println(ans);
    }

    static double prob(int p) {
        return (double)((p+1)*p)/(double)(2*p);
    }
}