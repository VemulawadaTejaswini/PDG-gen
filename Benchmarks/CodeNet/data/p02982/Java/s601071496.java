import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final int MAX = 300;
    InputStream in = System.in;
    PrintStream out = System.out;
    static int x[][] = new int[MAX][MAX];

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        for (int i=0;i<N;i++) {
            for (int j=0;j<D;j++) {
                x[i][j] = sc.nextInt();
            }
        }
        int res=0;
        for (int i=0;i<N;i++) {
            for (int j=i+1;j<N;j++) {
                long sum=0;
                for (int d=0;d<D;d++) {
                    long p = x[i][d] - x[j][d];
                    sum += p*p;
                }
                double p = Math.sqrt(sum);
                if (p==(int)p) res++;
            }
        }
        out.println(res);
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
