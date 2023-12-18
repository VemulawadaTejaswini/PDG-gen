import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class C {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    // static int dp[][] = new int[MAX][MAX];

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int M = Math.min(R,L+6000);
        int res = 1001000;
        for (int i=L;i<=M;i++) {
            for (int j=i+1;j<=M;j++) {
                res = Math.min(res, (i%2019)*(j%2019));
            }
        }
        out.println(res);
    }

    public static void main(String[] args) {
        new C()._main(args);
    }
}
