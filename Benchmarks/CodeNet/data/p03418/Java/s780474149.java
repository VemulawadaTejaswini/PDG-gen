import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long ans = 0;

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k==0) {
            out.print(n*n);
            out.flush();
            return;
        }

        for (int i=1; i<=n; i++) {
            long div = n / i;
            long remain = n % i;
            ans += (long)div * Math.max(0, i-k);
            ans += (long)Math.max(0, remain-k+1);
        }


        out.print(ans);
        out.flush();
    }
}